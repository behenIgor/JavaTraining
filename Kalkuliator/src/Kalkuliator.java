import java.util.Scanner;

public class Kalkuliator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		double chyslo_1, chyslo_2, rezultat;
		String diya;
		
		System.out.println("������ ����� �����: ");
		chyslo_1 = Double.parseDouble(scan.nextLine());
		
		System.out.println("������ ����� �����: ");
		chyslo_2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("������ �� (+ - * /): ");
		diya = scan.nextLine();
		
		if(diya.equals("/") && chyslo_2 == 0)
		{
			System.out.println("ĳ����� �� ���� �� ����������!");
		}
		if(diya.equals("+") || diya.equals("������"))
		{
			rezultat = chyslo_1 + chyslo_2;
			//System.out.println("���� ����� = " + rezultat);
		}
		else if (diya.equals("-") || diya.equals("������"))
		{
			rezultat = chyslo_1 - chyslo_2;
			//System.out.println("г����� ����� = " + rezultat);
		}
		else if (diya.equals("*") || diya.equals("���������"))
		{
			rezultat = chyslo_1 * chyslo_2;
			//System.out.println("������� ����� = " + rezultat);
		}
		else if (diya.equals("/") || diya.equals("�������"))
		{
			rezultat = chyslo_1 / chyslo_2;
			//System.out.println("������ ����� = " + rezultat);
		}
		else
		{
			rezultat = 0;
			System.out.println("�� ����� ��������� ��!");
			 
		}
	
		System.out.println("���������:  " + rezultat);
		
		scan.close();
	}
}

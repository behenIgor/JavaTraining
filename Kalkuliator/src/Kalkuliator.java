import java.util.Scanner;

public class Kalkuliator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		double chyslo_1, chyslo_2, rezultat;
		String diya;
		
		System.out.println("Введіть перше число: ");
		chyslo_1 = Double.parseDouble(scan.nextLine());
		
		System.out.println("Введіть друге число: ");
		chyslo_2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("Введіть дію (+ - * /): ");
		diya = scan.nextLine();
		
		if(diya.equals("/") && chyslo_2 == 0)
		{
			System.out.println("Ділення на нуль не припустиме!");
		}
		if(diya.equals("+") || diya.equals("додати"))
		{
			rezultat = chyslo_1 + chyslo_2;
			//System.out.println("Сума чисел = " + rezultat);
		}
		else if (diya.equals("-") || diya.equals("відняти"))
		{
			rezultat = chyslo_1 - chyslo_2;
			//System.out.println("Різниця чисел = " + rezultat);
		}
		else if (diya.equals("*") || diya.equals("помножити"))
		{
			rezultat = chyslo_1 * chyslo_2;
			//System.out.println("Добуток чисел = " + rezultat);
		}
		else if (diya.equals("/") || diya.equals("поділити"))
		{
			rezultat = chyslo_1 / chyslo_2;
			//System.out.println("Частка чисел = " + rezultat);
		}
		else
		{
			rezultat = 0;
			System.out.println("Ви ввели помилкову дію!");
			 
		}
	
		System.out.println("Результат:  " + rezultat);
		
		scan.close();
	}
}

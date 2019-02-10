import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	//������������� �������� Lotto

	public static void main(String[] args) {

		// 1. �������� �������� �� �����������
		String[] chyslaVidKorystuvacha = OtrymatyVvedenniaVidKorystuvacha();

		int iKilkistSpivpadin = 0;
		int iKilkistRozigrashiv = 0;

		while(iKilkistSpivpadin !=6)
		{
			iKilkistRozigrashiv++;

			// 2. �������� �������
			int [] tsejRozigrash = ProvestyRozigrash();

			// 3. ��������� ����� �� ����������� �� ���������
			iKilkistSpivpadin = PerevirytyRezultat(chyslaVidKorystuvacha, tsejRozigrash);

			if(iKilkistSpivpadin > 4)
			{
				// 4. ������� ���������
				String vsiChyslaRozigrashu = KonvertuvatyMasyvVTekst(tsejRozigrash);

				System.out.println("� "+ iKilkistRozigrashiv + " �������� ������� (" + vsiChyslaRozigrashu +"):" + iKilkistSpivpadin);
			}
		}
	}
	public static String[] OtrymatyVvedenniaVidKorystuvacha()
	{
		// 1. �������� �������� �� �����������
		System.out.println("����� 6 ����� ����� ���� (�� 1 �� 54): ");
		Scanner scan = new Scanner(System.in);
		String chysla = scan.nextLine();
		scan.close();
		String[] strMasyvVVedenyhChysel = chysla.split(","); // �������� ����� � String �� ������� �� ����� "����"(����� ���� ���� ����) � �������� � �����

		return strMasyvVVedenyhChysel;
	}

	public static int[] ProvestyRozigrash()
	{
		// 2. �������� �������
		int[] tsejRozigrash = new int[6];
		Random r = new Random();
		int iChysloRozigrashu = 0;
		while(iChysloRozigrashu != 6)  //���� ������� �� ������� 6 �����
		{
			boolean chysloVzheIsnuje = false;
			int tseChyslo = r.nextInt(54) + 1; //������� � Random .nextInt() ����������� ������� ����� �������� �� �����������( ��� �� 0 �� 53 �������), ���� ����� ������� (+1)

			for(int isnujucheChyslo: tsejRozigrash ) //��������� �� ��������� ��������� ��������� �����(������������ ����� ����� (�� �������)) � ������ tsejRozigrash � ���������� � ����� isnujucheChyslo
			{
				if(isnujucheChyslo == tseChyslo)    //���� �������� ����� ������� � ��� ��������
				{
					chysloVzheIsnuje = true;
					break;
				}

			}
			if (chysloVzheIsnuje != true)           // ���� �� �������
			{
				tsejRozigrash[iChysloRozigrashu++] = tseChyslo; // ��� ������� ����� � ����� 
				// ��� ����� iChysloRozigrashu++ �������� � ������(� � ����������� ���� ������ [iChysloRozigrashu])
			}
		}
		return tsejRozigrash;
	}

	public static int PerevirytyRezultat(String[] strMasyvVVedenyhChysel, int[] tsejRozigrash) // � ��� ����� ������� ������� 2 ���������
	{
		// 3. ��������� ����� �� ����������� �� ���������
		int iKilkistSpivpadin = 0;
		for (int k = 0; k < strMasyvVVedenyhChysel.length; k++) //��������� ����� ����� �� �������
		{
			int chyslo = Integer.parseInt(strMasyvVVedenyhChysel[k]); //����������� �������� ������������ ����� � int �� ����������� ����� k
			for (int tseVygrashneChyslo: tsejRozigrash)    //��������� ����� tsejRozigrash �������������� ����� tseVygrashneChyslo
			{ 
				if (chyslo == tseVygrashneChyslo) // ���� ����� ����������
				{
					iKilkistSpivpadin++;          // ����� ������� ��������
				}
			}
		}
		return iKilkistSpivpadin;
	}

	public static String KonvertuvatyMasyvVTekst(int[] chysla)
	{
		// 4. ������� ���������
		String vsiChyslaRozigrashu = "";
		for (int Chyslo: chysla)   // �������� �� ����� ����� �� ������ ��� ���������
		{
			vsiChyslaRozigrashu = vsiChyslaRozigrashu + Chyslo + " ";  //������� �� �������� �������� � 1 String, �� �� ������������ �����(���� ��� ������, ��� �� ����� ������ .ValueOf ��� ������� int???)
		}
		return vsiChyslaRozigrashu ;
	}

}


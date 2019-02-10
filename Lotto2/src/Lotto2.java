import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	//Вдосконалення програми Lotto

	public static void main(String[] args) {

		// 1. Отримати введення від користувача
		String[] chyslaVidKorystuvacha = OtrymatyVvedenniaVidKorystuvacha();

		int iKilkistSpivpadin = 0;
		int iKilkistRozigrashiv = 0;

		while(iKilkistSpivpadin !=6)
		{
			iKilkistRozigrashiv++;

			// 2. Провести розіграш
			int [] tsejRozigrash = ProvestyRozigrash();

			// 3. Перевірити числа від користувача на співпадіння
			iKilkistSpivpadin = PerevirytyRezultat(chyslaVidKorystuvacha, tsejRozigrash);

			if(iKilkistSpivpadin > 4)
			{
				// 4. Вивести результат
				String vsiChyslaRozigrashu = KonvertuvatyMasyvVTekst(tsejRozigrash);

				System.out.println("У "+ iKilkistRozigrashiv + " розіграші співпало (" + vsiChyslaRozigrashu +"):" + iKilkistSpivpadin);
			}
		}
	}
	public static String[] OtrymatyVvedenniaVidKorystuvacha()
	{
		// 1. Отримати введення від користувача
		System.out.println("Введіь 6 чисел через кому (від 1 до 54): ");
		Scanner scan = new Scanner(System.in);
		String chysla = scan.nextLine();
		scan.close();
		String[] strMasyvVVedenyhChysel = chysla.split(","); // розділяєм числа в String на частини по знаку "кома"(можна будь який знак) і заганяєм в масив

		return strMasyvVVedenyhChysel;
	}

	public static int[] ProvestyRozigrash()
	{
		// 2. Провести розіграш
		int[] tsejRozigrash = new int[6];
		Random r = new Random();
		int iChysloRozigrashu = 0;
		while(iChysloRozigrashu != 6)  //поки кількість не досягне 6 чисел
		{
			boolean chysloVzheIsnuje = false;
			int tseChyslo = r.nextInt(54) + 1; //оскільки в Random .nextInt() максимальне вказане число діапазону не враховується( тут від 0 до 53 включно), тому додаєм одиницю (+1)

			for(int isnujucheChyslo: tsejRozigrash ) //перевіряєм на випадкову генерацію однакових чисел(проганяється кожне число (по порядку)) з масиву tsejRozigrash і записується в змінну isnujucheChyslo
			{
				if(isnujucheChyslo == tseChyslo)    //якщо наступне число співпадає з вже існуючим
				{
					chysloVzheIsnuje = true;
					break;
				}

			}
			if (chysloVzheIsnuje != true)           // якщо не співпадає
			{
				tsejRozigrash[iChysloRozigrashu++] = tseChyslo; // тоді записуєм число в масив 
				// або можна iChysloRozigrashu++ записвти в іншому(а в попередньму буде просто [iChysloRozigrashu])
			}
		}
		return tsejRozigrash;
	}

	public static int PerevirytyRezultat(String[] strMasyvVVedenyhChysel, int[] tsejRozigrash) // в цей метод потрібно предати 2 параметри
	{
		// 3. Перевірити числа від користувача на співпадіння
		int iKilkistSpivpadin = 0;
		for (int k = 0; k < strMasyvVVedenyhChysel.length; k++) //проганяєм масив чисел по порядку
		{
			int chyslo = Integer.parseInt(strMasyvVVedenyhChysel[k]); //перетворюєм введений користувачем масив в int по порядковому числу k
			for (int tseVygrashneChyslo: tsejRozigrash)    //проганяєм масив tsejRozigrash використовуючи змінну tseVygrashneChyslo
			{ 
				if (chyslo == tseVygrashneChyslo) // якщо числа співпадають
				{
					iKilkistSpivpadin++;          // рахуєм кількість співпадінь
				}
			}
		}
		return iKilkistSpivpadin;
	}

	public static String KonvertuvatyMasyvVTekst(int[] chysla)
	{
		// 4. Вивести результат
		String vsiChyslaRozigrashu = "";
		for (int Chyslo: chysla)   // виводимо на екран числа що випали при генерації
		{
			vsiChyslaRozigrashu = vsiChyslaRozigrashu + Chyslo + " ";  //оскільки всі значення заганяєм в 1 String, то не використовуєм масив(хоча все працює, але чи треба робити .ValueOf для значень int???)
		}
		return vsiChyslaRozigrashu ;
	}

}


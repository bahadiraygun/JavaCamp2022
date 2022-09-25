package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// 220-284
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;

		if (number1 <= 1 && number2 <= 1) {
			System.out.println("Lütfen 2 ya da 2'den büyük bir sayı giriniz!");
			return;
		}
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 = total2 + i;
			}
		}
		if (total1 == number2 && total2 == number1) {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır.");
		} else {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayı değillerdir!");
		}
	}

}

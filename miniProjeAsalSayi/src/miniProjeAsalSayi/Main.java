package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 17;
		// int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrimeNumber = true;

		if (number < 1) {
			System.out.println("Lütfen 2 ya da 2'den büyük bir sayı giriniz!");
			return;
		}
		if (number == 1) {
			System.out.println("Lütfen 2 ya da 2'den büyük bir sayı giriniz!");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		if (isPrimeNumber) {
			System.out.println(number + " asal bir sayıdır.");
		} else {
			System.out.println(number + " asal bir sayı değildir!");
		}
	}

}

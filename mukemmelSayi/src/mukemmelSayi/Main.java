package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 --> 1,2,3
		// 28 --> 1,2,4,7,14
		int number = 29;
		int total = 0;

		if (number <= 1) {
			System.out.println("Lütfen 2 ya da 2'den büyük bir sayı giriniz!");
			return;
		}
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (total == number) {
			System.out.println(number + " mükemmel bir sayıdır.");
		} else {
			System.out.println(number + " mükemmel bir sayı değildir!");
		}

	}

}

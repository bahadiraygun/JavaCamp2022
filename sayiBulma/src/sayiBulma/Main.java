package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int search = 5;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == search) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			System.out.println(search + " sayısı listede mevcuttur");
		} else {
			System.out.println(search + " sayısı listede mevcut değildir!");
		}
	}

}

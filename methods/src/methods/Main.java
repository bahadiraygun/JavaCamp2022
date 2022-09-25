package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

//camel casing
	public static void sayiBulmaca() {
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
			mesajVer("Sayı mevcuttur: " + search);
		} else {
			mesajVer("Sayı mevcut değildir: " + search);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}

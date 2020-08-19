package framework.selenium.loop;

public class Loops {

	public static void main(String[] args) {
		// testeFor(10);
		// testeWhile();
		doWhile();

	}

	public static void testeFor(int maxLoop) {

		for (int i = 0; i < maxLoop; i++) {
			System.out.println("Número do contador: " + i);

		}

	}

	public static void testeWhile() {

		int i = 0;

		while (i < 10) {
			System.out.println("Ainda está no loop");

			i++;

		}

		System.out.println("Saiu do loop");
	}

	public static void doWhile() {

		int i = 0;

		do {
			System.out.println("Ainda está");
			i++;

		} while (i < 10);

		System.out.println("Saiu");
	}
}

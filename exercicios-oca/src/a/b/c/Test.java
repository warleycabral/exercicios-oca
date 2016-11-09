package a.b.c;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder original = new StringBuilder(
				"Bom dia");
		StringBuilder invertida = new StringBuilder();

		for (int i = original.length(); i > 0; i--) {
			invertida.append(original.substring(i - 1, i));
		}

		System.out.println(invertida);

	}

}

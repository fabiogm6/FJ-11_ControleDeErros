public class TesteErroEmVoltaDoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In�cio do Main");
		metodo1();
		System.out.println("Fim do Main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];

		try {
			for (int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro no For: " + e);
		}

		System.out.println("fim do metodo2");
	}
}
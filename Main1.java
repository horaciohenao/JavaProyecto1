import java.util.Scanner;

public class main1 {

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
		
		// Declarar Arrays
		byte[] bytes = new byte[5];
		bytes[0] = -128;
		bytes[1] = 0;
		bytes[2] = 127;
		bytes[3] = 10;
		bytes[4] = 20;

		char[] characters = new char[5];
		characters[0] = 'a';
		characters[1] = 'b';
		characters[2] = 'c';
		characters[3] = 'd';
		characters[4] = 'e';

		short[] shorts = new short[5];
		shorts[0] = -32768;
		shorts[1] = 32767;
		shorts[2] = 10000;
		shorts[3] = 20000;
		shorts[4] = 30000;

		int[] integers = new int[5];
		integers[0] = -2147483648;
		integers[1] = 2147483647;
		integers[2] = 1000000000;
		integers[3] = 1555555555;
		integers[4] = 2000000000;

		long[] longs = new long[5];
		longs[0] = 922337209;
		longs[1] = 12937123;
		longs[2] = 398123;
		longs[3] = -321391283;
		longs[4] = -12321341;

		float[] floats = new float[5];
		floats[0] = 3.14159265358979323846f;
		floats[1] = 0.1234567898765432f;
		floats[2] = 2.2f;
		floats[3] = 1.61803398875f;
		floats[4] = 6.0f;

		double[] doubles = new double[5];
		doubles[0] = 3.141592653589793;
		doubles[1] = 2.392173918273;
		doubles[2] = 123.123;
		doubles[3] = 301267327481923.98172938789172839481237981230;
		doubles[4] = 1.0;

		Object[] objetos = new Object[5];
		objetos[0] = "Hola";
		objetos[1] = 123;
		objetos[2] = 'a';
		objetos[3] = 2.2f;
		objetos[4] = true;

		String[] strings = new String[5];
		strings[0] = "Hola";
		strings[1] = "mundo";
		strings[2] = "Java";
		strings[3] = "programacion";
		strings[4] = "lenguaje";

		// Imprimir valores
		System.out.println("\n= Valores de los arrays =\n");
		System.out.println("\n= Bytes =\n");
		for ( int i = 0; i < bytes.length; i++) {
			System.out.println("Valor en el espacio " + i + ": " + bytes[i]);
		}
		System.out.println("\n= Characters =\n");
		for ( int i = 0; i < characters.length; i++) {
			System.out.println("Valor en el espacio " + i + ": " + characters[i]);
		}
		System.out.println("\n= Shorts =\n");
		for ( int i = 0; i < shorts.length; i++) {
			System.out.println("Valor en el espacio " + i + ": " + shorts[i]);
		}
		System.out.println("\n= Integers =\n");
		for ( int i = 0; i < integers.length; i++) {
			System.out.println("Valor en el espacio " + i + ": " + integers[i]);
		}
		System.out.println("\n= Longs =\n");
		for ( int i = 0; i < longs.length; i++) {
			System.out.println("Valor en el espacio " + i + ": " + longs[i]);
		}
		System.out.println("\n= Floats =\n");
		for ( int i = 0; i < floats.length; i++) {
			System.out.println("Valor en el espacio " + i + ": " + floats[i]);
		}
		System.out.println("\n= Doubles =\n");
		for ( int i = 0; i < doubles.length; i++) {
			System.out.println("Valor en el espacio " + i + ": " + doubles[i]);
		}
		System.out.println("\n= Objetos =\n");
		for ( int i = 0; i < objetos.length; i++) {
			System.out.println("Valor en el espacio " + i + ": " + objetos[i]);
		}
		System.out.println("\n= Strings =\n");
		for ( int i = 0; i < strings.length; i++) {
			System.out.println("Valor en el espacio " + i + ": " + strings[i]);
		}

	}

}


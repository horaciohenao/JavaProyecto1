import java.util.Scanner;
import java.util.Arrays;

public class main3 {

	public static void infoLenguajes(Object[][] matriz) { // Info matriz
    Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            System.out.println("\n= Fila " + (i+1) + " =\n");
            for (int j = 0; j < 5; j++) {
                System.out.print("Datos para la columna " + matriz[0][j] + ": ");
                matriz[i][j] = scanner.nextLine();
            }
        }
    }
    
    public static boolean buscarLenguaje(String nombreLenguaje, Object[][] matriz) { // Buscar lenguaje
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][0] != null && matriz[i][0].equals(nombreLenguaje)) {
                return true;
            }
        }
        return false;
    }

	public static String posicion(String nombreLenguaje, Object[][] matriz) { // Obtener posicion
			for (int i = 1; i < 8; i++) {
				for (int j = 0; j < 5; j++) {
					if (matriz[i][j] != null && matriz[i][j].equals(nombreLenguaje)) {
						return "La posicion es [" + i + ":" + j + "]";
					}
				}
			}
        return "null";
	}
	
	public static Object[] obtenerFila(int fila, Object[][] matriz) throws Exception {
        if (fila < 1 || fila >= matriz.length) {
            throw new Exception("La fila no existe");
        }
        return matriz[fila];
    }
    
    public static Object[] obtenerColumna(int columna, Object[][] matriz) throws Exception {
        if (columna < 0 || columna >= matriz[0].length) {
            throw new Exception("La columna no existe");
        }
        Object[] datos = new Object[matriz.length - 1];
        for (int i = 1; i < matriz.length; i++) {
            datos[i - 1] = matriz[i][columna];
        }
        return datos;
    }

    public static Object[] obtenerValorFila(int fila, int columna, Object[][] matriz) throws Exception {
        if (fila < 1 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length) {
            throw new Exception("No hay un valor con esa posicion");
        }
        Object[] registro = new Object[matriz[0].length];
        for (int i = 0; i < matriz[0].length; i++) {
            registro[i] = matriz[fila][i];
        }
        return new Object[] { matriz[fila][columna], registro };
    }
    

	public static void main(String[] args) {
	    
	    String ansString = "";
		int ansInt = 0;
		int ansInt2 = 0;
		boolean ansBool = false;

		Scanner scanner = new Scanner(System.in);

		Object [][] lenguajes = new Object[8][5];

		lenguajes[0][0] = "NOMBRE";
		lenguajes[0][1] = "AÑO";
		lenguajes[0][2] = "AUTOR";
		lenguajes[0][3] = "DETALLES";
		lenguajes[0][4] = "FRAMEWORKS";

		infoLenguajes(lenguajes);
		
		System.out.println("\n = Ingrese un nombre para buscar = \n");
		
		ansString = scanner.nextLine();

		ansBool = buscarLenguaje(ansString, lenguajes);
		
		if ( ansBool == true ) {
		    System.out.println( ansString + " esta en la matriz");
		} else {
		    System.out.println( ansString + " no esta en la matriz");
		}

		System.out.println(posicion(ansString, lenguajes));

		System.out.println("\n = Ingrese una fila para imprimir = \n");
		
		ansInt = scanner.nextInt();
		
		try {
            System.out.println("La fila en la pocision " + ansInt + " es: " + Arrays.toString(obtenerFila(ansInt, lenguajes)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

		System.out.println("\n = Ingrese una columna para imprimir = \n");
		
		ansInt = scanner.nextInt();
        
        try {
            System.out.println("La columna en la pocision " + ansInt + " es: " + Arrays.toString(obtenerColumna(ansInt, lenguajes)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

		System.out.println("\n = Ingrese una fila para buscar = \n");
		
		ansInt = scanner.nextInt();

		System.out.println("\n = Ingrese una columna para buscar = \n");
		
		ansInt2 = scanner.nextInt();
        
        try {
            System.out.println("Valor en la coordenada [" + ansInt + ":" + ansInt2 + "] es: " + Arrays.toString(obtenerValorFila(ansInt, ansInt2, lenguajes)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

	}
	
}

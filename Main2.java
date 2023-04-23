import java.util.Scanner;
import java.util.ArrayList;

public class main2 {

    public static int rdNum(int min, int max) { // Generar numero random
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

    public static int arrayCon(int[] array, char cond) { // Array Control
        int vnt = 0;
        int promedio = 0;
        int cache = 0;
        int cache2 = 0;
        int inArrPos = 0;

        if ( cond == '-' ) { // Menor venta
            vnt = 1000;
            for ( int i = 0; i < array.length; i++ ) {
                if (array[i] < vnt) {
                    vnt = array[i];
                }
            }

        } else if ( cond == '+') { // Mayor venta
            vnt = 1;
            for ( int i = 0; i < array.length; i++ ) {
                if (array[i] > vnt) {
                    vnt = array[i];
                }
            }
            
        } else if ( cond == 't' ) { // Total ventas
            vnt = 0;
            for ( int i = 0; i < array.length; i++ ) {
                if (array[i] > vnt) {
                    vnt += array[i];
                }
            }

        } else if ( cond == 'p' ) { // Ventas promedio
            for ( int i = 0; i < array.length; i++ ) {
                promedio += array[i];
            }
            vnt = promedio / array.length;

        } else if ( cond == 'c' ) { // Promedio mas cerca
            System.out.println("\n= Procesando =\n");
            for ( int i = 0; i < array.length; i++ ) {
                promedio += array[i];
            }
            promedio /= array.length;
            int[] cacheArray = new int[array.length];
            for ( int i = 0; i < array.length; i++ ) {
                cache = 0;
                if ( array[i] > promedio ) {
                    while ( cache != array[i] ) {
                        cache++;
                    } 
                } else {
                    while ( cache != array[i] ) {
                        cache--;
                    } 
                }
                cacheArray[inArrPos] = cache;
                inArrPos++;
                double porc = ((double)i / array.length) * 100.0;
                String fpor = String.format("%.2f", porc);
                System.out.println("Procesando " + fpor + "%");
            }
            for ( int i = 0; i < cacheArray.length; i++ ) {
                if (cacheArray[i] < vnt) {
                    cache = cacheArray[i];
                }
            }
            vnt = cache;

        } else if ( cond == 'h' ) { // ordenar de mayor a menor
            vnt = 1;
            for ( int i = 0; i < array.length; i++ ) {
                if (array[i] > vnt) {
                    vnt = array[i];
                }
            }
            cache = vnt;
            System.out.println("\n = Ordenado de mayor a menor = \n");
            while ( cache != -1 ) {
                for ( int i = 0; i < array.length; i++ ) { 
                    if ( array[i] == cache ) { 
                        System.out.println(array[i]); 
                    } 
                };
                cache--;
            }
            System.out.println("\n");

        } else if ( cond == 'l' ) { // ordenar de menor a mayor
            vnt = 1000;
            for ( int i = 0; i < array.length; i++ ) {
                if (array[i] < vnt) {
                    vnt = array[i];
                }
            }
            cache = vnt;
            System.out.println("\n = Ordenado de menor a mayor = \n");
            while ( cache != 1001 ) {
                for ( int i = 0; i < array.length; i++ ) { 
                    if ( array[i] == cache ) { 
                        System.out.println(array[i]); 
                    } 
                };
                cache++;
            }
            System.out.println("\n");

        } else if ( cond == 'r' ) { // desordenar valores
            System.out.println("\n");
            int[] cacheArray = new int[array.length];
            for ( int i = 0; i < array.length; i++ ) {
                cacheArray[i] = array[i];
            }
            for ( int i = 0; i < array.length*10; i++ ) {
                cache2 = rdNum(0, array.length - 1);
                while ( cacheArray[cache2] != -1 ) {
                    System.out.println(cacheArray[cache2]);
                    cacheArray[cache2] = -1;
                }
            }
            
        } else if ( cond == 'i' ) { // separar pares e impares
            ArrayList<Integer> cacheList = new ArrayList<>();
            ArrayList<Integer> cacheList1 = new ArrayList<>();
            for ( int i = 0; i < array.length; i++ ) {
                cache = array[i];
                if (cache % 2 == 0) {
                    cacheList.add(array[i]);
                } else {
                    cacheList1.add(array[i]);
                }
            }
            System.out.println("\n= Valores pares =\n");
            for (int i = 0; i < cacheList.size(); i++) {
                System.out.println(cacheList.get(i));
            }
            System.out.println("\n= Valores impares =\n");
            for (int i = 0; i < cacheList1.size(); i++) {
                System.out.println(cacheList1.get(i));
            }
        }
        return vnt;
    } 

    public static void prarray(int[] array) { // Print Array
        int noVentaInt = 0;
        System.out.println("\n = Ventas = \n");
        for ( int i = 0; i < array.length; i++ ) {
            noVentaInt = i + 1;
            System.out.println("Venta #" + noVentaInt + ": " + array[i]);
        }

    }

    public static void pressEnterToContinue() { 
        // https://stackoverflow.com/questions/19870467/how-do-i-get-press-any-key-to-continue-to-work-in-my-java-code
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        }  
        catch(Exception e) { }  
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int[] ventas = new int[rdNum(1, 20)];
        int noVenta = 0;
        char ans = 'a';

        System.out.println("\n = Ventas = \n");

        for ( int i = 0; i < ventas.length; i++ ) {
            ventas[i] = rdNum(1, 1000);
            noVenta = i + 1;
            System.out.println("Venta #" + noVenta + ": " + ventas[i]);
        }

        while ( true ) {
            System.out.println("Que desea consultar?\n");
            System.out.println(" - / menor venta | + mayor venta | t total de ventas | p promedio | c venta cercana al promedio | h ordenar de mayor a menor | l ordenar de menor a mayor | r imprimir en desorden | i separar valores pares e impares \n");
			ans = scanner.next().charAt(0);
            System.out.println("\nEste es el resultado: " + arrayCon(ventas, ans) + "\n");
            pressEnterToContinue();
            for ( int i = 0; i < 10; i++ ) { System.out.println("\n"); }; 
            prarray(ventas);

        }

    }
    
}

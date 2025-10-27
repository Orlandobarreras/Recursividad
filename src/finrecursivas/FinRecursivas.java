
package finrecursivas;

/**
 *
 * @author jobb2
 */
public class FinRecursivas {

  
    public static long fibonacci(int n) {
     
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
       
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static int mcd(int a, int b) {
        if (b == 0) return a;
        return mcd(b, a % b);
    }

   
    public static int count(Object datos[], int n, Object o) {
        if (n == 0) return 0;
        if (datos[n - 1].equals(o))
            return 1 + count(datos, n - 1, o);
        else
            return count(datos, n - 1, o);
    }


    public static void reverse(Object datos[], int inicio, int fin) {
        if (inicio >= fin) return;
        Object temp = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temp;
        reverse(datos, inicio + 1, fin - 1);
    }


    public static void main(String[] args) {

        System.out.println("Fibonacci de 5: " + fibonacci(5));
        System.out.println("Fibonacci de 40: " + fibonacci(40));

        System.out.println("MCD de 45 y 75: " + mcd(45, 75));
        System.out.println("MCD de 47 y 91: " + mcd(47, 91));

        Integer[] arreglo1 = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("Ocurrencias de 3: " + count(arreglo1, arreglo1.length, 3));
        System.out.println("Ocurrencias de 1: " + count(arreglo1, arreglo1.length, 1));

        Character[] arreglo2 = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
        System.out.println("Ocurrencias de 'C': " + count(arreglo2, arreglo2.length, 'C'));
        System.out.println("Ocurrencias de 'E': " + count(arreglo2, arreglo2.length, 'E'));

        Integer[] arreglo3 = {1, 2, 3, 4, 5};
        reverse(arreglo3, 0, arreglo3.length - 1);
        System.out.print("Arreglo invertido [1,2,3,4,5]: ");
        for (Object n : arreglo3) System.out.print(n + " ");
        System.out.println();

        Character[] arreglo4 = {'A', 'B', 'C', 'D'};
        reverse(arreglo4, 0, arreglo4.length - 1);
        System.out.print("Arreglo invertido ['A','B','C','D']: ");
        for (Object n : arreglo4) System.out.print(n + " ");
        System.out.println();
    }
    
}

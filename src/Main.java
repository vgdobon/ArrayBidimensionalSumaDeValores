import java.util.Scanner;

// Crear un array 4x4 de enteros.
// Las 3 primeras filas tendrán valores aleatorios.
// La cuarta, contendrá la suma de los elementos de cada columna
public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Cuantas filas quieres en tu array");
            int filas = sc.nextInt();
            System.out.println("Cuantas columnas quieres en tu array");
            int columnas = sc.nextInt();



            ArrayBidimensionalSuma miObjeto = new ArrayBidimensionalSuma(filas,columnas);
            miObjeto.suma();
            miObjeto.draw();
    }
}

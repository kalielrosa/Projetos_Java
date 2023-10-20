import java.util.Scanner;
import java.lang.Math;
public class vetor4 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Informe a capacidade: ");
       int n = teclado.nextInt();
       int[] A = new int[n];

       double[] B = new double[A.length];

    for (int i = 0; i < A.length; ++i){
        System.out.printf("\nInforme o %dº número de %d: ", (i+ 1), n);
        A[i] = teclado.nextInt();
        B[i] = Math.sqrt(A[i]);
    }
    teclado.close();

    for (int i = 0; i < A.length; ++i){
        System.out.printf("\nA = %d , B = %.2f", A[i], B[i]);
    }
    }
}

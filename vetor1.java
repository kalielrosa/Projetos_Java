import java.util.Scanner;
public class vetor1{
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Informe a capacidade: ");
       int n = teclado.nextInt();
       int[] A = new int[n];

       int[] B = A;

    for (int i = 0; i < A.length; ++i){
        System.out.printf("\nInforme o %dº número de %d: ", (i+ 1), n);
        A[i] = teclado.nextInt();
    }
    teclado.close();

    for (int i = 0; i < A.length; ++i){
        System.out.printf("\nA = %d , B = %d", A[i], B[i]);
    }
    }
}
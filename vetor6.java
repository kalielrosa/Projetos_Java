import java.util.Scanner;

public class vetor6 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Informe a capacidade: ");
       int n = teclado.nextInt();
       int[] A = new int[n];
       int[] B = new int[n];
       int[] C = new int[n];

    for (int i = 0; i < A.length; ++i){
        System.out.printf("\nInforme o %dº número de %d para o vetor A: ", (i+ 1), n);
        A[i] = teclado.nextInt();

    }

    for (int i = 0; i < B.length; ++i){
        System.out.printf("\nInforme o %dº número de %d para o Vetor B:  ", (i+ 1), n);
        B[i] = teclado.nextInt();
    }

    for (int i = 0; i < C.length; ++i){
        C[i]= A[i] + B[i];
        System.out.printf("\n C = %d ",C[i]);
    }
    teclado.close();
    }
}

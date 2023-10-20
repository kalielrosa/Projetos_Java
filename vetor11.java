import java.util.Scanner;

public class vetor11 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Informe a capacidade: ");
       int n = teclado.nextInt();
       int[] A = new int[n];
       int qtdd = 0;

    for (int i = 0; i < A.length; ++i){
        System.out.printf("\nInforme o %dº número de %d para o vetor A: ", (i+ 1), n);
        A[i] = teclado.nextInt();

    }

    for (int i = 0; i < A.length; ++i){
      if (i % 2 != 0){
        qtdd ++;
      }
    }

    System.out.printf("\nQuantidade de elementos pares no vetor A = %d ", qtdd);
    teclado.close();
    }  
}


import java.util.Scanner;//está importando o método Scanner
public class vetor3{ //cria classe 
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Informe a capacidade: ");
       int n = teclado.nextInt(); //vai solicitar a o usuário a capacidade
       int[] A = new int[n]; //vai receber a capacidade solicitada

       int[] B = new int[A.length]; // vai ser do mesmo tamanho que o vetor A

    for (int i = 0; i < A.length; ++i){ // vai entra no for 
        System.out.printf("\nInforme o %dº número de %d: ", (i+ 1), n); //imprimir 
        A[i] = teclado.nextInt();//vai perdir para digita os valores para o vetor A
        B[i] = A[i] * A[i]; // o vetor B vai se o quadrado do Vetor A
    }
    teclado.close();

    for (int i = 0; i < A.length; ++i){
        System.out.printf("\nA = %d , B = %d", A[i], B[i]); // vai imprimir o resultado com o Vetor A com os números solicitados
        // e o Vetor B com os números já ao quadrado
    }
    }
}

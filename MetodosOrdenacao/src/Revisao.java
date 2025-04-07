import java.util.Arrays;

public class Revisao {
    public static int[] maiorMenor(int[] A) {

        if (A.length % 2 != 0) {
            return null;
        }

        int[] resposta = new int[2];
        int[] subA = new int[A.length / 2];
        int[] subB = new int[A.length / 2];

        for (int i = 0; i < A.length / 2; i++) {
            subA[i] = A[i];
        }

        for (int i = A.length / 2; i < A.length; i++) {
            subB[i - A.length / 2] = A[i];
        }

        for (int i = 0; i < subA.length; i++) {
            for (int j = i + 1; j < subA.length; j++) {
                if (subA[i] > subA[j]) {
                    int temp = subA[i];
                    subA[i] = subA[j];
                    subA[j] = temp;
                }
            }
        }

        for (int i = 0; i < subB.length; i++) {
            for (int j = i + 1; j < subB.length; j++) {
                if (subB[i] > subB[j]) {
                    int temp = subB[i];
                    subB[i] = subB[j];
                    subB[j] = temp;
                }
            }
        }

        if (subA[0] < subB[0])
            resposta[0] = subA[0];
        else
            resposta[0] = subB[0];

        if (subA[subA.length - 1] > subB[subB.length - 1])
            resposta[1] = subA[subA.length - 1];
        else
            resposta[1] = subB[subB.length - 1];

        return resposta;
    }

    public static int[] comparaAosPares(int[] A) {
        int[] resp = new int[2];
        resp[0] = A[0];
        resp[1] = A[0];
        int[] vetor;
        // Se o array tiver um numero impar de elementos, duplicamos o último elemento
        if (A.length % 2 == 0) {
            vetor = Arrays.copyOf(A, A.length);
        } else { // se o array tiver tamanho ímpar
            vetor = Arrays.copyOf(A, A.length + 1);
            vetor[A.length] = vetor[A.length - 1];
        }
        // Separando em 2 subconjuntos : maiores e menores
        for (int i = 0; i < vetor.length / 2; i++) {
            if (vetor[i] > vetor[vetor.length - 1 - i]) {
                int aux = vetor[i];
                vetor[i] = vetor[vetor.length - 1 - i];
                vetor[vetor.length - 1 - i] = aux;
            }
        }
        // Encontrando o menor elemento
        resp[0] = vetor[0];
        for (int j = 1; j < vetor.length / 2; j++) {
            if (vetor[j] < resp[0])
                resp[0] = vetor[j];
        }
        // Encontrando o maior elemento
        resp[1] = vetor.length - 1;
        for (int k = vetor.length - 2; k >= vetor.length / 2; k--) {
            if (vetor[k] > resp[1])
                resp[1] = vetor[k];
        }
        return resp;
    }

        // Método recursivo para imprimir os elementos do vetor de trás para frente
        public static void printReverse(int[] A, int index) {
            // Caso base: se o índice for menor que 0, retorna
            if (index < 0) {
                return;
            }
            
            // Imprime o elemento atual
            System.out.println(A[index]);
            
            // Chama recursivamente para o próximo índice
            printReverse(A, index - 1);
        }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 11, 5, 6, 7, 9, 10 };
        int[] resposta = maiorMenor(A);
        System.out.println(resposta[0] + " - " + resposta[1]);
    }
}

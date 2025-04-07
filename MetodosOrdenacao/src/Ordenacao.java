public class Ordenacao {

    public int[] insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
        return vetor;
    }

    public int[] selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = temp;
        }
        return vetor;
    }

    public int[] bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        return vetor;
    }

    public int quantVogais(char[] letras, int n, int cont){
        if(n==0)
        return cont;
        if(letras[n-1] == 'a' || letras[n-1] == 'e' || letras[n-1] == 'i' || letras[n-1] == 'o' || letras[n-1] == 'u')
        cont++;
        return quantVogais(letras, n-1, cont);  
    }

    public static void main(String[] args) throws Exception {
        int desordenado[] = { 5, 10, 35, 2, 1, 8 };
        int vetor[] = { 5, 10, 35, 2, 1, 8 };
        int outroVetor[] = { 5, 10, 35, 2, 1, 8 };
        System.out.println("Vetor antes da ordenação: ");
        for (int i = 0; i < desordenado.length; i++) {
            System.out.print(desordenado[i] + " ");
        }
        System.out.println();

        int vetorOrdenadoInsertion[] = new Ordenacao().insertionSort(desordenado);
        System.out.println("Vetor depois da ordenação: ");
        for (int i = 0; i < vetorOrdenadoInsertion.length; i++) {
            System.out.print(vetorOrdenadoInsertion[i] + " ");
        }

        int vetorOrdenadoSelection[] = new Ordenacao().selectionSort(vetor);
        System.out.println("\nVetor depois da ordenação: ");
        for (int i = 0; i < vetorOrdenadoSelection.length; i++) {
            System.out.print(vetorOrdenadoSelection[i] + " ");
        }

        int vetorOrdenadoBubble[] = new Ordenacao().bubbleSort(outroVetor);
        System.out.println("\nVetor depois da ordenação: ");
        for (int i = 0; i < vetorOrdenadoBubble.length; i++) {
            System.out.print(vetorOrdenadoBubble[i] + " ");
        }
    }
}

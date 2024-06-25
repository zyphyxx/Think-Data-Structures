package _3_bubble_sort;

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[10000];

        for (int i = 0; i < vetor.length; i++){

            vetor [i] = (int) (Math.random() * vetor.length);
            //System.out.println(vetor[i]);
        }

        long inicio = System.currentTimeMillis();

        // COMPLEXIDADE DO ALGORITMO BUBBLE SORT O(N^2)

        int temp;
        for (int i = 0; i < vetor.length; i++){  // O(n)

            for (int j = i + 1; j < vetor.length; j++) {  // O(n)

                if (vetor[j] <= vetor[i] ) {

                    // temp recebe o valor do i
                    temp = vetor[i];
                    // i recebe o valor de j
                    vetor[i] = vetor[j];
                    // j recebe o valor de temp
                    vetor[j] = temp;

                }
            }
        }

        long fim = System.currentTimeMillis();
        System.out.println("tempo:" + (fim - inicio));
        System.out.println("Depois de ordenar utilizando o bubble sort:");

        for (int i = 0; i < vetor.length; i++){
            //System.out.println(vetor[i]);
        }

    }
}

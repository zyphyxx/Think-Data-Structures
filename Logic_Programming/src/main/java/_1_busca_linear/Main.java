package _1_busca_linear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] vetor = new int[8];

        for(int i = 0; i < vetor.length; i++ ) {

            vetor[i] = (int) Math.floor(Math.random() * 8);

            System.out.println(vetor[i]);

        }

        System.out.println("Qual numero vc busca ?");
        Scanner scanner = new Scanner(System.in);

        int buscado = scanner.nextInt();


        int indice = -1;

        for(int i = 0; i < vetor.length; i++ ) {
           if (buscado == vetor[i]) {
               indice = i;
           }
        }

        System.out.println(indice);
    }


}

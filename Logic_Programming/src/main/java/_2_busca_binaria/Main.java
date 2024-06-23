package _2_busca_binaria;

import java.util.Scanner;

public class Main {

    // uma das condições da busca binaria para garantir a qualidade de busca
    // 1 -  sempre tem que estar sorted ordenado.
    // 2 -  sempre tem que estar sorted ordenado.
    // 3 -  sempre tem que estar sorted ordenado kkkk

    //  pela planilha do excel grafico descobrimos que a busca binaria tem uma complexidade de  O(log n)
    // a melhor no caso seria O(1) mais O(log n) esta show de bola
    public static void main(String[] args) {

        int[] vetor = new int[1000000];

        for (int i= 0; i < vetor.length; i++){
            vetor[i] = i * 2;

            // System.out.println(vetor[i]);
        }

        System.out.println("qual numero voce busca ?");
        Scanner scanner = new Scanner(System.in);
        int buscado = scanner.nextInt();

        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length -1;
        int meio;
        int contador = 0;

        while(inicio <= fim){

            meio = ((inicio + fim) /2);
            contador++; // conta quantos teste a busca fez


            if (vetor[meio] == buscado){
                achou = true;
                break;
            } else if ( vetor[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }

        }
        System.out.println("quantidade de testes: " + contador);
        if (achou == true){
            System.out.println("Achou");
        } else {
            System.out.println("Não Achou");
        }

        scanner.close();
    }

}

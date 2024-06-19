package arrays_e_collections;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_Array_e_ForEach {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de provas do semestre:");
        int totalProvas = scanner.nextInt();

        System.out.println("Digite as notas do aluno:");

        double[] notas = new double[totalProvas];

        for (int i = 0; i < totalProvas; i++){
            System.out.println((i + 1) + " - Digite a nota:");
            notas[i] = scanner.nextDouble();
        }
        System.out.println("Notas do aluno = "+Arrays.toString(notas));

        double totalNotas = 0D;
        for (double nota : notas) {
            totalNotas += nota / totalProvas;
        }
        System.out.println("Média do aluno: "+ totalNotas);


    }
}

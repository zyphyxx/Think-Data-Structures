package arrays_e_collections;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matriz = new String[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println(i+" digite"+ j);
                matriz[i][j] = scanner.nextLine();

            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }



        scanner.close();

    }
}

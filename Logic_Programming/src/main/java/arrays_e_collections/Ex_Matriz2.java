package arrays_e_collections;

import java.util.Scanner;

public class Ex_Matriz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] products = new String[2][2];

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {

                System.out.println(i+" digite o codigo: "+j);
                products[i][j] = scanner.nextLine();
                System.out.println(i+"digite o produto: "+j);
                products[i][j] = scanner.nextLine();
            }

        }

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {

                System.out.println(products[i][j]);

            }

        }


        scanner.close();
    }
}

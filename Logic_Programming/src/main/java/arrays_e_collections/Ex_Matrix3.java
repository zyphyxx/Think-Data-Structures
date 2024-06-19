package arrays_e_collections;

import java.util.Scanner;

public class Ex_Matrix3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] products = new String[2][4];

        // exibir codigo do produto , o nome e a quantidade comprada, valor unitario e valor total

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {

                System.out.println(i+" nome do produto: "+j);
                products[i][j] = sc.nextLine();

            }
        }

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {

                System.out.println(products[i][j]);

            }

        }
        System.out.println("-------------------");

        for (String[]arr : products){
            for (String s : arr){
                System.out.println(s);
            }
        }


    }
}

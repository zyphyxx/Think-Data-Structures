package estruturas_de_selecao;

import java.util.Arrays;
import java.util.Scanner;

public class ExF_02 {

    /*
        Leia 3 valores, calcule a média aritmética
        entre eles e apresente o resultado.
     */


    public static int average(int firstValue, int secondValue, int thirdValue) {
        return (firstValue + secondValue + thirdValue) / 3;
    }


    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            int [] values = new int[3];

            System.out.println("Enter the three scores to calculate the average:");

            for (int i = 0; i < values.length; i++) {

                values[i] = scanner.nextInt();
            }

            int avg = ExF_02.average(values[0],values[1],values[2]);

            System.out.println("Average is: "+ avg);

            scanner.close();

        } catch (Exception e) {

            System.out.printf("msg: %s%ncause: %s%n", e.getMessage(), e.getCause());

        }



    }
}

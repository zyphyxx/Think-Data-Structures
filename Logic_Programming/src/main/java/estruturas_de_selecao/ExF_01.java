package estruturas_de_selecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExF_01 {

    /*
    Leia 4 valores, calcule a soma entre eles e
    apresente o resultado.
     */

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {

        int [] values = new int[4];

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Input the numbers to sum: ");

            for (int i = 0; i < values.length; i ++){
                values[i] = scanner.nextInt();
            }
            int avg = ExF_01.sum(values[0],values[1],values[2],values[3]);

            System.out.printf("The sum is: %s", avg);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter integer values.");
        }
    }
}

package arrays_e_collections;

import java.util.Arrays;

public class Ex_Array {

    public static void main(String[] args) {

        int[] notasAluno = new int[10];

        notasAluno [0] = 10;
        notasAluno [1] = 9;
        notasAluno [2] = 8;


        System.out.println(Arrays.toString(notasAluno));

        int totala = 0;
        for (int i = 0; i < notasAluno.length; i++){
            totala += notasAluno[i] /3;
        }
        System.out.println("for normal:"+totala);

        int totalb = 0;
        for (int nota: notasAluno
             ) {
            totalb += nota / 3;
        }
        System.out.println("foreach:" +totalb);
    }
}

package arrays_e_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_List2 {

    static class Frutas {

        private String name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> frutas = new ArrayList<>();

        boolean exit = true;
        while (exit) {

            System.out.println("Digite o nome da fruta: ");
            String nomeFruta = scanner.nextLine().toLowerCase();

            if (nomeFruta.equals("sair")) {
                exit = false;
            } else if (nomeFruta.equals("remover")){
                System.out.println("qual fruta voce quer remover: ");
                nomeFruta = scanner.nextLine().toLowerCase();
                frutas.remove(nomeFruta);
            } else {
                frutas.add(nomeFruta);
            }
        }

        for (String fruta : frutas){
            System.out.printf("Nome da fruta: %s%n",fruta);
        }
    }


}

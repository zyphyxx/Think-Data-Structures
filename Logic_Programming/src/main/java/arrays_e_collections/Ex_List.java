package arrays_e_collections;

import java.util.ArrayList;
import java.util.List;

public class Ex_List {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Edgar");
        nomes.add("Mendes");

        System.out.println(nomes);

        for (String nome : nomes){
            System.out.println(nome);
        }
        System.out.println("---------");
        nomes.add("Jesus");
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }


}

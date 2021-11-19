package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class EinkaufslisteApp {


    public static void main(String[] args) {

        ArrayList<Einkauf> einkaufsliste = new ArrayList<>();
        einkaufsliste.add(new Einkauf("Butter", 1.50));
        einkaufsliste.add(new Einkauf("Käse",3.50));
        einkaufsliste.add(new Einkauf("Fleisch", 10.50));

        System.out.println("sum = " + sum(einkaufsliste));
        HashSet<Einkauf> unique = unique(einkaufsliste);
        System.out.println("unique = " + unique);
        System.out.println("sum(unique) = " + sum(unique));


    }

    public static double sum(ArrayList<Einkauf> einkaufsliste){

       double sum = 0.0;

       for (Einkauf einkauf : einkaufsliste){
          sum += einkauf.getPreis();

        }
       return sum;

    }

    public static HashSet<Einkauf> unique (ArrayList<Einkauf>einkaufsliste){
        HashSet<Einkauf> list = new HashSet<>();
        list.addAll(einkaufsliste);

        return list;

    }

    public static double sum(HashSet<Einkauf> einkaufsliste){
        double sum = 0.0;
        for (Einkauf einkauf : einkaufsliste){
            sum += einkauf.getPreis();
        }
        return sum;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Producator prod = new Producator("Prod","Bucuresti", 1);
        Producator prod2 = new Producator("Prod2","Bucuresti", 2);
        Producator prod3 = new Producator("Prod3","Braila", 3);
        Producator prod4= new Producator("Proasdd2","Bucuresti", 10);
        Producator prod5 = new Producator("Proasdd2","Bucuresti", 15);
        Producator prod6 = new Producator("Proasdd2","Bucuresti", 15);
        Producator prod7 = new Producator("Prasdod2","Bucuresti", 100);


        List<Producator> listProducatori = new ArrayList<Producator>();
        listProducatori.add(prod);
        listProducatori.add(prod2);
        listProducatori.add(prod3);

        ProdusAlimentar salam = new ProdusAlimentar("06.11.2022",listProducatori);
        salam.calculPretMediu("Bucuresti", listProducatori);

    }


}
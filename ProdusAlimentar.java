import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProdusAlimentar extends Produs implements ICalcul<Producator>{

    private final String denumireProdus = null;
    private String dataExpirare = null;
    private List<Producator> producatori;

    public ProdusAlimentar(String dataExpirare, List<Producator> producatori) {
        this.dataExpirare = dataExpirare;
        this.producatori = producatori;
    }

    @Override
    public String genereazaDescriere() {
        return null;
    }

    @Override
    public void calculPretMediu(String localitate, List<Producator> producatori) {
        int counter = 0;
        double pret = 0.0;

        for(Producator prod: producatori){
            if(prod.getLocalitate().equals(localitate)){
                counter++;
                pret = pret + prod.getPretVanzare();
            }
        }

        double pretMediu = pret/counter;
        System.out.println(counter);
        System.out.println(pretMediu);

    }


}

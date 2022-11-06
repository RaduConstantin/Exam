public abstract class Produs implements Comparable<Produs> {

    public String tipProdus;
    public String unitateMasura;
    public int cantitate;


    public abstract String genereazaDescriere();

    @Override
    public int compareTo(Produs o) {
        if (unitateMasura.equals(o.unitateMasura)) {
            if (cantitate == o.cantitate) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}

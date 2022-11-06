public class Producator {

    private String denumire;
    private String localitate;
    private double pretVanzare;
    private final int codFiscal = 0;

    public Producator(String denumire, String localitate, double pretVanzare) {
        this.denumire = denumire;
        this.localitate = localitate;
        this.pretVanzare = pretVanzare;
    }

    public Producator(Producator obj){
        this.denumire = obj.denumire;
        this.localitate = obj.localitate;
        this.pretVanzare = obj.pretVanzare;
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public double getPretVanzare() {
        return pretVanzare;
    }

    public void setPretVanzare(double pretVanzare) {
        this.pretVanzare = pretVanzare;
    }

    public int getCodFiscal() {
        return codFiscal;
    }
}

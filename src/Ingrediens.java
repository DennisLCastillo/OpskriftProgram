public class Ingrediens {
    // Attributter (Skal altid sættes i PRIVATE)
    private String type;
    private double mængde;
    private String måleenhed;
    private double enhedsvægt;
    private double kcalPrGram;
    private double kjPrGram;

    private double antal;
    private int normalAntalPersoner = 4;

    //--------------------------------------------------------------------------------

    //Konstruktører
    public Ingrediens(String type, double mængde, String måleenhed, double enhedsvægt, double kcalPrGram, double kjPrGram) {
        this.type = type;
        this.mængde = mængde;
        this.måleenhed = måleenhed;
        this.enhedsvægt = enhedsvægt;
        this.kcalPrGram = kcalPrGram;
        this.kjPrGram = kjPrGram;
    }

    public Ingrediens(String type, double mængde, String måleenhed, double kcalPrGram, double kjPrGram) {
        this.type = type;
        this.mængde = mængde;
        this.enhedsvægt = mængde;
        this.kcalPrGram = kcalPrGram;
        this.måleenhed = måleenhed;
        this.kjPrGram = kjPrGram;
    }

    //--------------------------------------------------------------------------------

    // Getter & Setter

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMængde() {
        return mængde;
    }

    public void setMængde(double mængde) {
        this.mængde = mængde;
    }

    public String getMåleenhed() {
        return måleenhed;
    }

    public void setMåleenhed(String måleenhed) {
        this.måleenhed = måleenhed;
    }

    public double getEnhedsvægt() {
        return enhedsvægt;
    }

    public void setEnhedsvægt(double enhedsvægt) {
        this.enhedsvægt = enhedsvægt;
    }

    public double getKcalPrGram() {
        return kcalPrGram;
    }

    public void setKcalPrGram(double kcalPrGram) {
        this.kcalPrGram = kcalPrGram;
    }

    public double getKjPrGram() {
        return getKjPrGram();
    }

    public void setKjPrGram() {
        this.kjPrGram = kjPrGram;
    }

    public double getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public int getNormalAntalPersoner() {
        return normalAntalPersoner;
    }

    //--------------------------------------------------------------------------------

    // Beregninger mængde og pr. ingrediens

    public double beregnMængde(int antal) {
        double beregnMængde = mængde / normalAntalPersoner * antal;
        return beregnMængde;
    }

    public double beregnVægt(int antal) {
        double beregnVægt = enhedsvægt / normalAntalPersoner * antal;
        return beregnVægt;
    }

    public double beregnEnergi(int antal) {
        double beregnetEnergi = kcalPrGram / normalAntalPersoner * antal;
        return beregnetEnergi;
    }

    public double beregnetKiloJ(int antal) {
        double beregnetKj = kjPrGram / normalAntalPersoner * antal;
        return beregnetKj;
    }

}






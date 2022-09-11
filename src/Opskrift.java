//Information Expert!
public class Opskrift {

    //Attributter - ALTID PRIVATE

    private String type;
    private Ingrediens[] ingredienser;
    private double totalVægt = 0;
    private double totalEnergi = 0;
    private double totalKiloJ = 0;
    private int antal;

    //--------------------------------------------------------------------------------

    // Ingrediens Liste

    public Opskrift() {
        this.type = "Dette er opskriften på Sandkage";

        Ingrediens sukker = new Ingrediens("sukker", 150, "gram", 580, 2429);

        Ingrediens smør = new Ingrediens("smør", 100, "gram", 716, 3047);

        Ingrediens æg = new Ingrediens("æg", 2, "stykker", 100, 136, 569);

        Ingrediens hvedemel = new Ingrediens("hvedemel", 100, "gram", 364, 1523);

        Ingrediens bagepulver = new Ingrediens("bagepulver", 1, "teske", 5, 2, 8.4);

        Ingrediens vaniljesukker = new Ingrediens("vaniljesukker", 1, "teske", 2.3, 5.7, 25.1);

        this.ingredienser = new Ingrediens[]{sukker, smør, æg, hvedemel, bagepulver, vaniljesukker};
    }

    //--------------------------------------------------------------------------------

    //Getter & Setter

    public void setAntal(int antal) {
        this.antal = antal;
        for (Ingrediens ingrediens : ingredienser) {
            ingrediens.setAntal(antal);
        }
    }

    public String getType() {
        return type;
    }

    public Ingrediens[] getIngredienser() {
        return ingredienser;
    }

    //--------------------------------------------------------------------------------

    //Beregninger af total vægt/kcal/kj

    public double getTotalVægt() {
        for (Ingrediens ingrediens : ingredienser) {
            totalVægt += ingrediens.beregnVægt(antal);
        }
        return totalVægt;
    }

    public double getTotalEnergi() {
        for (Ingrediens ingrediens : ingredienser) {
            totalEnergi += ingrediens.beregnEnergi(antal);
        }
        return totalEnergi;
    }

    public double getTotalKiloJ() {
        for (Ingrediens ingrediens : ingredienser) {
            totalKiloJ += ingrediens.beregnetKiloJ(antal);
        }
        return totalKiloJ;
    }


}


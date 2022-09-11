import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //--------------------------------------------------------------------------------

        //Præsentation af programmet
        System.out.println("Velkommen til opskrift-programmet");
        System.out.println("----------------------------------");

        Opskrift opskrift = new Opskrift();
        System.out.println(opskrift.getType());

        //--------------------------------------------------------------------------------

        // Metode til at indlæse antal personer
        System.out.println("Hvor mange personer skal opskriften laves til?");
        Scanner scanner = new Scanner(System.in);
        int antal = scanner.nextInt();

        opskrift.setAntal(antal);

        for (Ingrediens ingrediens : opskrift.getIngredienser()) {
            ingrediens.setAntal(antal);
        }

        //--------------------------------------------------------------------------------


        // Metode til at udskrive den beregnede mængde
        System.out.println("Til " + antal + " personer, skal du bruge: ");
        System.out.printf("\n%-20s%-10s%-5s\n", "Navn", "Mængde", "Måleenhed");
        for (Ingrediens ingrediens : opskrift.getIngredienser()) {
            //System.out.println(ingrediens.beregnMængde(antal) + " " + ingrediens.getMåleenhed() + " " + ingrediens.getType());
            System.out.printf("%-20s%-10s%-5s\n", ingrediens.getType(), ingrediens.beregnMængde(antal), ingrediens.getMåleenhed());
        }

        System.out.println("\nVægten pr. ingrediens for" + " " + antal + " personer: ");

        // Metode til at udskrive den beregnede vægt
        System.out.printf("\n%-20s%-10s%-5s\n", "Navn", "Mængde", "Måleenhed");
        for (Ingrediens ingrediens : opskrift.getIngredienser()) {
            //System.out.println(ingrediens.getType() + " = " + ingrediens.beregnVægt(antal) + " gram ");
            System.out.printf("%-20s%-10s%-5s\n", ingrediens.getType(), ingrediens.beregnVægt(antal), "gram");
        }

        // Metode til at udskrive den beregnede energi
        System.out.println("\nEnergiindholdet pr. ingrediens for" + " " + antal + " personer: ");
        System.out.printf("\n%-18s%-20s%-10s\n", "Navn", "Mængde", "Måleenhed");
        for (Ingrediens ingrediens : opskrift.getIngredienser()) {
            //System.out.println(ingrediens.getType() + " = " + ingrediens.beregnEnergi(antal) + " kcal ");
            System.out.printf("%-18s%-20s%-10s\n", ingrediens.getType(), ingrediens.beregnEnergi(antal) + "/" + ingrediens.beregnetKiloJ(antal), " kcal/Kj");
        }

        //--------------------------------------------------------------------------------

        // Metode til at udskrive både den samlede vægt og energiindhold
        // Total vægt
        System.out.printf("\n%-35s%-20s", "Den samlede vægt er: ", opskrift.getTotalVægt() + " Gram ");
        // Total energi
        System.out.printf("\n%-35s%-20s", "Den samlede energiindhold er: ", opskrift.getTotalEnergi() + "/" + opskrift.getTotalKiloJ() + " Kcal/Kj");
    }
}
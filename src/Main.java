import tech.sahelcrea.services.Calculatrice;


public class Main {
    public static void main(String[] args) {

        // Créons une instance de notre classe Calculatrice
        Calculatrice calculatrice = new Calculatrice();

        int resultatAddition = calculatrice.addition(10, 5);
        System.out.println(resultatAddition);

        int resultatProduit = calculatrice.produit(9, 10);
        System.out.println(resultatProduit);
    }
}
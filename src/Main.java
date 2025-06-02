import tech.sahelcrea.services.Calculatrice;


public class Main {
    public static void main(String[] args) {

    // Créons une instance de notre classe calculatrice
        Calculatrice calculatrice = new Calculatrice();

        int resultatAddition = calculatrice.addition(10, 5);
        System.out.println(resultatAddition);
    }
}
package tech.sahelcrea.services;

public class Calculatrice {
    // Une méthode pour additionner deux nombres
    public int addition(int premierEntier, int secondEntier) {
        return premierEntier + secondEntier;
    }

    // Une méthode pour faire le produit de deux nombres
    public int produit(int premierEntier, int secondEntier) {
        return premierEntier * secondEntier;
    }

    // Une méthode pour effectuer les opérations
    public void operation(int premierEntier, int secondEntier, String operation) {
        int resultat = 0;

        if (operation.equals("1")) {
            resultat = addition(premierEntier, secondEntier);
            System.out.println("RESULTAT D'ADDITION: "+resultat);
        }
        else {
            resultat = produit(premierEntier, secondEntier);
            System.out.println("RESULTAT PRODUIT: "+resultat);
        }

    }
}

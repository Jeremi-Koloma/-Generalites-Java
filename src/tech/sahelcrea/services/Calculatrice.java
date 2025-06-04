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

    // une méthode pour le faire le modulo
    public int modulo(int premierEntier, int secondEntier) {
        return premierEntier % secondEntier;
    }

    // Une méthode pour effectuer les opérations
    public void operation(int premierEntier, int secondEntier, String operation) {
        int resultat = 0;

        if (operation.equals("1")) {
            resultat = addition(premierEntier, secondEntier);
            System.out.println("RESULTAT D'ADDITION: "+resultat);
        }
        else if (operation.equals("2")){
            resultat = produit(premierEntier, secondEntier);
            System.out.println("RESULTAT PRODUIT: "+resultat);
        }
        else {
            resultat = modulo(premierEntier, secondEntier);
            System.out.println("RESULTAT MODULO: "+resultat);
        }

    }

    // une méthode pour faire la table de multiplication
    public void tableDeMultiplication(int multiplicateur) {
        for (int i= 0; i < 10; i++) {
            System.out.println(multiplicateur + " * "+ Integer.parseInt(String.valueOf(i+1)) + " = "+ Integer.parseInt(String.valueOf(i+1)) * multiplicateur);
        }
    }
}

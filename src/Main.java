import tech.sahelcrea.services.Calculatrice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        // Créons une instance de notre classe Calculatrice
        Calculatrice calculatrice = new Calculatrice();

        // Lire les données saisies par l'utilisateur
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Quelle opération voulez-vous effectué ?");
        System.out.println("Pour addition, taper: 1");
        System.out.println("Pour produit, taper: 2");
        String operation = bufferedReader.readLine();

        System.out.println("Entrer le premier entier !");
        int premierEntier = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Entrer le second entier !");
        int secondEntier = Integer.parseInt(bufferedReader.readLine());

        int resultat = 0;
        if (operation.equals("1")) {
            resultat = calculatrice.addition(premierEntier, secondEntier);
            System.out.println("RESULTAT D'ADDITION: "+resultat);
        }else {
            resultat = calculatrice.produit(premierEntier, secondEntier);
            System.out.println("RESULTAT PRODUIT: "+resultat);
        }
    }
}
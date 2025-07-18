import tech.sahelcrea.services.Calculatrice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        // Lire les données saisies par l'utilisateur
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Quelle opération voulez-vous effectué ?");
        System.out.println("Pour addition, taper: 1");
        System.out.println("Pour produit, taper: 2");
        System.out.println("Pour le modulo, taper: 3");
        System.out.println("Pour Afficher une table de multiplication, taper: 4");
        String operation = bufferedReader.readLine();

        System.out.println("Entrer le premier entier !");
        int premierEntier = Integer.parseInt(bufferedReader.readLine());

        // Créons une instance de notre classe Calculatrice
        Calculatrice calculatrice = new Calculatrice();

        int secondEntier = 0;

        if (!operation.equals("4")) {
            System.out.println("Entrer le second entier !");
            secondEntier = Integer.parseInt(bufferedReader.readLine());

            calculatrice.operation(premierEntier, secondEntier, operation);
        }


        if(operation.equals("4")) {
            calculatrice.tableDeMultiplication(premierEntier);
        }
    }
}
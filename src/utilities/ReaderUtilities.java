package utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderUtilities {

    // Lire des données de l'utilisateur
    public int readChoice() throws IOException {
        // Appeler la méthode affichage d'instruction
        this.displayInstructions();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bufferedReader.readLine());
    }

    // une méthode pour afficher les instructions
    private void displayInstructions() {
        System.out.println("Bienvenu dans ce programme pour calculer les surfaces");
        System.out.println("Pour calculer la surface du cercle, taper 1");
        System.out.println("Pour calculer la surface du rectangle, taper 2");
        System.out.println("Pour calculer la surface du triangle, taper 3");
    }

}

package devoirs.devoir05;

import java.util.Scanner;

public class Devoir05 {
    public final static int MAX = 100;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int nbre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        Scanner nombreEcrit = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une valeur entre 1 et 100 : ");
        int valeur = scanner.nextInt();

        
        while (valeur != nbre) {
            if (valeur < 1 || valeur > 100) {
                System.out.print("Veuillez entrez un nombre valide : ");
                valeur = scanner.nextInt();
                continue;
            }
            if (valeur > nbre) {
                System.out.println("Trop grand");
                valeur = scanner.nextInt();
            } else if (valeur < nbre) {
                System.out.println("Trop petit");
                valeur = scanner.nextInt();
            } else if (valeur == nbre) {
                System.out.println("Trouvé !");
            }
        }
    }
}

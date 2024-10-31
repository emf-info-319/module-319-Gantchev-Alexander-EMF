package MesExecices;

import java.util.Scanner;

public class IntroMethodes {
    public static void main(String[] args) {
        debut();
        int nbr1 = demandeNombre();
        int nbr2 = demandeNombre();
        int nbr3 = demandeNombre();
        int somme = somme(nbr1, nbr2, nbr3);
        fin();
    }

    public static void debut() {
        System.out.println("Bonjour et bienvenu sur ce premier programme");
        System.out.println("On va vor les méthdes dans ce cours ");
    }

    public static void fin() {
        System.out.println(" Programme terminé");
    }

    public static int demandeNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int nbrMethode = scanner.nextInt();
        System.out.println("Merci, j'enregstre " + nbrMethode);
        return nbrMethode;
    }

    public static int somme(int nb1, int nb2, int nb3) {
        int resultatsomme = nb1 + nb2 + nb3;
        System.out.println("la somme est " + resultatsomme);
        return resultatsomme;
    }
}
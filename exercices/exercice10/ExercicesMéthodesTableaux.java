public class ExercicesMéthodesTableaux {
    public static void main(String[] args) {

        int[] tab = creeTableau(67);
        int[] tab1 = remplirtab(6767);
        int[] tab2 = remplirtabrandom(9);
        TailleTableau(tab);
        afficherTableau(tab2);
        trouverMinimum(tab2);
        trouverMaximum(tab2);
        compterFrequence(tab2, 0);
        calculerSomme(tab2);
        calculerMoyenne(tab2);
        remplacerValeur(tab2, 2, 3);
        trouverPremiereOccurrence(tab2, 0);
        trouverDerniereOccurrence(tab2, 0);
    }

    public static int[] creeTableau(int taille) {
        int[] tableau = new int[taille];
        return tableau;
    }

    public static int[] remplirtab(int taille) {
        int[] tablo = new int[taille];
        for (int i = 0; i < tablo.length; i++) {
            tablo[i] = 9;

        }
        return tablo;

    }

    public static int[] remplirtabrandom(int taille) {
        int[] tablo = new int[taille];
        for (int i = 0; i < tablo.length; i++) {
            tablo[i] = (int) (Math.random() * (3000 - 1));
        }
        return tablo;
    }

    public static int TailleTableau(int[] tab) {
        return tab.length;

    }

    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {

        }

    }

    public static int trouverMinimum(int[] tableau) {
        int minimum = tableau[0];

        for (int i = 1; i < tableau.length; i++) {

            if (tableau[i] < minimum) {
                System.out.println(i);
                minimum = tableau[i];

            }

        }
        System.out.println("le plus petit est " + minimum);
        return minimum;
    }

    public static int trouverMaximum(int[] tableau) {
        int maximum = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > maximum) {
                maximum = tableau[i];

            }
        }
        System.out.println("le plus grand est " + maximum);
        return maximum;
    }

    public static int compterFrequence(int[] tableau, int valeur) {
        int frequence = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                frequence++;
            }
        }
        return frequence;
    }

    public static int calculerSomme(int[] tableau) {
        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

    public static double calculerMoyenne(int[] tableau) {

        double somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }

        return somme / tableau.length;
    }

    public static void remplacerValeur(int[] tableau, int valeurCible, int nouvelleValeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurCible) {
                tableau[i] = nouvelleValeur;
            }
        }
    }

    public static int trouverPremiereOccurrence(int[] tableau, int valeurRecherchee) {
        int position = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                position = i;
                break; 
            }
        }
        return position; // Retourne l'indice de la première occurrence trouvée,ET -1 si la valeur n'est pas trouvée dans le tableau
    }

    public static int trouverDerniereOccurrence(int[] tableau, int valeurRecherchee) {
        int position = -1;
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeurRecherchee) {
                position = i;
                break; 
            }
        }
        return position; // Retourne l'indice de la dernière occurrence trouvée,ET -1 si la valeur n'est pas trouvée dans le tableau
    }
}

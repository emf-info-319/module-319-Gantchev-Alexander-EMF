public class ExercicesMéthodesTableaux {
    public static void main(String[] args) {

        int[] tab = creeTableau(67);
        int[] tab1 = remplirtab(6767);
        int[] tab2 = remplirtabrandom(9);
        TailleTableau(tab);
        afficherTableau(tab2);
        trouverMinimum(tab2);

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
            ;

        }
        return tablo;
    }

    public static int TailleTableau(int[] tab) {
        return tab.length;

    }
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            
        }



    }public static int trouverMinimum(int[] tableau) {
        int minimum = tableau[0]; 
        
                for (int i = 1; i < tableau.length; i++) {
                    
                    if (tableau[i] < minimum) {
                        System.out.println(i);
                        minimum = tableau[i];
                    }

                }
                System.out.println(minimum);
                return minimum;
            }
        
}

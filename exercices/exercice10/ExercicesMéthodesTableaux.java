public class ExercicesMéthodesTableaux {
    public static void main(String[] args) {
        
        int[] tab= creeTableau(6767);
        int[] tab1 = remplirtab(6767);
        int[] tab2 = remplirtabrandom(9);
        int[] tab3 = TailleTableau(tab);

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

}

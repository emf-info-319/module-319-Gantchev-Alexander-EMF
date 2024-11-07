
public class ExercicesInversionTableau {
    public static final int MAX = 100;
    public static final int MIN = 0;

    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        créerPuisInverseLeTableau(tableauInitial);
    }

    public static int[] créerPuisInverseLeTableau(int[] tab) {
        int[] tabinverse = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("Contenu du tableau initial : " + tab[i]);
        }
        int w = tabinverse.length -1;
        for (int i = 0; i < tabinverse.length; i++) {
            
            tabinverse[w] = tab [i];
            w--;
        }
        for (int i = 0; i < tabinverse.length; i++) {
            System.out.println("Contenu du tableau final : " + tabinverse[i]);
        }
          

        
        return tabinverse;
    }

}

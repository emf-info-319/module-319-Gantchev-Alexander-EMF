package exercice09;

public class ExerciceTableaux4 {

    public final static int MAX = 20;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int []tab ;

        tab = new int[5];

      for (int index = 0; index < tab.length; index++) {
        tab[0] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        tab[1] = tab[0] ++;
        tab[2] = tab[1]++;
        System.out.println(tab[index]);
      }
    }
    
}

package exercice09;

public class ExerciceTableaux2 {

    public final static int MIN = 1;
    public final static int MAX = 6;

    public static void main(String[] args) {
        int[] monTableau;
        monTableau = new int[10];

        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            for (int j = 0; j < monTableau.length; j++) {
                System.out.println("Cellule :" + monTableau[i]);
            
            }

        }

    }
}

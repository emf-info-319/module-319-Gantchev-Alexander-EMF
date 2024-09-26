package exercice09;

public class ExerciceTableaux3 {

    public final static int MIN = 1;
    public final static int MAX = 6;

    public static void main(String[] args) {
        int[] monTableau;
        monTableau = new int[10];
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println(monTableau[i]);
        }
        
        float moyenne = (monTableau[0] + monTableau[1] + monTableau[2] + monTableau[3] + monTableau[4] + monTableau[5]
                + monTableau[6] + monTableau[7] + monTableau[8] + monTableau[9]) / 10;
        System.out.println("La moyenne est donc de " + moyenne);
    }

}

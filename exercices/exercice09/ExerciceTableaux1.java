package exercice09;

public class ExerciceTableaux1 {
    public static void main(String[] args) {
        int[] monTableau;
        monTableau = new int[5];
    
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }
        // les tableaux vides en int vont afficher "0". 
        String[] tableauString;
        tableauString = new String[5];
        for (int  j = 0; j < tableauString.length; j++) {
            System.out.println(tableauString[j]);
        }
        // les tableaux vides en String vont afficher "null". 
    }
}

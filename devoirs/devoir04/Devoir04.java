package devoirs.devoir04;

public class Devoir04 {
    public static void main(String[] args) {
        int year = -4;
        int month = 10;
        int day = 3;
        int jourMax;
        System.out.println(" date entrée est le " + day + "." + month + "." + year);
        if (year < 0 || year > 9999) {
            System.out.println("L'année [" + year + "] est hors limites !");

        }
        if (month < 1 || month > 12) {
            System.out.println("Le mois [" + month + "] est hors limites !");
        }boolean annéeBiss = (year % 4 == 0);

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                jourMax = 31;
                break;
            case 4: case 6: case 9: case 11:
                jourMax = 30;
                break;
            case 2:
                jourMax = annéeBiss ? 29 : 28;
                break;
            default:
                jourMax = 0; 
        System.out.println("l'année [ " + year + " ] est hors limites");

    }
}
}
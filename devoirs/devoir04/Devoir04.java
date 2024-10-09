package devoirs.devoir04;

public class Devoir04 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 10;
        int day = 3;
        int dateString;
        System.out.println(" date entrée est le " + day + "." + month + "." + year);
        switch (dateString) {
            case 1:
                if (day > 31) {
                    System.out.println("le jour [ " + day + " ] est hors limites");
                } else {
                }
                break;

            case 2:
                if (month > 31) {
                    System.out.println("le mois [ " + month + " ] est hors limites");
                } else {
                }

                break;
            default:

                if (year > 9999) {
                    System.out.println("l'année [ " + year + " ] est hors limites");
                } else {
                }
                break;
        }

    }

}
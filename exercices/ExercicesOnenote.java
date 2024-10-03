/**
 * ExercicesOnenote
 */
public class ExercicesOnenote {

    public static void main(String[] args) {
        int nbrDepart = 5;
        int total = 0;
        for (int i = 0; i < nbrDepart; i++) {
            System.out.println(i);
            total = total + i;
        }

        System.out.println(total);
        System.out.println("Maintenant la méthode while");
        int i = 0;
        while (i < nbrDepart) {
            System.out.println(i);
            total = total + i;
            i++;

        }
        System.out.println(total);
    }
}

package exercice04;

public class Exercice04 {
    public static void main(String[] args) {
        int v1 = 1;
        int v2 = 2;
        int v3 = 0;

        System.out.println("Le contenu de la variable 1 est " + v1 + " et le contenu de la variable 2 est " + v2);
        System.out.println(".....Traitement.....");

        v3 = v1;
        v1 = v2;
        v2 = v3;

        System.out.println("Le contenu de la variable 1 est " + v1 + " et le contenu de la variable 2 est " + v2);

    }
}
package revisions;

public class ExoPhraseur {
  
    public static void main(String[] args) {
        int nbr = nbreAleatoire(6,0);
        String[] sujets = { "Il", "Elle", "Paul", "Albert", "Abdel", "Jean" };
        for (int i = 0; i < sujets.length; i++) {

        }
        String[] verbes = { "regarde", "identifie", "tabasse", "mange", "casse", "broie en mille morceaux" };
        for (int i = 0; i < verbes.length; i++) {

        }
        String[] choses = { "une pomme", "une table", "un verre", "un enfant", "une banane", "un gateau" };
        for (int i = 0; i < choses.length; i++) {

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(choisirMot(sujets) + " " + choisirMot(verbes) + " " + choisirMot(choses));
        }

    }

    public static int nbreAleatoire(int max, int min) {
        int nbreAleatoire = (int) (Math.random() * (max - min + 1)) + min;
        return nbreAleatoire;

    }

    public static String choisirMot(String[]tab){
        return tab[nbreAleatoire(tab.length, 0)];
}
}
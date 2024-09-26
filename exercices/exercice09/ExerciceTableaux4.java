package exercice09;

public class ExerciceTableaux4 {

  public static void main(String[] args) {

    int[] tab;
    tab = new int[5];

    int nb = (int) (Math.random() * (20 - 1));
    System.out.println("le nombre de base est "+nb);

    for (int i = 0; i < tab.length; i++) {

      nb = nb +1;
      tab[i] = nb;
      System.out.println(tab[i]);
      
    }
  }

}

package exercice09;

public class ExerciceTableaux4 {

  public static void main(String[] args) {

    int[] tab;
    tab = new int[5];

    int nb = (int) (Math.random() * (20 - 1));

    for (int i = 0; i < tab.length; i++) {
      tab[i] = nb;
      System.out.println(tab[i]);
      nb = nb +1;
    }
  }

}

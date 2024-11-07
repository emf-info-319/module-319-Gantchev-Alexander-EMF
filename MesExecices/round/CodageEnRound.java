
public class CodageEnRound {
    public static double PI = 3.14;

    public static void main(String[] args) {
        int[] rayons = new int[10];
        for (int i = 0; i < rayons.length; i++) {
            rayons[i] = genereNombre(1, 75);

        }
        for (int i = rayons.length - 1; i >= 0; i--) {
            if (rayons[i] > 1) {
                System.out.println("Aire = "+PI * i * i);
            } else {
                System.out.println("Périmètre = "+PI * 2 * i);
            }
        }
    }

    public static int genereNombre(int min, int max) {
        int nbr = (int) (Math.random() * (max - min + 1)) + min;
        return nbr;
    }
}
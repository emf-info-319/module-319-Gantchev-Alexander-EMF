package MesExecices.livret;

public class Livret {
    public final static int MAX = 20;
    public final static int MIN = 5;
    public static void main(String[] args) {
        int nbr1 = choisirUnNombre(MAX, MIN);
        int nbr2 = choisirUnNombre(MAX, MIN);
        System.out.println("La liste des chiffres sont : "+nbr1+" et "+nbr2);
        String[] tabStrings = construireTableMultiplication(nbr1, nbr2);
        for (int i = 0; i < tabStrings.length; i++) {
            System.out.println(tabStrings[i]);
        }
    }

    

    public static int choisirUnNombre(int MAX, int MIN) {
        int nbr = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        System.out.println(nbr);
        return nbr;
    }

    public final static String[] construireTableMultiplication(int a, int b) {
        String[] tabStrings = new String[a * b];
        int n1 = 1;
        int n2 = 1;
        
        for (int i = 0; i < tabStrings.length; i++) {
            tabStrings[i] = n1 + " x " + n2 + " = " + n1 * n2;

            if (n2 == b) { //le if va me permettre de ne pas depasser les chiffres 
                n1++;
                n2 = 0;
            }
            n2++;
        }

        return tabStrings;
    }
}

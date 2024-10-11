public class Temperature {

    public final static int TEMP_MIN = -40;
    public final static int TEMP_MAX = 40;
    public final static int NOMBRE_JOURS = 7;

    public static void main(String[] args) {
        int[] temperatures = new int[NOMBRE_JOURS];
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = (int) (Math.random() * (TEMP_MAX - TEMP_MIN + 1)) + TEMP_MIN;
            
            switch (temperatures[i]) {
                case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15:
                    System.out.println("la température au jour "+i+" est "+temperatures[i]+" ° : froid ");
                    break;
                case 16,17,18,19,20,21,22,23,24,25:
                System.out.println("la température au jour "+i+" est "+temperatures[i]+" ° : Doux    ");
                    break;
                    case 26,27,28,29,30,31,32,33,34,35:
                    System.out.println("la température au jour "+i+" est "+temperatures[i]+" ° : Chaud    ");
                    break;
                    case 36,37,38,39,40:
                    System.out.println("la température au jour "+i+" est "+temperatures[i]+" ° : Très chaud    ");
                    break;
            
                default:
                System.out.println("la température au jour "+i+" est "+temperatures[i]+" ° : Très Froid   ");
                    break;
            }
            


            }double totalTemp = 0;
            double moyenne;
            for (int j = 0; j < temperatures.length; j++) {
                totalTemp+= temperatures[j];
            }
            System.out.println(totalTemp);
            moyenne = totalTemp/NOMBRE_JOURS;
            if (moyenne>20) {
                System.out.println("La moyenne de la température est agréable");
            }else {
                System.out.println("La moyenne de la température est fraiche");

            }
           
        }
    }


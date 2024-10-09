package devoirs.devoir05;

import java.util.Scanner;

public class Devoir05 {
    public final static int MAX = 100;
    public final static int MIN = 1;
 
    public static void main(String[] args) {
 
        Scanner nombreEcrit = new Scanner(System.in);
       
        System.out.print("Entrez une valeur svp : ");
        Scanner scanner;
        int valeur = scanner.nextInt();
        
        
        int nombreAleatoire = (int) (Math.random()); 
        int grandeLimite = 100;
        int petitelimite = 1;
        int nombreDemande;
        switch (nombreAleatoire) {
            case 1:
                if (nombreDemande < nombreAleatoire) {
                    System.out.println("trop petit");
                }
                break;
            case 2:
                if (nombreDemande > nombreAleatoire) {
                    System.out.println("trop grand");
                }
                break;
            case 3:
                
 
            default:
            if (nombreDemande == nombreAleatoire) {
                    System.out.println("bravo !!!");
                }
                break;
        }
    }
}


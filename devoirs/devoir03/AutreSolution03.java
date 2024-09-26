public class AutreSolution03 {
    /**
     * InnerAutreSolution03
     */
    public class InnerAutreSolution03 {
        public static void main(String[] args) {
            int jour = 26;
            int mois = 9;
            int annee = 2024;
            int[]tab;
            tab = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
            int jourtotal = 0;
            if(annee % 4 == 0 && mois >2){
                resultat++;
             }

          for (int i = 0; i < mois - 1; i++){
            jourtotal  = jourtotal + tab[i];

        }
        jourtotal = jourtotal + jour;
        
        System.out.println("le "+jour+"/"+mois+"/"+annee+" est le "+jourtotal+" de l'An");
    }
    
        
    }
    
}

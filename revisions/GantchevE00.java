package revisions;

public class GantchevE00 {

    public final static int NOMBRE_PTS_VICTOIRE = 3;

    public static void main(String[] args) {
        String NomEquipe1 = "Barcelone";
        String NomEquipe2 = "Madrid";

        int nbr_pts_Barcelone = 0;
        int nbr_pts_Madrid = 0;

        for (int i = 0; i < 10; i++) {
            int score_Barcelone = (int) (Math.random() * (10 - 1 + 1)) + 1;
            int score_Madrid = (int) (Math.random() * (10 - 1 + 1)) + 1;
            System.out.println(NomEquipe1 + " joue contre " + NomEquipe2 + "et le résultat est : " + score_Barcelone
                    + " à " + score_Madrid);
            if (score_Barcelone > score_Madrid) {
                System.out.println(NomEquipe1+" a gagné !");
                nbr_pts_Barcelone = nbr_pts_Barcelone + NOMBRE_PTS_VICTOIRE;

            } else if (score_Barcelone < score_Madrid) {
                System.out.println(NomEquipe2+" a gagné !");
                nbr_pts_Madrid = nbr_pts_Madrid + NOMBRE_PTS_VICTOIRE;
            } else if (score_Barcelone == score_Madrid) {
                System.out.println("Match nul...");
                nbr_pts_Barcelone = nbr_pts_Barcelone + 1;
                nbr_pts_Madrid = nbr_pts_Madrid + 1;
            }
        }
        System.out.println(NomEquipe1 + " a " + nbr_pts_Barcelone + " points");
        System.out.println(NomEquipe2 + " a " + nbr_pts_Madrid + " points");
    }
}

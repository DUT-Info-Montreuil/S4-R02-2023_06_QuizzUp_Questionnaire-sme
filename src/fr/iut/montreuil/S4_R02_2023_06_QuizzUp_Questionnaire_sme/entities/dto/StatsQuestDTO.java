package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;


public class StatsQuestDTO{
    private int nbjouer;
    private int nbOk;

    public StatsQuestDTO(int nbjouer, int nbOk) {
        this.nbjouer = 0;
        this.nbOk = 0;
    }

    public StatsQuestDTO() {
    }

    public int getNbjouer() {
        return nbjouer;
    }

    public void setNbjouer(int nbjouer) {
        this.nbjouer = nbjouer;
    }

    public int getNbOk() {
        return nbOk;
    }

    public void setNbOk(int nbOk) {
        this.nbOk = nbOk;
    }

    public void incrementerNbJouer() {
        nbjouer++;
    }

    public void incrementerNbCorrecte() {
        nbOk++;
    }

    @Override
    public String toString() {
        QuestionDTO q = new QuestionDTO();
        return "Question " + q.getNumero() + " : " + q.getLibelle() + "\n" +
                "Difficulté : " + q.getDifficulte() + "\n" +
                "Nombre de fois jouée : " + nbjouer + "\n" +
                "Nombre de fois répondu correctement : " + nbOk + "\n" +
                "Taux de réussite : " + (nbOk/ nbjouer) + "%";
    }
}

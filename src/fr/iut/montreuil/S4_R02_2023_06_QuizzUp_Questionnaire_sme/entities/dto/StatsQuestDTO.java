package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;


public class StatsQuestDTO{
    private int nbjouer;
    private int nbOk;

    public StatsQuestDTO() {
        this.nbjouer = 0;
        this.nbOk = 0;
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

}

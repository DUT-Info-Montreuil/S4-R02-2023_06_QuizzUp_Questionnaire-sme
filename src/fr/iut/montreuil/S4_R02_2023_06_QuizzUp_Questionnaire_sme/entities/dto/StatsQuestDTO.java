package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;


public class StatsQuestDTO{
    private int nbjouer;
    private int nbOk;
    private int difficulte;
    private int numero;

    public StatsQuestDTO(int numero) {
        this.nbjouer = 0;
        this.nbOk = 0;
        this.numero=numero;
    }

    public StatsQuestDTO() {
        this.nbjouer = 0;
        this.nbOk = 0;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        return "StatsQuestDTO [nbjouer=" + nbjouer + ", nbOk=" + nbOk + "]";
    }


}

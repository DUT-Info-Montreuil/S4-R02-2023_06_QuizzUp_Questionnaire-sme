package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class StatsQuestDTO {
    private int nbjouer;
    private int nbOk;

    public StatsQuestDTO(int nbjouer, int nbOk) {
        this.nbjouer = nbjouer;
        this.nbOk = nbOk;
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
}

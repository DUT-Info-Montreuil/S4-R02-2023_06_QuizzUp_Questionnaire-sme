package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class StatsDTO {
    private ArrayList<QuestionDTO> statQuestDTO = new ArrayList<>();
    private int nbjouerQuest;
    private int idQuestion;

    public StatsDTO(ArrayList<QuestionDTO> statQuestDTO, int nbjouerQuest, int idQuestion) {
        this.statQuestDTO = statQuestDTO;
        this.nbjouerQuest = nbjouerQuest;
        this.idQuestion = idQuestion;
    }

    public ArrayList<QuestionDTO> getStatQuestDTO() {
        return statQuestDTO;
    }

    public void setStatQuestDTO(ArrayList<QuestionDTO> statQuestDTO) {
        this.statQuestDTO = statQuestDTO;
    }

    public int getNbjouerQuest() {
        return nbjouerQuest;
    }

    public void setNbjouerQuest(int nbjouerQuest) {
        this.nbjouerQuest = nbjouerQuest;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }
}

package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {
    private int id_questionnaire;
    private ArrayList<QuestionDTO> questions;

    public QuestionnaireDTO(int id_questionnaire, ArrayList<QuestionDTO> questions) {
        this.id_questionnaire = id_questionnaire;
        this.questions = questions;
    }

    public int getId_questionnaire() {
        return id_questionnaire;
    }

    public void setId_questionnaire(int id_questionnaire) {
        this.id_questionnaire = id_questionnaire;
    }

    public ArrayList<QuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<QuestionDTO> questions) {
        this.questions = questions;
    }

    
}

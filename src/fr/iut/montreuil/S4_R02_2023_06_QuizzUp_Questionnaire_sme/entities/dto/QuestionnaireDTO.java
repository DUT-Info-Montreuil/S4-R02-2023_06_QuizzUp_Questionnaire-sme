package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {
    private int id_questionnaire;
    private ArrayList<QuestionDTO> questions;
    private static int idNow;

    public QuestionnaireDTO(int id_questionnaire, ArrayList<QuestionDTO> questions) {
        this.id_questionnaire = idNow ++;
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

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "id_questionnaire=" + id_questionnaire +
                ", questions=" + questions +
                '}';
    }
}

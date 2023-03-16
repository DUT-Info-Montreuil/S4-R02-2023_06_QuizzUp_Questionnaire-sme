package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.bo;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireBO {
    private List<Integer> idQuestionnaires;
    private List<Integer> numQuestions;
    private List<String> langues;
    private List<String> libelles;
    private List<String> reponses;
    private List<Integer> difficultes;
    private List<String> explications;
    private List<String> references;
    
    public QuestionnaireBO() {
        this.idQuestionnaires = new ArrayList<>();
        this.numQuestions = new ArrayList<>();
        this.langues = new ArrayList<>();
        this.libelles = new ArrayList<>();
        this.reponses = new ArrayList<>();
        this.difficultes = new ArrayList<>();
        this.explications = new ArrayList<>();
        this.references = new ArrayList<>();
    }

    public List<Integer> getIdQuestionnaires() {
        return idQuestionnaires;
    }

    public void setIdQuestionnaires(List<Integer> idQuestionnaires) {
        this.idQuestionnaires = idQuestionnaires;
    }

    public List<Integer> getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(List<Integer> numQuestions) {
        this.numQuestions = numQuestions;
    }

    public List<String> getLangues() {
        return langues;
    }

    public void setLangues(List<String> langues) {
        this.langues = langues;
    }

    public List<String> getLibelles() {
        return libelles;
    }

    public void setLibelles(List<String> libelles) {
        this.libelles = libelles;
    }

    public List<String> getReponses() {
        return reponses;
    }

    public void setReponses(List<String> reponses) {
        this.reponses = reponses;
    }

    public List<Integer> getDifficultes() {
        return difficultes;
    }

    public void setDifficultes(List<Integer> difficultes) {
        this.difficultes = difficultes;
    }

    public List<String> getExplications() {
        return explications;
    }

    public void setExplications(List<String> explications) {
        this.explications = explications;
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }

    
}
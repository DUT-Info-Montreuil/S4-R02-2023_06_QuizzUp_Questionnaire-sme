package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;

public class QuestionDTO {
    private int numero;
    private String langue;
    private String libelle;
    private String reponse;
    private int difficulte;
    private String explication;
    private String reference;


    public QuestionDTO(int numero, String langue, String libelle, String reponse, int difficulte, String explication, String reference) {
        this.numero = numero;
        this.langue = langue;
        this.libelle = libelle;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.reference = reference;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    
}

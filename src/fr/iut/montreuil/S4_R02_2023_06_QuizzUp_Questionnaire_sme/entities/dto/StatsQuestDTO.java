package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;

import java.util.ArrayList;
import java.util.Comparator;

public class StatsQuestDTO extends QuestionDTO{
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

    @Override
    public int getDifficulte() {
        return super.getDifficulte();
    }

    @Override
    public int getNumero() {
        return super.getNumero();
    }
    public QuestionDTO trouverQuestionLaPlusFacile(ArrayList<QuestionDTO> questions) {
        // trier les questions par ordre de difficulté décroissante, puis par nombre de fois jouée croissant, puis par numéro de question croissant
        questions.sort(Comparator.comparing(QuestionDTO::getDifficulte).reversed()
                                  .thenComparing(StatsQuestDTO::getNbjouer)
                                  .thenComparing(QuestionDTO::getNumero));
    
        // retourner la première question dans la liste triée
        return questions.get(0);
    }
    public QuestionDTO trouverQuestionLaPlusDure(ArrayList<QuestionDTO> questions){
        questions.sort(Comparator.comparing(QuestionDTO::getDifficulte)
                                          .thenComparing(StatsQuestDTO::getNbjouer)
                                          .thenComparing(QuestionDTO::getNumero));

    return questions.get(0);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Statistique du questionnaire ").append(getId()).append(" :\n");
        sb.append("  Le questionnaire ").append(getNom()).append(" a été joué :\n");
        sb.append("    ").append(getNbJouer()).append(" fois.\n");
        sb.append("  La question avec le meilleur taux de réussite est :\n");
        QuestionDTO meilleureQuestion = trouverQuestionLaPlusFacile(getQuestions());
        sb.append("    ").append(meilleureQuestion.getQuestion()).append(" Avec ")
            .append(meilleureQuestion.getStats().getNbOk()).append(" bonnes réponses sur ")
            .append(meilleureQuestion.getStats().getNbjouer()).append(".\n");
        sb.append("  La question avec le pire taux de réussite est :\n");
        QuestionDTO pireQuestion = trouverQuestionLaPlusDure(getQuestions());
        sb.append("    ").append(pireQuestion.getQuestion()).append(" Avec ")
            .append(pireQuestion.getStats().getNbOk()).append(" bonnes réponses sur ")
            .append(pireQuestion.getStats().getNbjouer()).append(".\n");
        return sb.toString();
    }
}

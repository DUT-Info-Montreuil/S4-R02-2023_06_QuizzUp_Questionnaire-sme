package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;

import java.util.ArrayList;
import java.util.Comparator;

public class StatsDTO{
    private ArrayList<QuestionDTO> statQuestDTO = new ArrayList<>();
    private int nbjouerQuest;
    private int idQuestion;
    private QuestionnaireDTO quest = new QuestionnaireDTO(idQuestion, statQuestDTO);
    private QuestionDTO q = new QuestionDTO(1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok", 0, 0);

    
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
    public QuestionDTO trouverQuestionLaPlusFacile(ArrayList<QuestionDTO> questions) {
        // trier les questions par ordre de difficulté décroissante, puis par nombre de fois jouée croissant, puis par numéro de question croissant
        questions.sort(Comparator.comparing(QuestionDTO::getDifficulte).reversed()
                                  .thenComparing(StatsDTO::getNbjouerQuest)
                                  .thenComparing(QuestionDTO::getIdQuestion));
    
        // retourner la première question dans la liste triée
        QuestionDTO questionFacile = questions.get(0);
        return questionFacile;
    }
    public QuestionDTO trouverQuestionLaPlusDure(ArrayList<QuestionDTO> questions){
        questions.sort(Comparator.comparing(QuestionDTO::getDifficulte)
                                          .thenComparing(StatsDTO::getNbjouerQuest)
                                          .thenComparing(QuestionDTO::getNumero));
        QuestionDTO questionDûre = questions.get(0);
    return questionDûre;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Statistique du questionnaire ").append(quest.getId_questionnaire()).append(" :\n");
        sb.append("  Le questionnaire ").append(quest.getId_questionnaire()).append(" a été joué :\n");
        sb.append("    ").append(quest.getNbjouer()).append(" fois.\n");
        sb.append("  La question avec le meilleur taux de réussite est :\n");
        QuestionDTO meilleureQuestion = trouverQuestionLaPlusFacile(getStatQuestDTO());
        sb.append("    ").append(meilleureQuestion.getLibelle()).append(" Avec ")
            .append(meilleureQuestion.getNbOk()).append(" bonnes réponses sur ")
            .append(meilleureQuestion.getNbjouer()).append(".\n");
        sb.append("  La question avec le pire taux de réussite est :\n");
        QuestionDTO pireQuestion = trouverQuestionLaPlusDure(getStatQuestDTO());
        sb.append("    ").append(pireQuestion.getLibelle()).append(" Avec ")
            .append(pireQuestion.getNbOk()).append(" bonnes réponses sur ")
            .append(pireQuestion.getNbjouer()).append(".\n");
        return sb.toString();
    }
}

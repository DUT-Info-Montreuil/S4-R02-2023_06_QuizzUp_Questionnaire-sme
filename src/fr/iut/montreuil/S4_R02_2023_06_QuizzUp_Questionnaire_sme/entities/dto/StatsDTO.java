package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto;

import java.util.ArrayList;
import java.util.Comparator;

public class StatsDTO{
    private ArrayList<StatsQuestDTO> statQuestDTO;
    private int idQuestionnaire;
    private int nbJouer;

    
    public StatsDTO(ArrayList<StatsQuestDTO> statQuestDTO, int idQuestionnaire, int nbJouer) {
        this.statQuestDTO = new ArrayList<StatsQuestDTO>();
        this.idQuestionnaire = idQuestionnaire;
        this.nbJouer = nbJouer;
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public void addStatsQuestionDTO(StatsQuestDTO stat){
        statQuestDTO.add(stat);
    }

    public int getNbJouer() {
        return nbJouer;
    }

    public void setStatQuestDTO(ArrayList<StatsQuestDTO> statQuestDTO) {
        this.statQuestDTO = statQuestDTO;
    }

    public void setNbJouer(int nbJouer) {
        this.nbJouer = nbJouer;
    }

    public ArrayList<StatsQuestDTO> getStatQuestDTO() {
        return statQuestDTO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Statistiques du questionnaire ").append(idQuestionnaire).append(" :\n");
        sb.append("  Le questionnaire ").append(idQuestionnaire).append(" a été joué :\n");
        sb.append("    ").append(nbJouer).append(" fois.\n");
        sb.append("  La question avec le meilleur taux de réussite est :\n");
        sb.append("    ").append(getStatQuestDTO().get(0).toString()).append("\n");
        sb.append("  La question avec le pire taux de réussite est :\n");
        sb.append("    ").append(getStatQuestDTO().get(0).toString()).append("\n");
        return sb.toString();
    }



}

package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsQuestDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.NbFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceStatsQuestionnaire;

import java.util.ArrayList;
import java.util.Comparator;

public class ServiceStatsImpl implements IServiceStatsQuestionnaire {

    @Override
    public StatsDTO fournirStatsQuestionnaire(QuestionnaireDTO questionnaire) throws NbFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        int idQuestionnaire = questionnaire.getId_questionnaire();
        if (idQuestionnaire <= 0) {
            throw new IdQuestionnaireIncorrectExeptions();
        }


        int nbDeFoisJoueQuestionnaire = questionnaire.getNbjouer();
        if (nbDeFoisJoueQuestionnaire < 0) {
            throw new NbFoisJoueQuestionnaireIncorrectExeptions();
        }


        ArrayList<QuestionDTO> questions = questionnaire.getQuestions();
        if (questions == null || questions.isEmpty()) {
            throw new StatsQuestionsIncorrectExeptions();
        }

        ArrayList<StatsQuestDTO> statsQuestions = new ArrayList<>();

        for (QuestionDTO question : questions) {

            int idQuestion = question.getNumero();
            if (idQuestion <= 0) {
                throw new StatsQuestionsIncorrectExeptions();
            }

            int nbDeFoisJoueQuestion = question.getStats().getNbjouer();
            if (nbDeFoisJoueQuestion < 0) {
                throw new StatsQuestionsIncorrectExeptions();
            }

            int nbDeFoisReponseCorrecte = question.getStats().getNbOk();
            if (nbDeFoisReponseCorrecte < 0 ) {
                throw new StatsQuestionsIncorrectExeptions();
            }

            if (nbDeFoisJoueQuestion < nbDeFoisReponseCorrecte){
                throw new StatsQuestionsIncorrectExeptions();
            }

            if(nbDeFoisJoueQuestion>nbDeFoisJoueQuestionnaire){
                throw new StatsQuestionsIncorrectExeptions();
            }

            StatsQuestDTO statsQuestion = new StatsQuestDTO(nbDeFoisJoueQuestion, nbDeFoisReponseCorrecte, idQuestion);
            statsQuestions.add(statsQuestion);
        }


        StatsDTO bilanStats = new StatsDTO(statsQuestions, idQuestionnaire, nbDeFoisJoueQuestionnaire);
        return bilanStats;
    }
}

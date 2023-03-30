package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsQuestDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.NbFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceStatsQuestionnaire;

import java.util.ArrayList;
import java.util.Comparator;

    public class ServiceStatsImpl implements IServiceStatsQuestionnaire {
        private StatsQuestDTO statsQuestDTO = new StatsQuestDTO();
        @Override
        public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws NbFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
            return null;
        }

        @Override
        public StatsQuestDTO trouverQuestionLaPlusFacile(ArrayList<StatsQuestDTO> questions) {
            questions.sort(Comparator.comparing(StatsQuestDTO::getNbOk).reversed()
                    .thenComparing(StatsQuestDTO::getDifficulte).reversed()
                    .thenComparingInt(StatsQuestDTO::getNbjouer)
                    .thenComparing(StatsQuestDTO::getNumero));

            return questions.get(0);
        }


        @Override
        public StatsQuestDTO trouverQuestionLaPlusDure(ArrayList<StatsQuestDTO> questions) {
            questions.sort(Comparator.comparing(StatsQuestDTO::getNbOk)
                    .thenComparing(StatsQuestDTO::getDifficulte)
                    .thenComparingInt(StatsQuestDTO::getNbjouer)
                    .thenComparing(StatsQuestDTO::getNumero));

            return questions.get(0);
        }

    }


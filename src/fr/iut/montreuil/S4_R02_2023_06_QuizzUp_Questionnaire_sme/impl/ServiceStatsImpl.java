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
        questions.sort(Comparator.comparing(QuestionDTO::getDifficulte).reversed()
                .thenComparing(StatsQuestDTO::getNbjouer)
                .thenComparing(QuestionDTO::getNumero));

        StatsQuestDTO questionFacile = questions.get(0);
        return questionFacile;
    }

    @Override
    public StatsQuestDTO trouverQuestionLaPlusDure(ArrayList<StatsQuestDTO> questions){
        questions.sort(Comparator.comparing(QuestionDTO::getDifficulte)
                .thenComparing(StatsQuestDTO::getNbjouer)
                .thenComparing(QuestionDTO::getNumero));
        StatsQuestDTO questionDûre = questions.get(0);
        return questionDûre;
    }

}

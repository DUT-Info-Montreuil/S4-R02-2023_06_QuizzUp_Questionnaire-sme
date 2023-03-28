package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.NbFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceStatsQuestionnaire;

public class ServiceStatsQuestionnaireMockQuestionsIncorrect implements IServiceStatsQuestionnaire {

    @Override
    public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire)
            throws NbFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fournirStatsQuestions'");
    }

}
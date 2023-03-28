package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.NbDeFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceStatsQuestionnaire;

public class ServiceStatsQuestionnaireMockNbDeFoisJoueQuestionnaireIncorrect implements IServiceStatsQuestionnaire {

    @Override
    public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire)
            throws NbDeFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fournirStatsQuestions'");
    }
    
}

package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import java.util.ArrayList;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsQuestDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.NbFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceStatsQuestionnaire;

public class ServiceStatsQuestionnaireMockNbDeFoisJoueQuestionnaireIncorrect implements IServiceStatsQuestionnaire {

    @Override
    public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire)
            throws NbFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fournirStatsQuestions'");
    }

    @Override
    public StatsQuestDTO trouverQuestionLaPlusFacile(ArrayList<StatsQuestDTO> questions) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'trouverQuestionLaPlusFacile'");
    }

    @Override
    public StatsQuestDTO trouverQuestionLaPlusDure(ArrayList<StatsQuestDTO> questions) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'trouverQuestionLaPlusDure'");
    }
    
}

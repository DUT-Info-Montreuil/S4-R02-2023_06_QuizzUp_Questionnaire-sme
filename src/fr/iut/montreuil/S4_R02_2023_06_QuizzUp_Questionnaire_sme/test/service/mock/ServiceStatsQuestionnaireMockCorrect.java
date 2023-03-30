package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import java.util.ArrayList;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsQuestDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.NbFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceStatsQuestionnaire;

public class ServiceStatsQuestionnaireMockCorrect implements IServiceStatsQuestionnaire {

    @Override
    public StatsDTO fournirStatsQuestionnaire(QuestionnaireDTO questionnaire) throws NbFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        ArrayList<StatsQuestDTO> statsQuestions = new ArrayList<>();
        StatsQuestDTO statsQuestionDTO = new StatsQuestDTO();
        statsQuestionDTO.setNbjouer(5);
        statsQuestionDTO.setNbOk(2);
        statsQuestions.add(statsQuestionDTO);
        statsQuestions.add(new StatsQuestDTO());
        return new StatsDTO(statsQuestions, 1, 5);
    }
}
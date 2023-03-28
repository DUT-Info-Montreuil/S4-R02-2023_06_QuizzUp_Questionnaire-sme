package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.impl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsQuestDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.NbDeFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceStatsQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ServiceStatsQuestionnaireMockCorrect;

import java.util.ArrayList;
import java.util.List;

public class ServiceStatsQuestionnaireTest {

    private IServiceStatsQuestionnaire serviceStatsQuestionnaireTest;

    @Test
    public void statsQuestionnaireCorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions {
        serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockCorrect();

        //creation d'un BilanStatsDTO
        ArrayList<StatsQuestDTO> statsQuestions = new ArrayList<>();
        StatsQuestDTO statsQuestionsDTO = new StatsQuestDTO(5, 2);
        statsQuestions.add(statsQuestionsDTO);
        statsQuestions.add(new StatsQuestDTO(0, 0));
        StatsDTO bilanStatsDTO = new StatsDTO(statsQuestions, 5, 1);

        //creation d'un QuestionnaireDTO
        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok", 2, 5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok", 0, 0));
        listeQuestions.add(new QuestionDTO(1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok", 0, 0));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions);
        questionnaireDTO.setNbjouer(5);

        Assertions.assertEquals(bilanStatsDTO.toString(), serviceStatsQuestionnaireTest.fournirStatsQuestions(questionnaireDTO).toString());
    }

    public void nbDeFoisJoueQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions {
        
    }

    public void statsQuestionsIncorrectIncorrect() throws StatsQuestionsIncorrectExeptions, NbDeFoisJoueQuestionnaireIncorrectExeptions {

    }


}
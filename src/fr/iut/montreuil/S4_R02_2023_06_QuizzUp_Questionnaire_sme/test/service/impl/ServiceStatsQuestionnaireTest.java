package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.impl;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.IdQuestionnaireIncorrectExeptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsQuestDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.NbFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.StatsQuestionsIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceStatsQuestionnaire;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ServiceStatsQuestionnaireMockCorrect;

import java.util.ArrayList;
import java.util.List;

public class ServiceStatsQuestionnaireTest {

    private IServiceStatsQuestionnaire serviceStatsQuestionnaireTest;

    @Test
    public void statsQuestionnaireCorrect() throws StatsQuestionsIncorrectExeptions, NbFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockCorrect();

        //creation d'un StatsDTO
        ArrayList<StatsQuestDTO> statsQuestions = new ArrayList<>();
        StatsQuestDTO statsQuestionDTO = new StatsQuestDTO();
        statsQuestionDTO.setNbjouer(5);
        statsQuestionDTO.setNbOk(2);
        statsQuestions.add(statsQuestionDTO);
        statsQuestions.add(new StatsQuestDTO());
        StatsDTO bilanStatsDTO = new StatsDTO(statsQuestions, 1, 5);

        //creation d'un QuestionnaireDTO
        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(1, 2, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        listeQuestions.add(new QuestionDTO(1, 3, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions, 5);

        Assertions.assertEquals(bilanStatsDTO.getStatQuestDTO(), serviceStatsQuestionnaireTest.fournirStatsQuestionnaire(questionnaireDTO).getStatQuestDTO());
    }

    public void statsQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {

    }

    public void nbFoisJoueQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        
    }

    public void idQuestionnaireIncorrect () throws StatsQuestionsIncorrectExeptions, NbFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {

    }


}
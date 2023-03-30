package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.impl;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ServiceStatsQuestionnaireMockIDincorrect;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ServiceStatsQuestionnaireMockNbDeFoisJoueQuestionnaireIncorrect;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ServiceStatsQuestionnaireMockQuestionsIncorrect;
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

public class ServiceStatsQuestionnaireTest {

    private IServiceStatsQuestionnaire serviceStatsQuestionnaireTest;

    @Test
    public void statsQuestionnaireCorrect() throws StatsQuestionsIncorrectExeptions, NbFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockCorrect();

        ArrayList<StatsQuestDTO> statsQuestions = new ArrayList<>();
        StatsQuestDTO statsQuestionDTO = new StatsQuestDTO();
        statsQuestionDTO.setNbjouer(5);
        statsQuestionDTO.setNbOk(2);
        statsQuestions.add(statsQuestionDTO);
        statsQuestions.add(new StatsQuestDTO());
        StatsDTO bilanStatsDTO = new StatsDTO(statsQuestions, 1, 5);

        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(1, 2, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        listeQuestions.add(new QuestionDTO(1, 3, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions, 5);

        Assertions.assertEquals(bilanStatsDTO.getStatQuestDTO(), serviceStatsQuestionnaireTest.fournirStatsQuestionnaire(questionnaireDTO).getStatQuestDTO());
    }
    @Test
    public void idQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockIDincorrect();

        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        questionDTO.getStatsQuestionDTO().setNbjouer(5);
        questionDTO.getStatsQuestionDTO().setNbOk(2);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(1, 2, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        listeQuestions.add(new QuestionDTO(1, 3, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(-1, listeQuestions, 5);

        Assertions.assertThrows(IdQuestionnaireIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestionnaire(questionnaireDTO));
    }

    @Test
    public void nbFoisJoueQuestionnaireIncorrect() throws StatsQuestionsIncorrectExeptions, NbFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockNbDeFoisJoueQuestionnaireIncorrect();

        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        questionDTO.getStatsQuestionDTO().setNbjouer(5);
        questionDTO.getStatsQuestionDTO().setNbOk(2);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(1, 2, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        listeQuestions.add(new QuestionDTO(1, 3, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(-1, listeQuestions, -5); //nb fois joué incorrect

        Assertions.assertThrows(NbFoisJoueQuestionnaireIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestionnaire(questionnaireDTO));
    }

    @Test
    public void statsQuestionnaireIncorrect () throws StatsQuestionsIncorrectExeptions, NbFoisJoueQuestionnaireIncorrectExeptions, IdQuestionnaireIncorrectExeptions {
        serviceStatsQuestionnaireTest = new ServiceStatsQuestionnaireMockQuestionsIncorrect();

        //Si le nombre de fois joue la question est supérieur au nombre de fois joue le questionnaire ici 1 > 5
        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        QuestionDTO questionDTO = new QuestionDTO(1,1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        questionDTO.getStatsQuestionDTO().setNbjouer(5);
        listeQuestions.add(questionDTO);
        listeQuestions.add(new QuestionDTO(1, 2, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        listeQuestions.add(new QuestionDTO(1, 3, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(1, listeQuestions, 1);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestionnaire(questionnaireDTO));

        //Si le nombre de reussite de la question est supérieur au nombre de fois joue la question ici 2 > 4
        ArrayList<QuestionDTO> listeQuestions2 = new ArrayList<>();
        QuestionDTO questionDTO2 = new QuestionDTO(1,1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        questionDTO2.getStatsQuestionDTO().setNbjouer(2);
        questionDTO2.getStatsQuestionDTO().setNbOk(4);
        listeQuestions2.add(questionDTO2);
        listeQuestions2.add(new QuestionDTO(1, 2, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        listeQuestions2.add(new QuestionDTO(1, 3, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        QuestionnaireDTO questionnaireDTO2 = new QuestionnaireDTO(1, listeQuestions2, 5);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestionnaire(questionnaireDTO2));

        //Si le nombre de reussite est negatif ici -10
        ArrayList<QuestionDTO> listeQuestions3 = new ArrayList<>();
        QuestionDTO questionDTO3 = new QuestionDTO(1,1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        questionDTO3.getStatsQuestionDTO().setNbjouer(2);
        questionDTO3.getStatsQuestionDTO().setNbOk(-10);
        listeQuestions3.add(questionDTO3);
        listeQuestions3.add(new QuestionDTO(1, 2, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        listeQuestions3.add(new QuestionDTO(1, 3, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok"));
        QuestionnaireDTO questionnaireDTO3 = new QuestionnaireDTO(1, listeQuestions3, 5);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestionnaire(questionnaireDTO3));

        //Si l'id de la question est negatif
        ArrayList<QuestionDTO> listeQuestions4 = new ArrayList<>();
        QuestionDTO questionDTO4 = new QuestionDTO(1,-10, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        questionDTO4.getStatsQuestionDTO().setNbjouer(2);
        questionDTO4.getStatsQuestionDTO().setNbOk(1);
        listeQuestions4.add(questionDTO4);
        QuestionnaireDTO questionnaireDTO4 = new QuestionnaireDTO(1, listeQuestions4, 5);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestionnaire(questionnaireDTO4));

        //La liste de questions soit null
        QuestionnaireDTO questionnaireDTO5 = new QuestionnaireDTO(1, null, 5);
        Assertions.assertThrows(StatsQuestionsIncorrectExeptions.class, () -> serviceStatsQuestionnaireTest.fournirStatsQuestionnaire(questionnaireDTO5));
    }
}
package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.impl;

import java.util.ArrayList;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierVideExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.impl.ServiceQuestionnaireImpl;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ChargementQuestionnaireImplmockInvalide;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ChargementQuestionnaireImplmockOk;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ChargementQuestionnaireImplmockVide;
import org.junit.jupiter.api.Assertions;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import org.junit.jupiter.api.Test;

public class ServiceQuestionnaireChargementTest  {
    
    private IServiceQuestion serviceQuestionnaireTest;
    @Test
    public void chargementQuestionnaireCorrect() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions {
        serviceQuestionnaireTest = new ChargementQuestionnaireImplmockOk();
        QuestionDTO questionCorrect = new QuestionDTO(1, 1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        ArrayList<QuestionDTO> listQuestionsCorrect = new ArrayList<QuestionDTO>();
        listQuestionsCorrect.add(questionCorrect);
        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO(1,listQuestionsCorrect, 0);
        ArrayList<QuestionnaireDTO> reponseCorrect = new ArrayList<QuestionnaireDTO>();
        reponseCorrect.add(leQuestionnaireCorrect);
        ArrayList<QuestionnaireDTO> bonnereponse = (ArrayList<QuestionnaireDTO>) serviceQuestionnaireTest.fournirListeQuestionnaires("questionsQuizz_V1.1.csv");
        Assertions.assertEquals(leQuestionnaireCorrect.getQuestions().get(0).getReponse(),bonnereponse.get(0).getQuestions().get(0).getReponse());
        Assertions.assertEquals(leQuestionnaireCorrect.getQuestions().get(0).getLibelle(),bonnereponse.get(0).getQuestions().get(0).getLibelle());

    }
    
    @Test
    public void chargementQuestionnaireIncorrect() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ChargementQuestionnaireImplmockInvalide();
        Assertions.assertThrows(FichierIncorrectExceptions.class, ()->
                serviceQuestionnaireTest.fournirListeQuestionnaires("chargementIncorrect.csv"),"Valeur incorrect ou manquante");
    }

    @Test
    public void chargementQuestionnaireVide() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ChargementQuestionnaireImplmockVide();
        Assertions.assertThrows(FichierVideExceptions.class, ()->
                serviceQuestionnaireTest.fournirListeQuestionnaires("chargementVide.csv"),"Nom du fichier incorrect ou inexistant");
    }

    @Test
    public void chargementQuestionnaireNomInvalide() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ServiceQuestionnaireImpl();
        Assertions.assertThrows(FichierPasTrouveExceptions.class, ()->
                serviceQuestionnaireTest.fournirListeQuestionnaires("okok.csv"),"Nom du fichier incorrect ou inexistant");
    }

}

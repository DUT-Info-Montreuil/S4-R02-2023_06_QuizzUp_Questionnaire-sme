package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import java.util.ArrayList;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierVideExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;

public class ServiceQuestionnaireChargementTest  {
    
    private IServiceQuestion serviceQuestionnaireTest;
    @Test
    public void ChargementQuestionnaireCorrect() throws FichierPasTrouveExceptions, FichierVideExceptions, FichierIncorrectExceptions {
        serviceQuestionnaireTest = new ChargementQuestionnaireImplmockOk();
        QuestionDTO objetattendue = new QuestionDTO(1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        ArrayList<QuestionDTO> questionattendue = new ArrayList<QuestionDTO>();
        questionattendue.add(objetattendue);
        QuestionnaireDTO QuestionnaireCorrect = new QuestionnaireDTO(1, questionattendue);
        ArrayList<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(QuestionnaireCorrect);
        ArrayList<QuestionnaireDTO> reponsecorrect = (ArrayList<QuestionnaireDTO>) serviceQuestionnaireTest.fournirListeQuestionnaires("test");
        Assertions.assertEquals(QuestionnaireCorrect.getId_questionnaire(), reponsecorrect.get(0).getId_questionnaire());
        Assertions.assertEquals(reponse.get(0).getQuestions().get(0).getLibelle(), reponsecorrect.get(0).getQuestions().get(0).getLibelle());
    }
    @Test
    public void chargementQuestionnaireIncorrect() throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        serviceQuestionnaireTest = new ChargementQuestionnaireImplmockOk();
        // QuestionDTO questionIncorrectAttendu = new QuestionDTO("De quel petit objet se munit le golfeur pour surelever sa balle avant de la frapper ",null);
        //serviceQuestionnaireTest.chargerListeQuestionnaire("chargementIncorrect.csv");
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
        serviceQuestionnaireTest = new ChargementQuestionnaireImplmockInvalide();
        Assertions.assertThrows(FichierPasTrouveExceptions.class, ()->
                serviceQuestionnaireTest.fournirListeQuestionnaires("okok.csv"),"Nom du fichier incorrect ou inexistant");
    }

}

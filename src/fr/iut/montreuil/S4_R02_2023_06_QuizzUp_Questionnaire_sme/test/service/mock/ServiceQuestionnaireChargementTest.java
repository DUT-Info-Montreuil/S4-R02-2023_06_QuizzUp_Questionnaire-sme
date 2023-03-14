package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;

public class ServiceQuestionnaireChargementTest  {
    
    private IServiceQuestion serviceQuestionnaireTest;
    @Test
    public void ChargementQuestionnaireCorrect(){
        serviceQuestionnaireTest = new ChargementQuestionnaireImplmockOk();
        QuestionDTO objetattendue = new QuestionDTO(1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        ArrayList<QuestionDTO> questionattendue = new ArrayList<QuestionDTO>();
        questionattendue.add(objetattendue);
        QuestionnaireDTO QuestionnaireCorrect = new QuestionnaireDTO(1, questionattendue);
        ArrayList<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(QuestionnaireCorrect);
        ArrayList<QuestionnaireDTO> reponse correct = serviceQuestionnaireTest.fournirListeQuestionnaires("test");
        Assertions.assertEquals(QuestionnaireCorrect.getId(), reponse correct.get(0).getId());
        Assertions.assertEquals(reponse.get(0).getQuestions().get(0).getQuestion(), reponse correct.get(0).getQuestions().get(0).getQuestion());
    }

}

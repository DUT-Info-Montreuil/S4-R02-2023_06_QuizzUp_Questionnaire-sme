package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ChargementQuestionnaireImplmockOk;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ChargementQuestionnaireTest {
    @Test
    public List<QuestionDTO> chargementQuestionnaireTestOk(){
        IServiceQuestion serviceatester = new ChargementQuestionnaireImplmockOk();
        QuestionDTO objetattendue = new QuestionDTO(1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        List<QuestionDTO> questionattendue = new ArrayList<QuestionDTO>();
        questionattendue.add(objetattendue);
        QuestionnaireDTO QuestionnaireCorrect = new QuestionnaireDTO(questionattendue);
        List<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(QuestionnaireCorrect);
        return reponse;
    }
    public List<QuestionDTO> chargementQuestionnaireTestVide(){
        IServiceQuestion serviceatester = new ChargementQuestionnaireImplmockOk();
        QuestionDTO objetattendue = new QuestionDTO();
        List<QuestionDTO> questionattendue = new ArrayList<QuestionDTO>();
        questionattendue.add(objetattendue);
        QuestionnaireDTO QuestionnaireIncorrect = new QuestionnaireDTO(questionattendue);
        List<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(QuestionnaireIncorrect);
        return reponse;
    }

    public List<QuestionDTO> chargementQuestionnaireTestError(){
        IServiceQuestion serviceatester = new ChargementQuestionnaireImplmockOk();
        QuestionDTO objetattendue = new QuestionDTO();
        List<QuestionDTO> questionattendue = new ArrayList<QuestionDTO>();
        questionattendue.add(objetattendue);
        QuestionnaireDTO QuestionnaireError = new QuestionnaireDTO(questionattendue);
        List<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(QuestionnaireError);
        return reponse;
    }
}

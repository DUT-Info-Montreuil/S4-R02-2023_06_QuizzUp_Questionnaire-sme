package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock.ChargementQuestionnaireImplmockOk;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ChargementQuestionnaireTest  {
    private IServiceQuestion serviceQuestionnaireTest;
    @Test
    public List<QuestionnaireDTO> chargementQuestionnaireTestOk(){
        IServiceQuestion serviceatester = new ChargementQuestionnaireImplmockOk();
        QuestionDTO objetattendue = new QuestionDTO(1, 1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        ArrayList<QuestionDTO> questionattendue = new ArrayList<QuestionDTO>();
        questionattendue.add(objetattendue);
        QuestionnaireDTO QuestionnaireCorrect = new QuestionnaireDTO(1, questionattendue, 0);
        List<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(QuestionnaireCorrect);
        return reponse;
    }
}

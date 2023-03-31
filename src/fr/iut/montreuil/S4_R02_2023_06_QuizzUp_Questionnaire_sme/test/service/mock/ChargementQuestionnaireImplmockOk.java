package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;

import java.util.ArrayList;


public class ChargementQuestionnaireImplmockOk implements IServiceQuestion {

    @Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires(String nomFichier) {
        QuestionDTO questionCorrect = new QuestionDTO(1, 1, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok");
        ArrayList<QuestionDTO> listQuestionsCorrect = new ArrayList<>();
        listQuestionsCorrect.add(questionCorrect);
        QuestionnaireDTO leQuestionnaireCorrect = new QuestionnaireDTO(1,listQuestionsCorrect, 0);
        ArrayList<QuestionnaireDTO> reponseCorrect = new ArrayList<QuestionnaireDTO>();
        reponseCorrect.add(leQuestionnaireCorrect);
        return reponseCorrect;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(String nomfichier, int indiceQuestionnaire) {
        return null;
    }
}
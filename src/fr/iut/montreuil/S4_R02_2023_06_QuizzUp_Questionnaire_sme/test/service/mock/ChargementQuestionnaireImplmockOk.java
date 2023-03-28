package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;

import java.util.ArrayList;
import java.util.List;


public class ChargementQuestionnaireImplmockOk implements IServiceQuestion {

    @Override
    public List<QuestionnaireDTO> fournirListeQuestionnaires(String nomFichier) {

        QuestionDTO Correctquestion = new QuestionDTO(0, "FR", "De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?", "GG", 1, "yes", "ok", 0, 0);
        ArrayList<QuestionDTO> Correctquestionnaire = new ArrayList<QuestionDTO>();
        Correctquestionnaire.add(Correctquestion);
        QuestionnaireDTO CorrectQuestionnaire = new QuestionnaireDTO(1, Correctquestionnaire);
        List<QuestionnaireDTO> reponse = new ArrayList<QuestionnaireDTO>();
        reponse.add(CorrectQuestionnaire);
        return reponse;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(String nomfichier, int indiceQuestionnaire) {
        return null;
    }
}
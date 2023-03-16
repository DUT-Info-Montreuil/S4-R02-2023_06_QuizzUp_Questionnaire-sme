package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierVideExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;

import java.util.List;

public class ChargementQuestionnaireImplmockVide implements IServiceQuestion {
    @Override
    public List<QuestionnaireDTO> fournirListeQuestionnaires(String nomFichier) throws FichierVideExceptions {
        throw new FichierVideExceptions();
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(String nomFichier, int indiceQuestionnaire) {
        return null;
    }
}

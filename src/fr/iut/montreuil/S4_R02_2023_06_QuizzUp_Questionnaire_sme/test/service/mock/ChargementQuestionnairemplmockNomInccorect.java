package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.test.service.mock;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierVideExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;

import java.util.List;

public class ChargementQuestionnairemplmockNomInccorect implements IServiceQuestion {
    @Override
    public List<QuestionnaireDTO> fournirListeQuestionnaires(String nomFichier) throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions {
        throw new FichierPasTrouveExceptions();
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(String nomFichier, int indiceQuestionnaire) {
        return null;
    }
}

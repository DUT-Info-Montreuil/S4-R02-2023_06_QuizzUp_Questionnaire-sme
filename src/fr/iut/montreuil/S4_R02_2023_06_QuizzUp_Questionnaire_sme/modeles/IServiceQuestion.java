package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierIncorrectExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierPasTrouveExceptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.FichierVideExceptions;

import java.io.File;
import java.util.List;

public interface IServiceQuestion {
    public List<QuestionnaireDTO> fournirListeQuestionnaires(String nomFichier) throws FichierIncorrectExceptions, FichierPasTrouveExceptions, FichierVideExceptions;
    public QuestionnaireDTO fournirUnQuestionnaire(String nomFichier, int indiceQuestionnaire);

}

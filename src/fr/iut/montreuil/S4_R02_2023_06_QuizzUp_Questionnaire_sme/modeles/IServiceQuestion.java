package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;

import java.io.File;
import java.util.List;

public interface IServiceQuestion {
    public List<QuestionnaireDTO> fournirListeQuestionnaires(String nomFichier);
    public QuestionnaireDTO fournirUnQuestionnaire(String nomFichier, int indiceQuestionnaire);

}

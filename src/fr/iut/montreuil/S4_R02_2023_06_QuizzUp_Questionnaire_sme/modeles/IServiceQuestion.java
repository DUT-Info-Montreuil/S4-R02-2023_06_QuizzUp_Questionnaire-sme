package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;

import java.io.File;

public interface IServiceQuestion {
    public QuestionnaireDTO chargerListeQuestionnaire(File fichier);
}

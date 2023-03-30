package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsQuestDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.IdQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.NbFoisJoueQuestionnaireIncorrectExeptions;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.StatsQuestionsIncorrectExeptions;

import java.util.ArrayList;
import java.util.Comparator;

public interface IServiceStatsQuestionnaire {
    public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws NbFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions, IdQuestionnaireIncorrectExeptions;

    public StatsQuestDTO trouverQuestionLaPlusFacile(ArrayList<StatsQuestDTO> questions);

    public StatsQuestDTO trouverQuestionLaPlusDure(ArrayList<StatsQuestDTO> questions);
}
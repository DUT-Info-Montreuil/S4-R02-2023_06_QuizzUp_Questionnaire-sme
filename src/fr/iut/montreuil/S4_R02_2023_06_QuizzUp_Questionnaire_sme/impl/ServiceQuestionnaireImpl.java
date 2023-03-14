package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServiceQuestionnaireImpl implements IServiceQuestion {
    @Override
    public List<QuestionnaireDTO> fournirListeQuestionnaires(String nomFichier) {
        ArrayList<QuestionnaireDTO> questionnaires = new ArrayList<QuestionnaireDTO>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String line;
            int currentQuestionnaireId = -1;
            ArrayList<QuestionDTO> currentQuestions = new ArrayList<QuestionDTO>();

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");

                // Check if this line belongs to a new questionnaire
                int questionnaireId = Integer.parseInt(fields[0]);
                if (questionnaireId != currentQuestionnaireId) {
                    // Add the previous questionnaire to the list, if any
                    if (currentQuestionnaireId != -1) {
                        questionnaires.add(new QuestionnaireDTO(currentQuestionnaireId, currentQuestions));
                    }
                    // Start a new questionnaire
                    currentQuestionnaireId = questionnaireId;
                    currentQuestions = new ArrayList<QuestionDTO>();
                }

                // Create a new question and add it to the current questionnaire
                int questionId = Integer.parseInt(fields[1]);
                String langage = fields[2];
                String libelle = fields[3];
                String reponse = fields[4];
                int difficulte = Integer.parseInt(fields[5]);
                String explication = fields[6];
                String reference = fields[7];
                currentQuestions.add(new QuestionDTO(questionId, langage, libelle, reponse, difficulte, explication, reference));
            }

            // Add the last questionnaire to the list, if any
            if (currentQuestionnaireId != -1) {
                questionnaires.add(new QuestionnaireDTO(currentQuestionnaireId, currentQuestions));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return questionnaires;    
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(String nomFichier, int indiceQuestionnaire) {
        List<QuestionnaireDTO> questionnaires = fournirListeQuestionnaires(nomFichier);
        if (indiceQuestionnaire >= 0 && indiceQuestionnaire < questionnaires.size()) {
            return questionnaires.get(indiceQuestionnaire);
        } else {
            return null;
        }
    }
}

package fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.impl;

import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.bo.QuestionnaireBO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.dto.StatsQuestDTO;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.entities.utilis.exceptions.*;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceQuestion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import fr.iut.montreuil.S4_R02_2023_06_QuizzUp_Questionnaire_sme.modeles.IServiceStatsQuestionnaire;

public class ServiceQuestionnaireImpl implements IServiceQuestion, IServiceStatsQuestionnaire {

    private QuestionnaireBO questionnaireBO;

    @Override
    public List<QuestionnaireDTO> fournirListeQuestionnaires(String nomFichier) throws FichierIncorrectExceptions, FichierVideExceptions, FichierPasTrouveExceptions {
        ArrayList<QuestionnaireDTO> questionnairesDTO = new ArrayList<QuestionnaireDTO>();

        try (CSVReader reader = new CSVReader(new FileReader(nomFichier))) {
            String[] fields;
            //int currentQuestionnaireId = -1;
            //ArrayList<QuestionDTO> currentQuestions = new ArrayList<QuestionDTO>();
            while ((fields = reader.readNext()) != null) {
                questionnaireBO.getIdQuestionnaires().add(Integer.parseInt(fields[0]));
                questionnaireBO.getNumQuestions().add(Integer.parseInt(fields[1]));
                questionnaireBO.getLangues().add(fields[2]);
                questionnaireBO.getLibelles().add(fields[3]);
                questionnaireBO.getReponses().add(fields[4]);
                questionnaireBO.getDifficultes().add(Integer.parseInt(fields[5]));
                questionnaireBO.getExplications().add(fields[6]);
                questionnaireBO.getReferences().add(fields[7]);

                /* 
                int questionnaireId = Integer.parseInt(fields[0]);
                if (questionnaireId != currentQuestionnaireId) {
                    if (currentQuestionnaireId != -1) {
                        questionnaires.add(new QuestionnaireDTO(currentQuestionnaireId, currentQuestions));
                    }
                    currentQuestionnaireId = questionnaireId;
                    currentQuestions = new ArrayList<QuestionDTO>();
                }

                int questionId = Integer.parseInt(fields[1]);
                String langage = fields[2];
                String libelle = fields[3];
                String reponse = fields[4];
                int difficulte = Integer.parseInt(fields[5]);
                String explication = fields[6];
                String reference = fields[7];
                currentQuestions.add(new QuestionDTO(questionId, langage, libelle, reponse, difficulte, explication, reference));
                */
            }
            /* 
            if (currentQuestionnaireId != -1) {
                questionnairesDTO.add(new QuestionnaireDTO(currentQuestionnaireId, currentQuestions));
            }*/
            if (questionnaireBO.getIdQuestionnaires().size() == 0) {
                throw new FichierVideExceptions();
            }
        } catch (FileNotFoundException e) {
            throw new FichierPasTrouveExceptions();
        } catch (NumberFormatException e) {
            throw new FichierIncorrectExceptions();
        }  catch (ArrayIndexOutOfBoundsException e) {
            throw new FichierIncorrectExceptions();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int i = 0;
        int idQuestionnaire;
        ArrayList<QuestionDTO> questionsDTO;

        while (i < questionnaireBO.getIdQuestionnaires().size()) {
            questionsDTO = new ArrayList<QuestionDTO>();
            idQuestionnaire = questionnaireBO.getIdQuestionnaires().get(i);
            while (i < questionnaireBO.getIdQuestionnaires().size() && questionnaireBO.getIdQuestionnaires().get(i) == idQuestionnaire) {
                questionsDTO.add(new QuestionDTO(questionnaireBO.getIdQuestionnaires().get(i), questionnaireBO.getNumQuestions().get(i), questionnaireBO.getLibelles().get(i), questionnaireBO.getReponses().get(i), questionnaireBO.getLangues().get(i), questionnaireBO.getDifficultes().get(i), questionnaireBO.getExplications().get(i), questionnaireBO.getReferences().get(i)));
                i++;
            }
            questionnairesDTO.add(new QuestionnaireDTO(idQuestionnaire, questionsDTO, 0));
        }
        return questionnairesDTO;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(String nomFichier, int indiceQuestionnaire) throws FichierIncorrectExceptions, FichierVideExceptions, FichierPasTrouveExceptions {
        List<QuestionnaireDTO> questionnaires = fournirListeQuestionnaires(nomFichier);
        if (indiceQuestionnaire >= 0 && indiceQuestionnaire < questionnaires.size()) {
            return questionnaires.get(indiceQuestionnaire);
        } else {
            return null;
        }
    }

    @Override
    public StatsDTO fournirStatsQuestions(QuestionnaireDTO questionnaire) throws NbFoisJoueQuestionnaireIncorrectExeptions, StatsQuestionsIncorrectExeptions {
        return null;
    }

    @Override
    public StatsQuestDTO trouverQuestionLaPlusFacile(ArrayList<StatsQuestDTO> questions) {
        return null;
    }

    @Override
    public StatsQuestDTO trouverQuestionLaPlusDure(ArrayList<StatsQuestDTO> questions) {
        return null;
    }
}

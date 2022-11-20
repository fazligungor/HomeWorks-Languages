package com.works.homework4_1.business.concretes;

import com.works.homework4_1.business.abstracts.LanguageService;
import com.works.homework4_1.business.requests.programLanguage.CreateProgramLanguageRequest;
import com.works.homework4_1.business.requests.programLanguage.DeleteProgramLanguageRequest;
import com.works.homework4_1.business.requests.programLanguage.UpdateLanguageRequest;
import com.works.homework4_1.business.responses.programLanguage.GetAllProgramLanguageResponses;
import com.works.homework4_1.dataAccess.ProgramLanguageRepository;
import com.works.homework4_1.entities.concretes.ProgramLanguage;
import com.works.homework4_1.exception.ProgramLanguageAlreadyExistException;
import com.works.homework4_1.exception.ProgramLanguageNotFoundException;
import com.works.homework4_1.exceptionhandler.TestExcetpionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private ProgramLanguageRepository languageRepository;

    @Autowired
    public LanguageManager(ProgramLanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllProgramLanguageResponses> getAll() {
        List<ProgramLanguage> languages = languageRepository.findAll();
        List<GetAllProgramLanguageResponses> getAllProgramLanguageResponses = new ArrayList<>();
        for (ProgramLanguage programLanguage : languages) {
            GetAllProgramLanguageResponses programLanguageResponses = new GetAllProgramLanguageResponses();
            programLanguageResponses.setName(programLanguage.getName());
            programLanguageResponses.setId(programLanguage.getId());
            getAllProgramLanguageResponses.add(programLanguageResponses);
        }
        return getAllProgramLanguageResponses;
    }

    @Override
    public void addProgramLanguage(CreateProgramLanguageRequest createProgramLanguageRequest) {
        List<ProgramLanguage> languages = languageRepository.findAll();
        ProgramLanguage language = new ProgramLanguage();
        if (languages.isEmpty()) {
            language.setName(createProgramLanguageRequest.getName());
            language.setTechnologies(createProgramLanguageRequest.getTechnologies());
            languageRepository.save(language);
        }
        for (ProgramLanguage language1 : languages) {
            if (!createProgramLanguageRequest.getName().equals(language1.getName())) {
                language.setName(createProgramLanguageRequest.getName());
                language.setTechnologies(createProgramLanguageRequest.getTechnologies());
                languageRepository.save(language);
                System.out.println("Language has been added succesfully !");
            }
            throw new ProgramLanguageAlreadyExistException();
        }
    }

    @Override
    public void updateLanguage(UpdateLanguageRequest updateLanguageRequest) {
        List<ProgramLanguage> languages = languageRepository.findAll();
        ProgramLanguage language = new ProgramLanguage();
        try {
            for (ProgramLanguage language1 : languages) {
                if (language1.getName().equals(updateLanguageRequest.getName())) {
                    language.setName(updateLanguageRequest.getName());
                    language.setTechnologies(updateLanguageRequest.getTechnologies());
                    languageRepository.saveAndFlush(language);
                    System.out.println("Language updated succesfully");
                }
            }
        } catch (ProgramLanguageNotFoundException e) {
            e.getMessage();
        }
    }

    @Override
    public void deleteLanguage(DeleteProgramLanguageRequest deleteProgramLanguageRequest) {
        List<ProgramLanguage> languages = languageRepository.findAll();
        for (ProgramLanguage language : languages) {
            if (language.getId() == deleteProgramLanguageRequest.getId()) {
                languageRepository.deleteById(deleteProgramLanguageRequest.getId());
                System.out.println("Language deleted succesfully!");
            }
        }
        throw new ProgramLanguageNotFoundException();
    }
}

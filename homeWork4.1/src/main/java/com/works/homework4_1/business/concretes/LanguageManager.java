package com.works.homework4_1.business.concretes;

import com.works.homework4_1.business.abstracts.LanguageService;
import com.works.homework4_1.dataAccess.abstracts.LanguageRepository;
import com.works.homework4_1.entities.concretes.ProgramLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<ProgramLanguage> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public ProgramLanguage getLanguageById(int id) {
        return languageRepository.getLanguageById(id);
    }

    @Override
    public ProgramLanguage addProgramLanguage(ProgramLanguage language) {
        return languageRepository.addProgramLanguage(language);
    }

    @Override
    public ProgramLanguage updateLanguage(ProgramLanguage language) {
        return languageRepository.updateLanguage(language);
    }

    @Override
    public ProgramLanguage deleteLanguage(int id) {
        return languageRepository.deleteLanguage(id);
    }

}

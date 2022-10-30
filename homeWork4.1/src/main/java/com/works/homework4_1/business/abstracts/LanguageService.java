package com.works.homework4_1.business.abstracts;

import com.works.homework4_1.entities.concretes.ProgramLanguage;

import java.util.List;

public interface LanguageService {
    List<ProgramLanguage> getAll();

    ProgramLanguage getLanguageById(int id);
    ProgramLanguage addProgramLanguage(ProgramLanguage language);
    ProgramLanguage updateLanguage(ProgramLanguage language);
    ProgramLanguage deleteLanguage(int id);

}

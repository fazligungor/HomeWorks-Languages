package com.works.homework4_1.dataAccess.abstracts;

import com.works.homework4_1.entities.concretes.ProgramLanguage;
import org.springframework.context.annotation.Bean;

import java.util.List;
public interface LanguageRepository {
    List<ProgramLanguage> getAll();

    ProgramLanguage getLanguageById(int id);
    ProgramLanguage addProgramLanguage(ProgramLanguage language);
    ProgramLanguage updateLanguage(ProgramLanguage language);
    ProgramLanguage deleteLanguage(int id);

}

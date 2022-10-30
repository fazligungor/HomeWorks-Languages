package com.works.homework4_1.dataAccess.concretes;

import com.works.homework4_1.dataAccess.abstracts.LanguageRepository;
import com.works.homework4_1.entities.concretes.ProgramLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<ProgramLanguage> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<ProgramLanguage>();

        languages.add(new ProgramLanguage(1, "C#"));
        languages.add(new ProgramLanguage(2, "Java"));
        languages.add(new ProgramLanguage(3, "Python"));
    }

    @Override
    public List<ProgramLanguage> getAll() {
        return languages;
    }

    @Override
    public ProgramLanguage getLanguageById(int id) {
        return languages.get(id);
    }

    @Override
    public ProgramLanguage addProgramLanguage(ProgramLanguage language) {
        try {
           if (languages.get(language.getId()).equals(language)){
               System.out.println("exist program language");
           }
        }catch (Exception e){
                languages.add(language);
        }
        return language;
    }

    @Override
    public ProgramLanguage updateLanguage(ProgramLanguage language) {
        languages.set(language.getId(), language);
        return language;
    }

    @Override
    public ProgramLanguage deleteLanguage(int id) {
        languages.remove(id);
        return null;
    }
}

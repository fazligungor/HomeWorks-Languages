package com.works.homework4_1.dataAccess;

import com.works.homework4_1.entities.concretes.ProgramLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramLanguageRepository extends JpaRepository<ProgramLanguage, Integer> {
    ProgramLanguage getByName(String name);

}
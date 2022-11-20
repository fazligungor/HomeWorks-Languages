package com.works.homework4_1.business.abstracts;

import com.works.homework4_1.business.requests.programLanguage.CreateProgramLanguageRequest;
import com.works.homework4_1.business.requests.programLanguage.DeleteProgramLanguageRequest;
import com.works.homework4_1.business.requests.programLanguage.UpdateLanguageRequest;
import com.works.homework4_1.business.responses.programLanguage.GetAllProgramLanguageResponses;
import com.works.homework4_1.entities.concretes.ProgramLanguage;

import java.util.List;

public interface LanguageService {
    List<GetAllProgramLanguageResponses> getAll();
    void addProgramLanguage(CreateProgramLanguageRequest createProgramLanguageRequest);
    void updateLanguage(UpdateLanguageRequest updateLanguageRequest);
    void deleteLanguage(DeleteProgramLanguageRequest deleteProgramLanguageRequest);

}

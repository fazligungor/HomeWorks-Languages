package com.works.homework4_1.webApi;

import com.works.homework4_1.business.abstracts.LanguageService;
import com.works.homework4_1.business.requests.programLanguage.CreateProgramLanguageRequest;
import com.works.homework4_1.business.requests.programLanguage.DeleteProgramLanguageRequest;
import com.works.homework4_1.business.requests.programLanguage.UpdateLanguageRequest;
import com.works.homework4_1.business.responses.programLanguage.GetAllProgramLanguageResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<GetAllProgramLanguageResponses> getAll() {
        return languageService.getAll();
    }

    @PostMapping("/addLanguage")
    public void addProgramLanguage(@RequestBody CreateProgramLanguageRequest language) {
        languageService.addProgramLanguage(language);
    }

    @PutMapping("/updateLanguage")
    public void updateLanguage(@RequestBody UpdateLanguageRequest language) {
        languageService.updateLanguage(language);
    }

    @DeleteMapping("/deleteLanguage")
    public void deleteLanguage(@RequestBody DeleteProgramLanguageRequest languageRequest) {
        languageService.deleteLanguage(languageRequest);
    }
}

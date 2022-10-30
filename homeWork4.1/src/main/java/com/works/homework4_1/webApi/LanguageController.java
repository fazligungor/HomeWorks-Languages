package com.works.homework4_1.webApi;

import com.works.homework4_1.business.abstracts.LanguageService;
import com.works.homework4_1.entities.concretes.ProgramLanguage;
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
    public List<ProgramLanguage> getAll(){
        return languageService.getAll();
    }
    @GetMapping("/{id}")
    public ProgramLanguage getLanguageById(@PathVariable int id){
        return languageService.getLanguageById(id);
    }
    @PostMapping("/addLanguage")
    public ProgramLanguage addProgramLanguage(@RequestBody ProgramLanguage language){
        return languageService.addProgramLanguage(language);
    }
    @PutMapping("/updateLanguage")
    public ProgramLanguage updateLanguage(@RequestBody ProgramLanguage language){
        return languageService.updateLanguage(language);
    }
    @DeleteMapping("/deleteLanguage/{id}")
    public ProgramLanguage deleteLanguage(@PathVariable int id){
        return languageService.deleteLanguage(id);
    }
}

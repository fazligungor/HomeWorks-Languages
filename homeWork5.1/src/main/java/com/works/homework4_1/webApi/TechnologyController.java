package com.works.homework4_1.webApi;

import com.works.homework4_1.business.abstracts.TechnologyService;
import com.works.homework4_1.business.requests.programLanguage.CreateProgramLanguageRequest;
import com.works.homework4_1.business.requests.programLanguage.DeleteProgramLanguageRequest;
import com.works.homework4_1.business.requests.programLanguage.UpdateLanguageRequest;
import com.works.homework4_1.business.requests.technology.CreateTechnologyRequest;
import com.works.homework4_1.business.requests.technology.DeleteTechnologyRequest;
import com.works.homework4_1.business.requests.technology.UpdateTechnologyRequest;
import com.works.homework4_1.business.responses.programLanguage.GetAllProgramLanguageResponses;
import com.works.homework4_1.business.responses.technology.GetAllTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technology")
public class TechnologyController {

    private TechnologyService technologyService;

    @Autowired
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping("/getAll")
    public List<GetAllTechnologyResponse> getAll() {
        return technologyService.getAll();
    }

    @PostMapping("/addLanguage")
    public void addTechnology(@RequestBody CreateTechnologyRequest createTechnologyRequest) {
        technologyService.addTechnologyLanguage(createTechnologyRequest);
    }

    @PutMapping("/updateLanguage")
    public void updateLanguage(@RequestBody UpdateTechnologyRequest updateTechnologyRequest) {
        technologyService.updateTechnology(updateTechnologyRequest);
    }

    @DeleteMapping("/deleteLanguage/{id}")
    public void deleteLanguage(@PathVariable DeleteTechnologyRequest deleteTechnologyRequest) {
        technologyService.deleteTechnology(deleteTechnologyRequest);
    }
}

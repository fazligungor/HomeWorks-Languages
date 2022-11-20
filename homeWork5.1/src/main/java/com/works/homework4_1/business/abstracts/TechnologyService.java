package com.works.homework4_1.business.abstracts;

import com.works.homework4_1.business.requests.technology.CreateTechnologyRequest;
import com.works.homework4_1.business.requests.technology.DeleteTechnologyRequest;
import com.works.homework4_1.business.requests.technology.UpdateTechnologyRequest;
import com.works.homework4_1.business.responses.technology.GetAllTechnologyResponse;

import java.util.List;

public interface TechnologyService {

    List<GetAllTechnologyResponse> getAll();
    void addTechnologyLanguage(CreateTechnologyRequest createTechnologyRequest);
    void updateTechnology(UpdateTechnologyRequest updateTechnologyRequest);
    void deleteTechnology(DeleteTechnologyRequest deleteTechnologyRequest);

}

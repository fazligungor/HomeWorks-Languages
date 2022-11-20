package com.works.homework4_1.business.concretes;

import com.works.homework4_1.business.abstracts.TechnologyService;
import com.works.homework4_1.business.requests.technology.CreateTechnologyRequest;
import com.works.homework4_1.business.requests.technology.DeleteTechnologyRequest;
import com.works.homework4_1.business.requests.technology.UpdateTechnologyRequest;
import com.works.homework4_1.business.responses.technology.GetAllTechnologyResponse;
import com.works.homework4_1.dataAccess.TechnologyRepository;
import com.works.homework4_1.entities.concretes.Technology;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TechnologyManager implements TechnologyService {

    private final TechnologyRepository technologyRepository;

    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyResponse> getAllTechnologyResponses = new ArrayList<>();
        for (Technology technology : technologies) {
            GetAllTechnologyResponse response = new GetAllTechnologyResponse();
            response.setProgramLanguage(technology.getProgramLanguage());
            response.setName(technology.getName());
            response.setId(technology.getId());
            getAllTechnologyResponses.add(response);
        }
        return getAllTechnologyResponses;
    }

    @Override
    public void addTechnologyLanguage(CreateTechnologyRequest createTechnologyRequest) {
        List<Technology> technologies = technologyRepository.findAll();
        Technology technology = new Technology();
        try {
            for (Technology technology1 : technologies) {
                if (createTechnologyRequest.getName().equals(technology1.getName())) {
                    System.out.println("Bu teknolojı mevcut");
                }
            }
        } catch (Exception e) {
            technology.setName(createTechnologyRequest.getName());
            technology.setProgramLanguage(createTechnologyRequest.getProgramLanguage());
            technologyRepository.save(technology);
            System.out.println("Basarılı bır sekılde eklenmıstır.");
        }
    }

    @Override
    public void updateTechnology(UpdateTechnologyRequest updateTechnologyRequest) {
        List<Technology> technologies = technologyRepository.findAll();
        Technology technology = new Technology();
        try {
            for (Technology technology1 : technologies) {
                if (!updateTechnologyRequest.getName().equals(technology1.getName())) {
                    System.out.println("Bu teknolojı mevcut degil");
                }
            }
        } catch (Exception e) {
            technology.setName(updateTechnologyRequest.getName());
            technology.setProgramLanguage(updateTechnologyRequest.getProgramLanguage());
            technologyRepository.saveAndFlush(technology);
            System.out.println("Basarılı bır sekılde guncellenmıstır");
        }
    }

    @Override
    public void deleteTechnology(DeleteTechnologyRequest deleteTechnologyRequest) {
        List<Technology> technologies = technologyRepository.findAll();
        try {
            for (Technology technology1 : technologies) {
                if (!(technology1.getId() == deleteTechnologyRequest.getId())) {
                    System.out.println("Bu teknolojı mevcut degil");
                }
            }
        } catch (Exception e) {
            technologyRepository.delete(technologies.get(deleteTechnologyRequest.getId()));
            System.out.println("Basarılı bır sekılde silinmiştir.");
        }
    }
}

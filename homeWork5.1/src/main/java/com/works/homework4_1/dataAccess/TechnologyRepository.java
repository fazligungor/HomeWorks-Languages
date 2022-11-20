package com.works.homework4_1.dataAccess;

import com.works.homework4_1.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {
    Technology getByName(String name);

}
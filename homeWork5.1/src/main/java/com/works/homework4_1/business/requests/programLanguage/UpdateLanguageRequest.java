package com.works.homework4_1.business.requests.programLanguage;

import com.works.homework4_1.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageRequest {
    private int id;
    private String name;
    private List<Technology> technologies;
}

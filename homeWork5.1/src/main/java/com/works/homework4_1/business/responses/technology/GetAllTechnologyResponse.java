package com.works.homework4_1.business.responses.technology;

import com.works.homework4_1.entities.concretes.ProgramLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechnologyResponse {
    private int id;
    private String name;
    private ProgramLanguage programLanguage;
}

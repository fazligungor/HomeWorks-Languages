package com.works.homework4_1.business.requests.technology;

import com.works.homework4_1.entities.concretes.ProgramLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTechnologyRequest {
    private String name;
    private ProgramLanguage programLanguage;
}

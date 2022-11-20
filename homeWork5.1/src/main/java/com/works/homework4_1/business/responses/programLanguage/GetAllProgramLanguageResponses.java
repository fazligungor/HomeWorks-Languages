package com.works.homework4_1.business.responses.programLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.tools.AbstractTrace;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgramLanguageResponses {
    private int id;
    private String name;

}

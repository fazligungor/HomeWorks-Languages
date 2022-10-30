package com.works.homework4_1.entities.concretes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class ProgramLanguage {
    private int id;
    private String name;

    public ProgramLanguage() {
    }

    public ProgramLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

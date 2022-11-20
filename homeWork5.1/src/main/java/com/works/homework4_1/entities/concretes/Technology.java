package com.works.homework4_1.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "Technology")
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid")
    private int id;

    @Column(name = "technologyName")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "languageId")
    private ProgramLanguage programLanguage;
}

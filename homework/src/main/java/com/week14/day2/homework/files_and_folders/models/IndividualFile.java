package com.week14.day2.homework.files_and_folders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "individual_files")
public class IndividualFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    String name;

    @Column(name = "extension")
    String extension;

    @Column(name = "size")
    int size;

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
//    @JsonIgnoreProperties({"individualFile"})
    private Folder folder;

}

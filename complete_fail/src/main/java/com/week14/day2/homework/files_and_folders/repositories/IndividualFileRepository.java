package com.week14.day2.homework.files_and_folders.repositories;

import com.week14.day2.homework.files_and_folders.models.IndividualFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualFileRepository extends JpaRepository<IndividualFile, Long> {
}

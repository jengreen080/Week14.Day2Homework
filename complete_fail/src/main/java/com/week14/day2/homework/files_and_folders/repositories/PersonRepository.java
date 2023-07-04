package com.week14.day2.homework.files_and_folders.repositories;

import com.week14.day2.homework.files_and_folders.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}

package com.week14.day2.homework.files_and_folders.other;

import com.week14.day2.homework.files_and_folders.models.Person;
import com.week14.day2.homework.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        Person person1 = new Person();
        personRepository.save(person1);
    }

}

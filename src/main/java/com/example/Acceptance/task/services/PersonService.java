package com.example.Acceptance.task.services;

import org.springframework.stereotype.Service;
import com.example.Acceptance.task.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Acceptance.task.repository.PersonRepository;

import java.util.List;
import java.time.Period;
import java.util.Optional;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Optional<Person> findById(int id){
        Optional<Person> person = personRepository.findById(id);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        person.ifPresent(value -> value.setAge(
                Period.between(LocalDate.parse(person.get().getBirthDate(),format), LocalDate.now()).getYears()));

        return person;
    }
}

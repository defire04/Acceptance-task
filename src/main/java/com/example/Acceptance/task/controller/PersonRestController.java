package com.example.Acceptance.task.controller;

//import com.example.Acceptance.task.model.Person;
//import com.example.Acceptance.task.model.Views;
//import com.example.Acceptance.task.services.PersonService;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping()
@RestController
public class PersonRestController {
//    private final PersonService personService;

//    @Autowired
//    public PersonRestController(PersonService personService) {
//        this.personService = personService;
//    }

    @GetMapping()
//    @JsonView(Views.WithBirthDate.class)
    public List<Test> personList(){
        return List.of(new Test(1), new Test(1), new Test(1), new Test(1), new Test(1));
    }

//    @JsonView(Views.WithAge.class)
//    @GetMapping("{id}")
//    public Person findPerson(@PathVariable("id") int id){
//        return personService.findById(id).orElseThrow();
//    }
}


class Test{
    private int prikol;

    public Test(int prikol) {
        this.prikol = prikol;
    }

    public int getPrikol() {
        return prikol;
    }

    public void setPrikol(int prikol) {
        this.prikol = prikol;
    }
}
package com.example.Acceptance.task.controller;

//import org.junit.jupiter.api.Test;
////import com.example.Acceptance.task.model.Person;
////import com.example.Acceptance.task.services.PersonService;
//
//
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//
//
//
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Arrays;
//import java.util.Optional;
//
//import static org.hamcrest.Matchers.*;
//import static org.mockito.ArgumentMatchers.anyInt;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(PersonRestController.class)
//class PersonRestControllerTest {
//
//    @Autowired
//    private MockMvc mvc;
//
//    @MockBean
//    private PersonService personService;
//
//
//    @Test
//    void personList() throws Exception{
//        when(personService.findAll()).thenReturn(Arrays.asList(
//                new Person(1, "Max", "Petrov",  "2004-4-19" ),
//                new Person(2, "Yui", "Ruban", "2000-11-15")
//        ));
//
//        mvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(2)))
//                .andExpect(jsonPath("$[*].id", containsInAnyOrder(1,2)))
//                .andExpect(jsonPath("$[*].name", containsInAnyOrder("Max", "Yui")))
//                .andExpect(jsonPath("$[*].surname", containsInAnyOrder("Petrov", "Ruban")))
//                .andExpect(jsonPath("$[*].birthDate", containsInAnyOrder("2004-4-19", "2000-11-15")));
//
//
//    }
//    @Test
//    void findPerson() throws Exception {
//        when(personService.findById(anyInt())).thenReturn(Optional.of(
//                        new Person(2, "Yui", "Ruban", "2000-11-15", 22)));
//
//        mvc.perform(get("/2"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", equalTo(2)))
//                .andExpect(jsonPath("$.name", equalTo( "Yui")))
//                .andExpect(jsonPath("$.surname", equalTo("Ruban")))
//                .andExpect(jsonPath("$.age", equalTo( 22)));
//    }
//}
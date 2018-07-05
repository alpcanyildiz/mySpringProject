package com.springProject.service;

import com.springProject.model.Person;

import java.util.List;

public interface PersonService {


    List<Person> getAllPerson();

    void savePerson(Person person);

    void deleteByID(Person person);

    Person getPersonByID(long id);

    void editPerson(Person person);



}

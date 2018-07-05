package com.springProject.dao;

import com.springProject.model.Person;

import java.util.List;

public interface PersonDao {

    List<Person> getAllPerson();

    void savePerson(Person person);

    Person getPersonByID(long id);

    void deleteByID(Person person);

    void editPerson(Person person);


}

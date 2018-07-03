package com.springProject.service.impl;


import com.springProject.dao.PersonDao;
import com.springProject.model.Person;
import com.springProject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImlp implements PersonService {

    private PersonDao personDao;

    @Autowired
    public PersonServiceImlp(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> getAllPerson(){

       return personDao.getAllPerson();
    }
    @Override
    public void savePerson(Person person) {
        personDao.savePerson(person);
    }
    @Override
    public void deleteByID(long personID) {
        personDao.deleteByID(personID);

    }
    @Override
    public Person getPersonByID(long id) {
        return personDao.getPersonByID(id);
    }
    @Override
    public void editPerson(Person person) {
         personDao.editPerson(person);
    }


}

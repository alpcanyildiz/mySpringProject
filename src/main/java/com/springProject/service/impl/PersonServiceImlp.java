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
    @Autowired
    private PersonDao personDao;




    public List<Person> getAllPerson(){

       return personDao.getAllPerson();
    }

    public void savePerson(Person person) {
        personDao.savePerson(person);
    }

    public void deleteByID(Person person) {
        personDao.deleteByID(person);

    }
        public Person getPersonByID(long id) {
        return personDao.getPersonByID(id);
    }

    public void editPerson(Person person) {
         personDao.editPerson(person);
    }


}

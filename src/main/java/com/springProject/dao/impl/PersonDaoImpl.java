package com.springProject.dao.impl;


import com.springProject.dao.PersonDao;
import com.springProject.model.Person;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PersonDaoImpl implements PersonDao {

    private  SessionFactory sessionFactory;

    @Autowired
    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<Person> getAllPerson() {
        Session session;

        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        Query query = session.createQuery("from Person");
        List<Person> personList = query.list();

        session.flush();
        session.close();
        return personList;
    }

    @Override
    public void savePerson(Person person) {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

      session.saveOrUpdate("Person",person);
      System.out.println("SESSION SAVED");


    }
    @Override
    public Person getPersonByID(long id) {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        Person person =(Person) session.get(Person.class,id);
        return person;

    }
    @Override
    public void deleteByID(long personID) {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        Person person = (Person) session.get(Person.class,personID) ;
        session.delete(person);

    }
    @Override
    public void editPerson(Person person) {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        session.saveOrUpdate(person);

        session.close();
    }


}

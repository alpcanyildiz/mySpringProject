package com.springProject.controller;


import com.springProject.model.Person;
import com.springProject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class PersonController {



    @Autowired
   private PersonService personService;


    @RequestMapping("/personList")
    public String personList(Model model){
        List<Person> personList = personService.getAllPerson();
        model.addAttribute("persons",personList);

        return "personList";
    }



    @RequestMapping("/personList/addPerson")
    public String addPerson(Model model){

        Person person= new Person();

        model.addAttribute("person",person);

        return "addPerson";
    }




    @RequestMapping(value = "/personList/addPerson", method = RequestMethod.POST)
    public String addPersonPost( @ModelAttribute("person") Person person){
        System.out.println("name:"+person.getName());
        System.out.println("age"+person.getAge());
        System.out.println("id"+person.getPersonID());
        System.out.println("surname"+person.getSurname());

       // if (result.hasErrors()){
       //     System.out.print("burda hata var");
       //     return "redirect:/personList/addPerson";
       //  }

        personService.savePerson(person);


        return "redirect:/personList";
    }


    @RequestMapping("/personList/deletePerson")
    public String deletePerson(@RequestParam("personID") long id)

    {System.out.print(id);
        personService.deleteByID(id);

        return "redirect:/personList";
    }

    @RequestMapping("/personList/viewPerson")
    public String viewPerson(@RequestParam("personID") long id,Model model) throws IOException {
        Person person = personService.getPersonByID(id);

        model.addAttribute("viewperson",person);

        return "viewPerson";
    }


    @RequestMapping("/personList/editPerson")
    public String editPerson(@RequestParam("personID") long id,Model model) throws IOException {

        Person person = personService.getPersonByID(id);

        model.addAttribute("editpersonPost",person);

        return "editPerson";
    }

    @PostMapping("/editPerson2")
    public String editPersonPost(@ModelAttribute("editpersonPost") Person person) {


        System.out.println(person.getPersonID());
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        personService.editPerson(person);


        return "redirect:/personList";
    }


}

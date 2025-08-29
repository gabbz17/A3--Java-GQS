package service;

import entity.People;

import java.util.ArrayList;
import java.util.List;

public class PeopleService {

    List<People> list = new ArrayList<>();

    public void create(People people) {

        if (people.getNumber().length() < 10 || people.getNumber().length() > 11) {
            throw new RuntimeException("The number have a 10 to 11 numbers");
        }

        list.add(people);
        people.setId(list.size());
        System.out.println("Create with success: \n" + people);
    }

    public void findAll() {
        System.out.println("List of peoples:");
        for (People people : list) {
            System.out.println(people);
        }
    }

    public void updateName(int id, String name) {
        People people = list.get(id - 1);

        people.setName(name);

    }


}

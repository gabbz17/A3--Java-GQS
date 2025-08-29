package service;

import entity.People;

import java.util.List;

public class PeopleService {

    List<People> list;

    public People create(People people) {

        if (people.getNumber().length() < 10 || people.getNumber().length() > 11) {
            throw new RuntimeException("The number have a 10 to 11 numbers");
        }

        list.add(people);
        people.setId(list.size());
        System.out.println("Create with success: \n" + people);
        return people;
    }

    public void findAll() {
        for (People people : list) {
            System.out.println("List of peoples:" + "\n" + people);
        }
    }

    public People updateName(int id, String name) {
        People people = list.get(id);

        people.setName(name);

        return people;
    }


}

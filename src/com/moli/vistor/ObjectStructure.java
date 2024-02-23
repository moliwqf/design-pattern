package com.moli.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author moli
 * @time 2024-02-23 16:59:38
 * @description TODO
 */
public class ObjectStructure {

    private List<Person> personList = new ArrayList<>();

    public void attach(Person person) {
        personList.add(person);
    }
    public void detach(Person person) {
        personList.remove(person);
    }
    public void display() {
        for (int i = 0; i < personList.size(); i++) {
            if (i % 2 == 0) {
                personList.get(i).accept(new Success());
            } else {
                personList.get(i).accept(new Fail());
            }
        }
    }
}

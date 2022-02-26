package com.company.study.example.chapter11;

import com.company.study.example.chapter11.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("홍길동", 15));
        person.add(new Person("김땡떙", 16));
        person.add(new Person("박똥똥", 17));

        Collections.sort(person);
        System.out.println("person : " + person);
    }
}

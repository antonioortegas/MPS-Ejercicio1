package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private final int age;
    private final String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double[] averageAgePerGender(List<Person> persons){
        double[] ages = {0,0};
        if(persons.isEmpty()){
            throw new EmptyListException("List is empty");
        }

        return ages;
    }
}

package Ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    /*
    IMPLEMENTED TESTS
    1.getters all return the correct value
    2.class constructor is correctly implemented
    3.average age of an empty list rises and exception
    4.average age function of 1 person returns the same age
    5.average age function of 2 people returns the average age between them
    6.
    7.
    8.
    9.

     */

    Person person;
    List<Person> persons;
    @BeforeEach
    void setUp() {
        person = new Person("Antonio", 21, "Male");
        persons = new ArrayList<Person>();
        double[] ages = {0,0};
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNameFunctionReturnsNameOfThePerson(){
        assertEquals(person.getName(), "Antonio");
    }

    @Test
    void getAgeFunctionReturnsAgeOfThePerson(){
        assertEquals(person.getAge(), 21);
    }

    @Test
    void getGenderFunctionReturnsGenderOfThePerson(){
        assertEquals(person.getGender(), "Male");
    }

    @Test
    void shouldAverageAgeReturn0IfListIsEmpty(){
        assertThrows(EmptyListException.class, () -> person.averageAgePerGender(persons));
    }

    @Test
    void shouldAverageAgeOf1PersonReturnTheSameAge(){
        persons.add(person);
        persons.add(new Person("Silvia", 23, "Female"));
        double[] expected = {21.0,23.0};
        double[] result = person.averageAgePerGender(persons);
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
}
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
    3.
    4.
    5.
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
}
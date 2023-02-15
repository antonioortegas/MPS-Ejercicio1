package Ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    @BeforeEach
    void setUp() {
        person = new Person("Antonio", 21, "Male");
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


}
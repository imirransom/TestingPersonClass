package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithGlasses() {
        boolean expected = false;

        Person person = new Person(expected);

       boolean actual = person.getGlasses();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHairLength(){
        Person person = new Person();
        String expected = "long";

        person.setHairLength(expected);

        String actual = person.getHairLength();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSetEthnicity(){
        Person person = new Person();
        String expected = "African American";

        person.setEthnicity(expected);

        String actual = person.getEthnicity();
        Assert.assertEquals(expected, actual);
    }




    @Test
    public void testSetHeight() {
        Person person = new Person();
        int expected = 179;

        person.setHeight(expected);

        int actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }
     @Test
    public void testSetGlasses() {
        Person person = new Person();
        boolean expected = false;

        person.setGlasses(expected);

        boolean actual = person.getGlasses();
        Assert.assertEquals(expected, actual);
     }
    @Test
    public void testSetGender() {
        Person person = new Person();
        String expected = "male";

        person.setGender(expected);

        String actual = person.getGender();
        Assert.assertEquals(expected, actual);

    }

}

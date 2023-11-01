package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;

    private String hairLength;
    private String ethnicity;
    private int height;
    private boolean glasses;

    private String gender;




    public Person() {
        this.hairLength = hairLength;
//        this.ethnicity = ethnicity;
//        this.height = height;
//        this.glasses = glasses;
//        this.gender = gender;
    }

    public void setHairLength(String heightLength){
        this.hairLength = heightLength;
    }
    public String getHairLength(String hairLength){
        return hairLength;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

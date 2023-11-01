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






//glasses constructor
    public Person(boolean glasses){
        //in centimeters
        this.glasses = glasses;

    }

    public String getGender() {return gender;}

    public void setGender(String gender) {this.gender = gender;}

    public boolean getGlasses() {return glasses;}

    public void setGlasses(boolean glasses){this.glasses = glasses;}

    public int getHeight() {return height;}

    public void setHeight(int height){
        this.height = height;
    }

    public String getEthnicity(){
        return ethnicity;
    }

    public void setEthnicity(String ethnicity){
        this.ethnicity = ethnicity;
    }

    public String getHairLength(){
        return hairLength;
    }

    public void setHairLength(String heightLength){
        this.hairLength = heightLength;
    }






















    public Person() {
        this("", Integer.MAX_VALUE);
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

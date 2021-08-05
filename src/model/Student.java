package model;

public class Student {

    String name;
    int age;
    String Sapcelaizalion;

    public Student(String name, int age, String sapcelaizalion) {
        this.name = name;
        this.age = age;
        Sapcelaizalion = sapcelaizalion;
    }

    // Input getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSapcelaizalion() {
        return Sapcelaizalion;
    }

    public void setSapcelaizalion(String sapcelaizalion) {
        Sapcelaizalion = sapcelaizalion;
    }
}

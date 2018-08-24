package com.thebloez.scratch.model;

/**
 * Created by thebloez on 28/06/18.
 */
public class Family {

    private String name;
    private int age;

    public Family(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.example.teachmeskills_homework;

class Adult {
    Integer age;
    String name;
    Integer height;
    String isGrow = "child has grown";


    public Adult(Integer age, String name, Integer height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Adult(Child child) {
        this.age = child.getAge();
        this.name = child.getName();
        this.height = child.getHeight();
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return age + " " + name + " " + height;
    }
}
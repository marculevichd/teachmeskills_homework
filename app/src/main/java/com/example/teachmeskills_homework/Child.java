package com.example.teachmeskills_homework;

import java.util.Objects;

class Child {
    private Integer age;
    private String name;
    private Integer height;

    public Child(Integer age, String name, Integer height) {
        this.age = age;
        this.name = name;
        this.height = height;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return Objects.equals(age, child.age) && Objects.equals(name, child.name) && Objects.equals(height, child.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, height);
    }

    @Override
    public String toString() {
        return age + name + height;
    }
}
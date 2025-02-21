package org.example.stream;

public class Student {
    private int id;
    private String name;
    private int age;
    private String city;
    private double score;

    public Student(int id, String name, int age, String city, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

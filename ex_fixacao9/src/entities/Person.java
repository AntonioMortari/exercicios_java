package entities;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}

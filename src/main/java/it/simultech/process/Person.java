package it.simultech.process;


public class Person {

    private String name;
    private int age;
    private boolean adult;
    private boolean john;

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

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", adult=" + adult + "]";
    }

    public boolean isJohn() {
        return john;
    }

    public void setJohn(boolean john) {
        this.john = john;
    }
}
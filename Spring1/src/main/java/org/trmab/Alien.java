package org.trmab;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Computer com;
    //now how to ask apring to inject it rather then this lap = new Laptop();
    public Alien(){
        System.out.println("Alien created");
    }

    //used  @ConstructorProperties({"name","lap"}) to tell these are the name i have passed in spring.xml contructor-arg
//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Laptop lap){
//        System.out.println("Alien created");
//    this.age=age;
//    this.com = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.print("Coding");
        //after calling code it should compile rite form laptop
        com.compiling();
    }
}

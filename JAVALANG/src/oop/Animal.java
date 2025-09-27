package oop;

public class Animal {
    private  String name;
    public Animal(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("hello from animal class : " + name);
    }
}

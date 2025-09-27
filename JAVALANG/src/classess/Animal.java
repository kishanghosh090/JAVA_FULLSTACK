package classess;

public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
        System.out.println("Animal cons called");
    }

    void eat(){
        System.out.println("This animal eats food!" + name);
    }

    void makesSound(){
        System.out.println("Animal makes sound");
    }
}

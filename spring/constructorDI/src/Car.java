public class Car {
    private Engine e1;

    // constructor Dependency Injection
    public Car(Engine e){
        this.e1 = e;
    }

    public void drive(){
        e1.start();
        System.out.println("let's drive");
    }
}

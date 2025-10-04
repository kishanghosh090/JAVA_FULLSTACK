public class Main {
    public static void main(String[] args) {
        Engine e = new Engine();

        Car myCar = new Car(e);
        myCar.drive();

    }
}
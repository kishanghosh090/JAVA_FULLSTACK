package classess;


public class Main {
    public static void main(String[] args) {
        MyCar c1 = new MyCar();
        c1.color = "Red";
        c1.model = "vs1";
        c1.year = 2024;
        System.out.println(c1.color);
        Mobile m1 = new Mobile(200,"vivo" ,"T2 5G");
        m1.displayAll();
    }
}


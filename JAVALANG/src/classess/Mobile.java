package classess;

public class Mobile {
    String name;
    String model;
    int price;
    public Mobile(int myPrice, String myName, String myModel){
        this.name = myName;
        this.price = myPrice;
        this.model = myModel;
    }
    public void displayAll(){
        System.out.println(
                " name of device is  " +
                        name +
                        "model is " +
                        model +
                        ". and price of your mobile is " +
                        price);

    }
}

package lamda;

public class Main {
    public static void main(String[] args){
        Calc add = (int a, int b) -> a + b;
        int sum = add.calculate(1,2);
        System.out.println(sum);
    }
}

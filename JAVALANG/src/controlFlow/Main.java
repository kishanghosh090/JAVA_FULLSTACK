package controlFlow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        age = Integer.parseInt(sc.nextLine());

        if (age >= 18){
            System.out.println("you can vote");
        }else {
            System.out.print("You can't vote");
        }

        boolean isValid = age > 20 || true;
        // && , || , ! (AND , OR, NOT) logical opretor





    }

}

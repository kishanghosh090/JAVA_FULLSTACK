package arrays;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr1 = {1,23,23,};
        int[] arr2; // declare but not taking space into the array
        arr2 = new int[10];

        int[] arr3 = new int[19];
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        for(int i : arr1){
            System.out.println(i * 2 );
        }
        String s = "kishan rana ghosh";

//        for(char c : s){
//            System.out.println(c);
//        }
        int myNum;
//        System.out.println(myNum);
        System.out.println(Arrays.toString(arr1));
        
        int[] copyArr = Arrays.copyOf(arr1,arr1.length); //
        // arrays.fill(arrname, fromindx, toindex, fillval)
        // arras.fill(arrname, fillVal)

        
        
        
    }
}

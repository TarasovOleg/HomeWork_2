package homeWork2_1;

import java.util.Arrays;

/**
 * Created by Олег on 27.01.2017.
 */
public class arrayForDouble {
    public static void main(String[] args) {
        double [] arrayDouble = {5,9,10,16,10,12,21,17,12,7};
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i]+" ");
        }
        System.out.println("\n");
        sum(arrayDouble);
        min(arrayDouble);
        max(arrayDouble);
        maxPos(arrayDouble);
        mult(arrayDouble);
        mod(arrayDouble);
        secondLar(arrayDouble);
    }
    static void sum (double arr[]){
        double a = 0;
        for (int i = 0; i < arr.length-1; i++) {
            a = a+arr[i];
        }
        System.out.println("Sum of elemets is " + a);
    }
    static void min (double arr[]){
        Arrays.sort(arr);
        System.out.println("Minimal value is " + arr[0]);
    }
    static void max (double arr[]){
        Arrays.sort(arr);
        System.out.println("Maximal value is " + arr[arr.length-1]);
    }
    static void maxPos (double arr[]){
        Arrays.sort(arr);
        if (arr[arr.length-1] > 0 ){
            System.out.println("Maximal positiv value is " + arr[arr.length-1]);
        }
    }
    static void mult (double arr[]){
        double a = 1;
        for (int i = 0; i < arr.length-1 ; i++) {
            a = a * arr[i];
        }
        System.out.println("Multiplication of all values equals " + a);
    }
    static void mod (double arr[]){
        Arrays.sort(arr);
        System.out.println("Modulus of first and last element equals " + arr[arr.length-1]%arr[0]);
    }
    static void secondLar (double arr[]){
        Arrays.sort(arr);
        double a = arr[arr.length-2];
        if (a == arr[arr.length-1]){
            double b = 0;
            for (int i = arr.length-3; i >=0 ; i--) {
                b = arr[i];
                if (b != arr[arr.length-1])break;
            }
            System.out.println("Second largest element is " + b);
        }
        else {
            System.out.println("Second largest element is " + a);
        }
    }
}

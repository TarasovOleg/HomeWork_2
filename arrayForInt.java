package homeWork2_1;

import java.util.Arrays;

/**
 * Created by Олег on 24.01.2017.
 */
public class arrayForInt {
    public static void main(String[] args) {
        int [] arrayInt = {5,9,10,16,10,12,21,17,12,7};
        sum(arrayInt);
        min(arrayInt);
        max(arrayInt);
        maxPosit(arrayInt);
        mult(arrayInt);
        modul(arrayInt);
        secLarge(arrayInt);

        System.out.println();
    }
    static void sum (int arr[]){
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        System.out.println("Sum of elemets is " + a);
    }
     static void min (int arr[]){
        Arrays.sort(arr);
         System.out.println("Minimal value is " + arr[0]);
     }
     static void max (int arr[]){
         Arrays.sort(arr);
         System.out.println("Maximal value is " + arr[arr.length-1]);
     }
     static void maxPosit (int arr []){
         Arrays.sort(arr);
         int a = arr[arr.length-1];
         if (a>0){
             System.out.println("Maximal positiv value is " + a);
         }
     }
     static void mult (int arr []){
         int a = 1;
         for (int i = 0; i <arr.length-1 ; i++) {
             a = a * arr[i];
         }
         System.out.println("Multiplication of all values equals " + a);
     }
     static void modul (int arr []){
         Arrays.sort(arr);
         System.out.println("Modulus of first and last element equals " + arr[arr.length-1]%arr[0]);
     }
     static void secLarge( int arr []){
         Arrays.sort(arr);
         int a = (arr[arr.length-2]);
         if (a == arr[arr.length-1]){
             int b = 0;
             for (int i = arr.length-3; i >= 0; i--) {
                 b = arr[i];
                 if (arr[i] != a)break;
             }
             System.out.println("Second largest element is " + b);
         }
         else {
             System.out.println("Second largest element is " + a);
         }

     }

}

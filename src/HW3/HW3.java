package HW3;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int [] arr;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input the size of array");
            size = scanner.nextInt();
            if(size>20) {
                System.out.println("The size can not exceed to 20");
            }
        } while (size>20);
        arr = new int[size];
        int i =0;
        while (i<arr.length) {
            System.out.println("Input the number " + (i+1));
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Your array is ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>max) {
                max = arr[j];
            }
        }
        System.out.print("Maximum is " + max);
    }
}

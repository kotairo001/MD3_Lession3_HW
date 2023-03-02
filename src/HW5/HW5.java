package HW5;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Input the size of array");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("The size can not exceed to 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Input the number " + (i + 1));
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("Your array is ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("Min of your array is " + findMin(array) );

    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

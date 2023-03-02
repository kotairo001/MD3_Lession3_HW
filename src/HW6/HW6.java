package HW6;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input the number of student's marks");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Your student's marks can not be more than 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i<array.length) {
            System.out.println("Input mark " + (i+1));
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Your student's marks is ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        };
        System.out.println("There are " + countStudentMarks(array) + " students passed the test");
    }

    public static int countStudentMarks(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5 && array[i] <= 10) {
                count++;
            }
        }
        return count;
    }
}

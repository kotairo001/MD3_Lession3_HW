package HW2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        String [] students = {"Jane","Jack","John","James","Janet"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input student's name");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)) {
                isExit = true;
                System.out.println("Position of student in array is " + i);
                break;
            }
        }
        if(!isExit) {
            System.out.println("Not found any student matched");
        }
    }
}

//java program to create a student class and their objects
package OOP.Classes_And_Objects;

import java.util.Scanner;

public class sample1 {
    public static void main(String[] args)
    {
        student st = new student();
        st.getDetails();
        st.displayDetails();
    }
}

class student{
    int student_roll;
    String student_name;
    Scanner sc = new Scanner(System.in);
    public void getDetails()
    {
        System.out.println("Enter the name of the student");
        student_name = sc.nextLine();
        System.out.println("Enter the roll number of the student");
        student_roll = sc.nextInt();
    }

    public void displayDetails()
    {
        System.out.println("The name of the student is "+student_name);
        System.out.println("The roll number of the student is "+student_roll);
    }
}

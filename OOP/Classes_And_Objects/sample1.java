//java program to create a student class and their objects
package OOP.Classes_And_Objects;

import java.util.Scanner;

public class sample1 {
    public static void main(String[] args)
    {
        student st = new student();
        System.out.println("Enter the name of the student");
        System.out.println("The name of the student is "+st.name());
        System.out.println("Enter the ID of the student");
        System.out.println("The id of the student is "+st.id());
    }
}

class student{
    int student_id;
    String student_name;
    Scanner sc = new Scanner(System.in);
    public String name()
    {
        return student_name = sc.nextLine();
    }

    public int id()
    {
        return student_id = sc.nextInt();
    }
}

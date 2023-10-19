//java program to setting the details of a student and getting the marks of the student
package OOP.Inheritance.practice;

import java.util.Scanner;

class studentBio
{
    String name;
    int roll;
    Scanner sc = new Scanner(System.in);
    public void setDetails()
    {
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        System.out.println("Enter the roll number of the student");
        roll = sc.nextInt();
    }

    public void displayDetails()
    {
        System.out.println("The name of the student is "+name);
        System.out.println("The roll number of the student is "+roll);
    }
}

class studentMarks extends studentBio
{
    private int subjectiveMarks;
    private int objectiveMarks;

    @Override
    public void setDetails()
    {
        super.setDetails();
        System.out.println("Enter the subjective marks");
        subjectiveMarks = sc.nextInt();
        System.out.println("Enter the objective marks");
        objectiveMarks = sc.nextInt();
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("The marks secured by the student in subjective is "+subjectiveMarks+" and in objective is "+objectiveMarks);
    }

}

class sports extends studentMarks
{
    private char sportsMarks;
    @Override
    public void setDetails()
    {
        super.setDetails();
        System.out.println("Enter the grade obtained the sports activity");
        sportsMarks = sc.next().charAt(0);
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Marks obtain by the student in sports activity is "+sportsMarks);
    }
}
public class studentData {
    public static void main(String[] args)
    {
        studentMarks stdmarks = new studentMarks();
        sports spt = new sports();
        spt.setDetails();
        spt.displayDetails();
    }
}

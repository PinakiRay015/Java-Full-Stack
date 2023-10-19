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

    public int getSubjectiveMarks() {
        return subjectiveMarks;
    }

    public void setSubjectiveMarks() {
        System.out.println("Enter the marks obtain in subjective");
        subjectiveMarks = sc.nextInt();
    }

    public int getObjectiveMarks() {
        return objectiveMarks;
    }

    public void setObjectiveMarks() {
        System.out.println("Enter the marks obtain in objective");
        objectiveMarks = sc.nextInt();
    }
}
public class studentData {
    public static void main(String[] args)
    {
        studentMarks stdmarks = new studentMarks();
        stdmarks.setDetails();
        stdmarks.setObjectiveMarks();
        stdmarks.setSubjectiveMarks();
        stdmarks.displayDetails();
        System.out.println("The marks obtain by the student in subjective is "+stdmarks.getSubjectiveMarks()+" and in objective is "+stdmarks.getObjectiveMarks());
    }
}

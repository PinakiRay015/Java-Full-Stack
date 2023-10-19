//Java program to demonstrate compile time constructor overloading which is often called as compile time polymorphism
package Constructors.polymorphism;

class student
{
    String name;
    int roll;
    public student()
    {
        System.out.println("The student is from CSIT branch");
    }

    public student(String name , int roll)
    {
        this.name = name;
        this.roll = roll;
        System.out.println("The name of the student is "+name);
        System.out.println("The roll number of the student is "+roll);
    }
}
public class compileTime {
    public static void main(String [] args)
    {
        student sd1 = new student("rohan" , 244);
        student sd2 = new student();
    }
}

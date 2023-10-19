//Java program to demonstrate method overloading which is often called as compile time polymorphism
package OOP.polymorohism;

class school
{
    void student(int std)
    {
        System.out.println("The student is from class "+std);
    }

    void student(String name)
    {
        System.out.println("The name of the student is "+name);
    }
}
public class methodOverLoading {
    public static void main(String[] args) {
        school sch = new school();
        sch.student("Rohan");
        sch.student(9);
    }
}

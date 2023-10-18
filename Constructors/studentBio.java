package Constructors;
import java.util.Scanner;
class studentData
{
    private String name;
    private int regd_no;

    Scanner sc = new Scanner(System.in);

    public String getName()
    {
        return name;
    }

    public int getRegd_no()
    {
        return regd_no;
    }

    public studentData()
    {
        System.out.println("Enter the name of the student");
        this.name = sc.nextLine();
        System.out.println("Enter the registration number of the student");
        this.regd_no = sc.nextInt();
    }
}
public class studentBio {
    public static void main(String[] args)
    {
        studentData sd = new studentData();
        System.out.println("The name of the student is "+sd.getName());
        System.out.println("The registration number of the student is "+sd.getRegd_no());
    }
}

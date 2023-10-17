package OOP.Getters_and_Setters;

import java.util.Scanner;

class myLibrary
{
    private int bookID;
    Scanner sc = new Scanner(System.in);

    public int getBookID()
    {
        return bookID;
    }

    public void setBookID()
    {
        System.out.println("Set the ID of the ID");
        bookID = sc.nextInt();
    }

}
public class sample {
    public static void main(String[] args) {
        myLibrary lib = new myLibrary();
        lib.setBookID();
        System.out.println("The id of the book is "+lib.getBookID());
    }
}

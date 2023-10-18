//java program to initialize constructor
package Constructors;

class myLibrary
{
    public myLibrary() {
        System.out.println("THis is the default constructor");
    }

    public myLibrary(int a , int b)
    {
        System.out.println("This is parameterize constructor");
    }
}
public class sample {
    public static void main(String[] args) {
         myLibrary lib1 =  new myLibrary(5 , 6);
         myLibrary lib2 =  new myLibrary();


    }
}

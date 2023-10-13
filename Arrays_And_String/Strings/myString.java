//java program to demonstrate string implementation
package Arrays_And_String.Strings;

public class myString {
    public static void main(String[] args)
    {
        String str1 = "Rohan";          //By String literal
        String str2 = new String("Pinaki");     //By new keyword

        System.out.println(str1);
        System.out.println(str2);

        //concatenating Strings (means to merge or join two string together)
        System.out.println(str1.concat(str2));
    }
}

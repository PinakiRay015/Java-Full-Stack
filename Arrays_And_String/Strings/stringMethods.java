package Arrays_And_String.Strings;

public class stringMethods {
    public static void main(String [] args)
    {
        String str1 = "Hello Rahul";
        String str2 = "Namaste Pinaki";

        System.out.println(str1.length()); //calculate the length of the string
        System.out.println(str1.charAt(2)); //getting a character of a particular index from the String
        System.out.println(str1.substring(0 , 2)); //getting the substring
        System.out.println(str1.equals(str2)); //To check weather two strings are equal or not
        System.out.println(str1.contains("Hello")); //to check the weather a string is contains the following string or not
        System.out.println(str1.toLowerCase()); //To make all the characters of a string into lowercase
        System.out.println(str1.toUpperCase()); //To make all the characters of a string into uppercase
    }

}

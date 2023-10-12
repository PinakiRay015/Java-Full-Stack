package Variables_and_DataTypes;

import java.util.Scanner;

public class Reading_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num1 = sc.nextInt();
        System.out.println("Enter a float");
        float num2 = sc.nextFloat();
        System.out.println("Enter a boolean value");
        boolean val = sc.nextBoolean();
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println("Enter the character value");
        char ch = sc.next().charAt(0);

        System.out.println("");
        System.out.println("Value of Integer is "+num1);
        System.out.println("Value of Float is "+num2);
        System.out.println("Value of Boolean is "+val);
        System.out.println("Value of String is "+str);
        System.out.println("Value of character is "+ch);
    }
}

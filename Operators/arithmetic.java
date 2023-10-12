//Arithmetic operator in java
package Operators;

public class arithmetic {
    public static void main(String[] args) {
        System.out.println(2+2);
        System.out.println(4-1);
        System.out.println(3*2);
        System.out.println(10/5);
        System.out.println(10%3);

        System.out.println("post and pre increment operator 👇👇");
        int num1 = 5;
        System.out.println(++num1); //The value of num1 i.e 5 first got increment to 6 as it is a pre-order increment.
        System.out.println(num1++); //Now the value got printed first then it got incremented to 7 from 6 as it is a post order increment
        System.out.println(num1); //Now the updated value gets printed i.e 7
    }
}

//java program to demonstrate single level inheritance
package OOP.Inheritance;

class laptop
{
    void os()
    {
        System.out.println("It has M1 chip");
    }
}

class macbookAIR extends laptop
{
    void battery()
    {
        super.os();
        System.out.println("Gives 12hr battery backup");
    }
}
public class singleLevel {
    public static void main(String[] args) {
        System.out.println("Introducing the new mac book air");
        macbookAIR mac = new macbookAIR();
        mac.battery();
    }
}

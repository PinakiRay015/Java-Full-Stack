//java program to demonstrate multiple inheritance
package OOP.Inheritance;

class mobile
{
    public void network()
    {
        System.out.println("comes with 5g chipset");
    }
}

class iphone15 extends mobile
{
    public void os()
    {
        super.network();
        System.out.println("It has iOS");
    }
}

class samsungS23 extends mobile
{
    public void os()
    {
        super.network();
        System.out.println("It has android OS");
    }
}
public class multiple {
    public static void main(String[] args) {

        iphone15 iphn = new iphone15();
        samsungS23 s23 = new samsungS23();

        iphn.os();
        s23.os();
    }
}

//java program to demonstrate multi level inheritance
package OOP.Inheritance;

class mammals
{
    void birth()
    {
        System.out.println("They can give birth");
    }
}

class animals extends mammals
{
    void eat()
    {
        System.out.println("They can be carnivorous or herbivorous or both");
    }
}

class dog extends animals
{
    void roar()
    {
        super.birth();
        super.eat();
        System.out.println("They make bark sound");
    }
}
public class multiLevel {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.roar();
    }
}

//java program to demonstrate method overriding which is often called as runtime polymorphism
package OOP.polymorohism;

class animal
{
    public void makeSound()
    {
        System.out.println("Animals make sound");
    }
}

class dog extends animal
{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Dogs make bark sound");
    }
}
public class methodOverRiding {
    public static void main(String[] args) {
        dog d = new dog();
        d.makeSound();
    }
}

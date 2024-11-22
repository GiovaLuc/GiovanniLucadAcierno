public class Main {
    public static void main(String[] args){
        Animal animal;
        Animal pig = new Pig();
        Animal dog = new Dog();
        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}

class Animal{
    public void animalSound(){
        System.out.println("sound");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("woof woof");
    }
}
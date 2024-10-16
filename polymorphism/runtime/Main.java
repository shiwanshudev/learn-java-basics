public class Main{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sound();
    }
}

class Animal{
    public void sound(){
        System.out.println("Animal sounds...");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Woof!");
    }
}
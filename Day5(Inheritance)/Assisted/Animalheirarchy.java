class Animal{
    String name;
    int age;
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);}
    void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);}
    void makeSound(){
        System.out.println("Cat meow");
    }
}
class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);}
    void makeSound(){
        System.out.println("Bird cries");
    }
}
public class Animalheirarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("doggy", 1);
        Cat cat = new Cat("frank", 2);
        Bird bird = new Bird("crow", 3);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
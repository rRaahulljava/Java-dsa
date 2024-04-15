public class Inheritance {
    public static void main(String[] args) {

        Animal shark = new Animal();

        shark.eat();
        
    }
}
// base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
}

// derived class

class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims in water");
    }
}

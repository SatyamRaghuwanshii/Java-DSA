package OOPS.abstraction;

// using abstract class

//abstract class bird{
//    abstract void fly();
//    abstract void eat();
//}
//
//class sparrow extends bird{
//    @Override
//    void fly(){
//        System.out.println("sparrow flies");
//    }
//    @Override
//    void eat(){
//        System.out.println("sparrow eats");
//    }
//}
//
//class crow extends bird{
//    @Override
//    void fly() {
//        System.out.println("crow flies");
//    }
//
//    @Override
//    void eat(){
//        System.out.println("crow eats");
//    }
//}


// using interfaces

interface bird{
    void fly();
    void eat();
}

class sparrow implements bird{

    @Override
    public void fly() {
        System.out.println("sparrow flies");
    }

    @Override
    public void eat() {
        System.out.println("sparrow eats");
    }
}

class crow implements bird{
    @Override
    public void fly() {
        System.out.println("crow flies");
    }

    @Override
    public void eat() {
        System.out.println("crow eats");
    }
}

public class AbstractDesign {
    public static void dostuff(bird b){
        b.fly();
        b.eat();
    }
    public static void main(String[] args) {
        dostuff(new sparrow());
        dostuff(new crow());
    }
}

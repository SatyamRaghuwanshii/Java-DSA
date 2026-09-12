package OOPS.Inheritance;

public class Bike extends vehicle {
    String Handle;
    Bike(String name, int tyre, String Transmission, String handle){
        super(name, tyre, Transmission);
        this.Handle = handle;
    }
    void wheelie(){
        System.out.printf("bike is doing wheelie hold %s handle tightly\n",Handle);
    }
}

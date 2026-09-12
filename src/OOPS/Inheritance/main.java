package OOPS.Inheritance;

public class main {
    public static void main() {
        car c = new car("maruti", 4, "auto", 4);
        c.start();
        c.stop();
        c.StartAC();
        Bike b = new Bike("splendor", 2, "kickStart","flat");
        b.start();
        b.wheelie();
        b.stop();
    }
}

package OOPS.Inheritance;

public class car extends vehicle{
    public int Door;
    car(String name, int tyre, String Transmission, int Door){
        super(name, tyre, Transmission);
        this.Door = Door;
    }
    void StartAC(){
        System.out.printf("Ac is on in %s All %s are closed\n", Name, Door);
    }
}

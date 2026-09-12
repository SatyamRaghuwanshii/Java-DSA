package OOPS.Inheritance;

public class vehicle {
    public String Name;
    public int Tyre;
    public String Transmisssion;

    vehicle(){
        this.Name = "";
        this.Tyre = -1;
        this.Transmisssion = "";
    }
    vehicle(String name, int tyre, String Transmission){
        this.Name = name;
        this.Tyre = tyre;
        this.Transmisssion = Transmission;
    }
    void start(){
        System.out.println("Engine is starting of " + Name);
    }
    void stop(){
        System.out.println("Engine is stopped of " + Name);
    }
}

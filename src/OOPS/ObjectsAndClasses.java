package OOPS;

public class ObjectsAndClasses {
    public class Student{
        int id;
        String name;
        int age;

        //default consturctor
//        public Student(){
//            System.out.println("default constructor id called");
//        }

        //Parameterised Constructor
        public Student(int Obj_id, String Obj_name, int Obj_age){
            this.id = Obj_id;
            this.age = Obj_age;
            this.name = Obj_name;
        }

        //Copy Consturctor
        public Student(Student Obj_std){
            this.id = Obj_std.id;
            this.name = Obj_std.name;
            this.age = Obj_std.age;
        }

        public void sleep(){
            System.out.println(name + " is sleeping");
        }

        public void eat() {
            System.out.println(name + " is eating");
        }
    }

    void main() {
        Student s1 = new Student(1, "satyam", 22);
        Student s2 = new Student(s1);

        s1.sleep();
        s2.sleep();

        s1.eat();
        s2.eat();
    }
}

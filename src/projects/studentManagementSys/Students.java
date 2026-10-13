package projects.studentManagementSys;

public class Students {
    private int id;
    private String name;
    private String email;
    private int[] marks;

    Students(){

    }
    public Students(int id, String name, String email, int[] marks) {
        this.id = id;
        this.marks = marks;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public int[] getMarks() {
        return marks;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}

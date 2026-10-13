package projects.studentManagementSys;

import java.util.*;


public class Main {
    private static int nextId = 9;
    public static void main(String[] args){
        HashMap<Integer, Students> students = new HashMap<>();
        loadFakeData(students);
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n----Student Management System----");
            System.out.println("1: Create a Student");
            System.out.println("2: Update Student details");
            System.out.println("3: Delete a Student");
            System.out.println("4: Print Student Details");
            System.out.println("5: Print All Students Details");
            System.out.println("0: Exit");
            System.out.print("Enter a Choice: ");

            int Choice = sc.nextInt();
            sc.nextLine();
            switch (Choice) {
                case 1:
                    createStudent(students, sc);
                    break;
                case 2:
                    System.out.print("Enter Student Id to Update Details: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    updateStudentDetails(students, id, sc);
                    break;
                case 3:
                    System.out.print("Enter Student Id to Delete a Student: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    deleteStudent(students, id);
                    break;
                case 4:
                    System.out.print("Enter Student Id to Print Details: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    printStudentDetails(students, id);
                    break;
                case 5:
                    printAllStudents(students, sc);
                    break;
                case 0:
                    System.out.println("\n----Exiting Application----");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Enter A valid Choice");
            }
        }
    }

    private static void printStudentDetails(HashMap<Integer, Students> students, int id){
        Students s = searchStudent(id, students);

        if(s != null){
            System.out.println("id: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Marks: " + Arrays.toString(s.getMarks()));
            System.out.println("Email: " + s.getEmail());
            System.out.println();
        }else{
            System.out.println("Not Found");
        }
    }


    private static void printAllStudents(HashMap<Integer, Students> students, Scanner sc) {

        if (students.isEmpty()) {
            System.out.println("No Students Found");
            return;
        }

        System.out.println("\n---- Display Student Records ----");
        System.out.println("1: Name");
        System.out.println("2: Email");
        System.out.println("3: Marks");
        System.out.println("4: Complete Details");
        System.out.println("0: Back to Main Menu");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                for (Students s : students.values()) {
                    System.out.println("ID: " + s.getId()
                            + " | Name: " + s.getName());
                }
                break;

            case 2:
                for (Students s : students.values()) {
                    System.out.println("ID: " + s.getId()
                            + " | Email: " + s.getEmail());
                }
                break;

            case 3:
                for (Students s : students.values()) {
                    System.out.println("ID: " + s.getId()
                            + " | Marks: "
                            + Arrays.toString(s.getMarks()));
                }
                break;

            case 4:
                ArrayList<Integer> ids = new ArrayList<>(students.keySet());
                Collections.sort(ids);
                for (int id : ids) {
                    Students s = students.get(id);
                    System.out.println("\n--------------------");
                    System.out.println("ID: " + s.getId());
                    System.out.println("Name: " + s.getName());
                    System.out.println("Email: " + s.getEmail());
                    System.out.println("Marks: "
                            + Arrays.toString(s.getMarks()));
                }
                break;

            case 0:
                System.out.println("Returning to Main Menu...");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }


    private static Students searchStudent(int id, HashMap<Integer, Students> students){
        return students.get(id);
    }

    private static void createStudent(HashMap<Integer, Students> students, Scanner sc){
        Students newStudent = new Students();
        newStudent.setId(nextId++);
        System.out.println("\n----Creating Student----");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        newStudent.setName(name);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        newStudent.setEmail(email);

        System.out.print("Enter No. of Subjects: ");
        int size = sc.nextInt();
        while(size < 1 || size > 8) {
            System.out.println("Subjects cannot be less than 1 and greater then 8");
            System.out.print("Enter Again: ");
            size = sc.nextInt();
        }
        int[] marks = new int[size];
        for(int i=0; i<size; i++){
            System.out.printf("Enter Marks Of Subject %d: ", i + 1);
            int num = sc.nextInt();
            while(num < 0 || num > 100){
                System.out.println("Please enter Marks between 0 to 100");
                num = sc.nextInt();
            }
            marks[i] = num;
        }
        newStudent.setMarks(marks);
        students.put(newStudent.getId(), newStudent);
        System.out.println("Student Created Succefully");
    }

    private static boolean deleteStudent(HashMap<Integer, Students> students, int id) {
        Students res = searchStudent(id, students);
        boolean isRemoved = students.remove(id,res);
        if(!isRemoved){
            System.out.print("Student of Id " + id + " Not Found");
            return false;
        }else{
            System.out.print("Deleted Sucessfully: ");
        }

        return isRemoved;
    }

    private static boolean updateStudentDetails(HashMap<Integer, Students> students, int id, Scanner sc){
        Students res = searchStudent(id, students);
        if(res == null){
            System.out.print("Student of " + id + " Not Found, Updation: ");
            return false;
        }
        System.out.println("\n----Upadting Student Details----");
        System.out.println("1: Update Name");
        System.out.println("2: Update Email");
        System.out.println("3: Update marks");
        System.out.println("0: Back to Main Menu");
        System.out.print("Enter a Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                res.setName(name);
                System.out.print("Name Updated Successfully");
                break;
            case 2:
                System.out.println("Enter Email: ");
                String email = sc.nextLine();
                res.setEmail(email);
                System.out.print("Email Updated Successfully");
                break;
            case 3:
                System.out.print("Enter No. of Subjects: ");
                int size = sc.nextInt();
                while(size < 1 || size > 7) {
                    System.out.println("Subjects cannot be less than 1 and greater then 8");
                    System.out.print("Enter Again: ");
                    size = sc.nextInt();
                }
                int[] marks = new int[size];
                for(int i=0; i<size; i++){
                    System.out.printf("Enter Marks Of Subject %d: ", i + 1);
                    int num = sc.nextInt();
                    while(num < 0 || num > 100){
                        System.out.println("Please enter Marks between 0 to 100");
                        num = sc.nextInt();
                    }
                    marks[i] = num;
                }
                sc.nextLine();
                res.setMarks(marks);
                System.out.print("Marks Updated Successfully");
                break;
            case 0:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Enter A valid Choice");
        }
        return true;
    }


    private static void loadFakeData(HashMap<Integer, Students> students) {
        students.put(1, new Students(1, "Aarav Sharma",
                "aarav.sharma@example.com", new int[]{85, 92, 78, 88, 91}));

        students.put(2, new Students(2, "Priya Verma",
                "priya.verma@example.com", new int[]{95, 89, 93, 87, 90}));

        students.put(3, new Students(3, "Rahul Patel",
                "rahul.patel@example.com", new int[]{67, 74, 81, 70, 76}));

        students.put(4, new Students(4, "Ananya Singh",
                "ananya.singh@example.com", new int[]{98, 96, 94, 99, 97}));

        students.put(5, new Students(5, "Rohan Gupta",
                "rohan.gupta@example.com", new int[]{45, 62, 58, 71, 66}));

        students.put(6, new Students(6, "Sneha Joshi",
                "sneha.joshi@example.com", new int[]{72, 85, 0, 91, 68}));

        students.put(7, new Students(7, "Kabir Mehta",
                "kabir.mehta@example.com", new int[]{100, 89, 100, 95, 98}));

        students.put(8, new Students(8, "Ishita Rao",
                "ishita.rao@example.com", new int[]{56, 63, 48, 72, 60}));
    }

}

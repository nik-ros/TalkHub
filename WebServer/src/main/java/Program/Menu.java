package Program;

import Services.*;
import Domain.*;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    private final StudentService studentService = new StudentService();
    private final TeacherService teacherService = new TeacherService();
    private final AdminService adminService = new AdminService();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        Person student = new Student("John", "Doe", "M", "jdoe", "1234", new Date(), "1234567890", "jdoe@mail.com", "active", (short)1, null, "Beginner");
        Person teacher = new Teacher("Jane", "Smith", "A", "jsmith", "abcd", new Date(), "0987654321", "jsmith@mail.com", "active", null, null);


        boolean running = true;
        while (running) {
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Teachers");
            System.out.println("3. Manage Admins");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> manageStudents();
                case 2 -> manageTeachers();
                case 3 -> manageAdmins();
                case 4 -> running = false;
            }
        }
    }

    private void manageStudents() {
        System.out.println("Student management");

    }

    private void manageTeachers() {
        System.out.println("Teacher management");
    }

    private void manageAdmins() {
        System.out.println("Admin management");
    }
}

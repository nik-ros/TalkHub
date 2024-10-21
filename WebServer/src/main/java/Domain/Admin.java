package Domain;

import java.util.Date;
import java.util.List;

public class Admin extends Person {
    private final List<Teacher> teachers;

    public Admin(String firstName, String lastName, String middleName, String login, String password, Date dateOfBirth, String number, String email, String status, List<Teacher> teachers) {
        super(firstName, lastName, middleName, login, password, dateOfBirth, number, email, status);
        this.teachers = teachers;
    }

    public boolean addTeacher(Teacher teacher) {
        return teachers.add(teacher);
    }

    public boolean permissionForMeeting(int teacherId) {
        return true;
    }

    @Override
    public void writeInChat() {
        System.out.println("Administrator is writing in chat...");
    }

    @Override
    public void readMaterials() {
        System.out.println("Administrator is reading materials...");
    }
}


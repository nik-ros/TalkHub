package Domain;

import java.util.Date;
import java.util.List;

public class Student extends Person {
    private short group;
    private List<String> homework;
    private String level;

    public Student(String firstName, String lastName, String middleName, String login, String password, Date dateOfBirth, String number, String email, String status, short group, List<String> homework, String level) {
        super(firstName, lastName, middleName, login, password, dateOfBirth, number, email, status);
        this.group = group;
        this.homework = homework;
        this.level = level;
    }

    public byte doHomework(int id) {
        return 1;
    }

    public boolean joinMeeting() {
        return true;
    }

    @Override
    public void writeInChat() {
        System.out.println("Student is writing in chat...");
    }

    @Override
    public void readMaterials() {
        System.out.println("Student is reading materials...");
    }
}

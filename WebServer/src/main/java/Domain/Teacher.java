package Domain;

import java.util.Date;
import java.util.List;

public class Teacher extends Person {
    private List<String> subjects;
    private List<String> materials;

    public Teacher(String firstName, String lastName, String middleName, String login, String password, Date dateOfBirth, String number, String email, String status, List<String> subjects, List<String> materials) {
        super(firstName, lastName, middleName, login, password, dateOfBirth, number, email, status);
        this.subjects = subjects;
        this.materials = materials;
    }

    public void seeHomework(int id) {
    }

    public void addHomework(String homework) {
    }

    public boolean startMeeting() {
        return true;
    }

    @Override
    public void writeInChat() {
        System.out.println("Teacher is writing in chat...");
    }

    @Override
    public void readMaterials() {
        System.out.println("Teacher is reading materials...");
    }
}

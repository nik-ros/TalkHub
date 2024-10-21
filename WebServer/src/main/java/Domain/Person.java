package Domain;

import java.util.Date;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected String login;
    protected String password;
    protected Date dateOfBirth;
    protected String number;
    protected String email;
    protected String status;

    public Person(String firstName, String lastName, String middleName, String login, String password, Date dateOfBirth, String number, String email, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.login = login;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
        this.email = email;
        this.status = status;
    }

    public abstract void writeInChat();
    public abstract void readMaterials();
}

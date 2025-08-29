package entity;

public class People {

    private int id;
    private String name;
    private String email;
    private String number;

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public People(int id, String name, String email, String number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public People() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

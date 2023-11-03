package one_to_one;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Only applicable for int and long only
    private int id;
    private String name;
    private String gender;
    private int age;

    @OneToOne
    private PanCard p;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PanCard getP() {
        return p;
    }

    public void setP(PanCard p) {
        this.p = p;
    }
}

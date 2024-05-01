package entities;

import orm.annotations.Column;
import orm.annotations.Entity;
import orm.annotations.Id;

@Entity(name = "drivers")
public class Driver {
    @Id
    private int id;

    @Column(name = "name")
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Driver() {}

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
}

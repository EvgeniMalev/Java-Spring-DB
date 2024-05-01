package entities;

import orm.annotations.Column;
import orm.annotations.Entity;
import orm.annotations.Id;

import java.time.LocalDate;

@Entity(name = "cars")
public class Car {
    @Id
    private long id;

    @Column(name = "car_type")
    private String cartype;

    @Column(name = "km")
    private int km;

    @Column(name = "registration_date")
    private RegDate registration;

    public Car(String cartype, int km, RegDate registration) {
        this.cartype = cartype;
        this.km = km;
        this.registration = registration;
    }

    public Car() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getcartype() {
        return cartype;
    }

    public void setcartype(String cartype) {
        this.cartype = cartype;
    }

    public int getkm() {
        return km;
    }

    public void setkm(int km) {
        this.km = km;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public void setRegistration(LocalDate registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", cartype='" + cartype + '\'' +
                ", km=" + km +
                ", registration=" + registration +
                '}';
    }
}

package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String creditCardNumber;

    @OneToMany(mappedBy = "customer")
    private Set<Shirt> shirts;

    @OneToMany(mappedBy = "customer")
    private Set<Hat> hats;

}

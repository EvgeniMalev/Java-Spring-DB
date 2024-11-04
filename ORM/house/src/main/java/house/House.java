package house;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class House {
    @Id
    private Long id;
    private String address;
    private Double price;

}

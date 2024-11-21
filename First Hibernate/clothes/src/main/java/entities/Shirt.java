package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "shirts")
public class Shirt extends BaseEntity {

    @Column(nullable = false)
    private String size;

    @Column(nullable = false)
    private String color;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "shop_location_id")
    private ShopLocation shopLocation;

}

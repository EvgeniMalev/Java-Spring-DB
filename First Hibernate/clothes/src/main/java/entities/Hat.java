package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "hats")
public class Hat extends BaseEntity {

    @Column(nullable = false)
    private String material;

    @Column(nullable = false)
    private String style;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "shop_location_id")
    private ShopLocation shopLocation;

}

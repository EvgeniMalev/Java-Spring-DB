package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "shop_locations")
public class ShopLocation extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String locationName;

    @OneToMany(mappedBy = "shopLocation")
    private Set<Shirt> shirts;

    @OneToMany(mappedBy = "shopLocation")
    private Set<Hat> hats;

}

package house;

import java.util.List;

public interface HouseDao {
    void save(House house);
    House findById(Long id);
    List<House> findAll();
}

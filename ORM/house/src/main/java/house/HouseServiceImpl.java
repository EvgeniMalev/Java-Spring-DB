
package house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseDao houseDao;

    public void saveHouse(House house) {
        houseDao.save(house);
    }
}

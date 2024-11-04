package house;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class HouseDaoImpl implements HouseDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(House house) {
        sessionFactory.getCurrentSession().save(house);
    }

    public House findById(Long id) {
        return (House) sessionFactory.getCurrentSession().get(House.class, id);
    }

    public List<House> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from House").list();
    }
}

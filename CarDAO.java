import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class CarDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insert(Car car) {
        String sql = "INSERT INTO car (id, name, model, year, engine) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, car.getId(), car.getName(), car.getModel(), car.getYear(), car.getEngine());
    }

    public List<Car> findAll() {
        String sql = "SELECT * FROM car";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            Car car = new Car();
            car.setId(resultSet.getInt("id"));
            car.setName(resultSet.getString("name"));
            car.setModel(resultSet.getString("model"));
            car.setYear(resultSet.getInt("year"));
            car.setEngine(resultSet.getDouble("engine"));
            return car;
        });
    }
}

import entities.Car;
import entities.Driver;
import entities.Passenger; 
import orm.Connector;
import orm.EntityManager;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws SQLException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        Connector.createConnection("root", "Fiat 850", "1", "Ivan");
        Connection connection = Connector.getConnection();

        EntityManager<Driver> driverManager = new EntityManager<>(connection);
        EntityManager<Car> carManager = new EntityManager<>(connection);

        Driver first = driverManager.findFirst(Driver.class);
        System.out.println(first.getId() + " " + first.getDrivername());

        EntityManager<Passenger> passengerManager = new EntityManager<>(connection);

        Passenger first1 = passengerManager.findFirst(Passenger.class, "name = 'name2'");
        System.out.println(first1.getId() + " " + first1.getName());

        passengerManager
            .find(Passenger.class, "age > 18 AND registration_date > '2022-06-06'")
            .forEach(u -> System.out.println(u.toString()));
    }
}

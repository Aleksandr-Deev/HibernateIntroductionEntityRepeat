import java.util.List;

public interface EmployeeDAO {


    // Получение всех объектов из базы
    List<Employee> readAll();

    // Метод получения объекта по id
    Employee readById(int id);

    // метод добавления(создания)
    Integer create(Employee employee);

    // Метод обновления данных в базе
    void updateCityById(Employee employee);

    // Метод удаления данных из базы
    void delete(Employee employee);
}

import java.util.List;


public class Application {

    public static void main(String[] args){

        // Создаем объект класса ДАО
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        Employee employee1 = new Employee("first_name1", "last_nam1", "man",35,5);
        // Создаем объект
        employeeDAO.create(employee1);

        // Получаем объект по id
        System.out.println(employeeDAO.readById(11));

        // Получаем полный список объектов
        List<Employee> list = employeeDAO.readAll();

        for (Employee employee : list) {
            System.out.println(employee);
        }

        Employee employee2 = new Employee(10,"first_name2", "last_name2", "woman",40,2);

        // Изменяем объект
        employeeDAO.updateCityById(employee2);

        // Удаляем объект
        employeeDAO.delete(employee2);

    }
}

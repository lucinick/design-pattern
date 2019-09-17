package decorator;

import decorator.impl.Cto;
import decorator.impl.EmployeeImpl;
import decorator.impl.TechnicalManager;

public class Client {

    public static void main(String[] args) {
        Employee employee = new Cto(new TechnicalManager(new EmployeeImpl()));
        employee.work();

        System.out.println(employee.getClass().getSimpleName());
    }
}

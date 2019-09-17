package decorator.impl;

import decorator.Employee;
import decorator.Manager;

public class BusinessManager extends Manager {

    private Employee employee;

    public BusinessManager(Employee employee) {
        super(employee);
    }

    @Override
    protected void manageEmployee() {
        System.out.println("Shout at employee like dog");
    }
}

package decorator.impl;

import decorator.Employee;
import decorator.Manager;

public class TechnicalManager extends Manager {

    public TechnicalManager(Employee employee) {
        super(employee);
    }

    @Override
    protected void manageEmployee() {
        System.out.println("Hit employees like hitting buffalo");
    }
}

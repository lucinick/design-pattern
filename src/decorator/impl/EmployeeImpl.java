package decorator.impl;

import decorator.Employee;

public class EmployeeImpl implements Employee {

    @Override
    public void work() {
        System.out.println("Working like a buffalo");
    }
}

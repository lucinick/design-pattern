package decorator.decorator2;

public abstract class EmployeeDecorator implements Employee{

    protected Employee employee;

    public EmployeeDecorator() {
        this.employee = new SimpleEmployee();
    }

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void work() {
        employee.work();
    }

}

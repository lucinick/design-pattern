package decorator;

public abstract class Manager implements Employee{

    protected Employee employee;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void work() {
        employee.work();
    }

    protected abstract void manageEmployee();
}

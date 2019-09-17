package decorator.diffvsinheritance;


class Employee {

    public void work() {
        System.out.println("Working like a buff");
    }
}

class Manager extends Employee {

    Employee employee;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void work() {
        //// Do something
        employee.work();
        System.out.println("Work more...");
        //// Do something
    }

    public void manageEmployee() {
        System.out.println("Treat employee as buff");
    }
}

class Client {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();

        employee = new Manager(employee);
        employee.work();
    }
}
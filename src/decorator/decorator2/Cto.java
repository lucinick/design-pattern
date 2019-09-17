package decorator.decorator2;

public class Cto extends EmployeeDecorator {

    public Cto(Employee employee) {
        super();
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Working as CTO...");
    }
}

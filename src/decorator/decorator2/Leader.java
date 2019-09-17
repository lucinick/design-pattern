package decorator.decorator2;

public class Leader extends EmployeeDecorator {

    public Leader(Employee employee) {
        super();
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Working as a Leader...");
    }
}

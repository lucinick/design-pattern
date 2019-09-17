package decorator.decorator2;

public class Ceo extends EmployeeDecorator {

    public Ceo(Employee employee) {
        super();
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Working as CEO...");
    }
}

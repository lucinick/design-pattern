package decorator.decorator2;

public class SimpleEmployee implements Employee {

    @Override
    public void work() {
        System.out.println("Working as an employee...");
    }
}

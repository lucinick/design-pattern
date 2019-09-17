package decorator.decorator2;

public class Client {

    public static void main(String[] args) {
        Employee employee = new Cto(new Ceo(new Leader(new SimpleEmployee())));
        employee.work();
    }
}

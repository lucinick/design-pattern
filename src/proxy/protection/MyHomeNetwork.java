package proxy.protection;

public class MyHomeNetwork implements Network {

    @Override
    public void connect() {
        System.out.println("Connected to my home's network");
    }
}

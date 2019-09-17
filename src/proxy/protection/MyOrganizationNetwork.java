package proxy.protection;

public class MyOrganizationNetwork implements Network {
    @Override
    public void connect() throws Exception {
        System.out.println("Connected to my org's network");
    }
}

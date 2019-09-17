package proxy.protection;

public class Client {

    public static void main(String[] args) throws Exception {
        Network network = new NetworkProxy(MyHomeNetwork.class);
        network.connect();

        network = new NetworkProxy(MyOrganizationNetwork.class);
        network.connect();
    }
}

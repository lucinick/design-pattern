package proxy.protection;

public class NetworkProxy implements Network {

    Class<? extends Network> networkClass;

    public NetworkProxy(Class<? extends Network> networkClass) {
        this.networkClass = networkClass;
    }

    NetworkFactory factory = new NetworkFactory();

    @Override
    public void connect() throws Exception {
        int rnd = (int) (Math.random()* 10);
        if (rnd % 2 == 0) {
            Network network = factory.getNetwork(networkClass);
            network.connect();
        } else {
            System.out.println("Blocked by proxy");
        }

    }
}

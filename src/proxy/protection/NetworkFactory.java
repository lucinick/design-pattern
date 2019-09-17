package proxy.protection;

public class NetworkFactory {

    public Network getNetwork(Class<? extends Network> networkClass) throws Exception {
        if (networkClass.equals(MyHomeNetwork.class)) {
            return new MyHomeNetwork();
        } else if(networkClass.equals(MyOrganizationNetwork.class)) {
            return new MyOrganizationNetwork();
        } else {
            throw new Exception("No such network exception: " + networkClass.getSimpleName());
        }
    }
}

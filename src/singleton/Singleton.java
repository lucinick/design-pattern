package singleton;

public class Singleton implements Example{

    private static Singleton singleton;

    private  Singleton() {
        this.singleton = new Singleton();
    }

    public static Singleton newInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    public void write() {
        System.out.println("Singleton created");
    }

    @Override
    public void present() {
        System.out.println("Singleton class");
    }
}

package singleton;

public class StaticClassWrapper {

    static class StaticClass implements Example{

        @Override
        public void present() {
            System.out.println("Static class");
        }
    }
}

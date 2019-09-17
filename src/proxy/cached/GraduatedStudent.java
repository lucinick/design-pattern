package proxy.cached;

public class GraduatedStudent implements Student {

    private String name;

    public GraduatedStudent(String name) {
        this.name = name;
    }

    @Override
    public void count() {
        System.out.println(this.name + " is in here!");
    }

    @Override
    public String getName() {
        return name;
    }
}

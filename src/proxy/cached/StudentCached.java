package proxy.cached;

import java.util.Map;

public class StudentCached implements Student {

    private Map<String, Student> students;

    @Override
    public void count() {
        System.out.println("There are total " + students.size() + " students counted!");
    }

    @Override
    public String getName() {
        return "Nick";
    }
}

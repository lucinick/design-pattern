package decorator.impl;

import decorator.Director;
import decorator.Manager;

public class Cto extends Director {

    public Cto(Manager manager) {
        super(manager);
    }

    @Override
    protected void lead() {
        System.out.println("Let's work like this");
    }

    @Override
    protected void setMajor(Manager manager) {
        manager = new TechnicalManager(manager);
    }
}

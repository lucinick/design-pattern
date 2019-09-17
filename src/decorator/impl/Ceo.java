package decorator.impl;

import decorator.Director;
import decorator.Manager;

public class Ceo extends Director {

    public Ceo(Manager manager) {
        super(manager);
    }

    @Override
    public void lead() {
        System.out.println("Let's be rich!");
    }

    public void setMajor(Manager manager) {
        manager = new BusinessManager(manager);
    }

}

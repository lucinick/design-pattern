package decorator;


public abstract class Director extends Manager {

    protected Manager manager;

    public Director(Manager manager) {
        super(manager);
    }

    @Override
    protected void manageEmployee() {
        manager.manageEmployee();
    }

    protected abstract void lead();

    protected abstract void setMajor(Manager manager);
}
package abstraction.interfaceExample;

public interface Manager {
    /**
     * interface has all methods as public and abstract by default
     * interface has all the variables public, static and final by default
     * interface dont have any constructor
     * we cannot create object of interface
     * reference can be created by invoking child class(who is implementing interface) constructor
     *
     */

    void development();

    void delivery();
}

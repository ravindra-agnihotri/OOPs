package encapsulation;

public class Locker {
    /**
     * having a private variable in class and accessing its value outside of class by means
     * of getter and setter methods is called encapsulation
     */

    private String locker= "1000";

    //getter method somply returns the private variable
    public String getLocker() {
        return locker;
    }
    //setter method sets the value in method parameter to the private var value
    public void setLocker(String locker) {
        this.locker = locker;
    }
}

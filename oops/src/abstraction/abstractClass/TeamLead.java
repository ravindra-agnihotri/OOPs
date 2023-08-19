package abstraction.abstractClass;

public abstract class TeamLead {
    //a class is called abstract class when we use abstract keyword with it

    /*
    abstract class can have both abstract and defined method
    abstract class object cannot be created
    abstract class has a constructor which is used to invoke class variables
    any n number of classes can extend abstract class
     */

    //a method is called when it has abstract keyword in it
    //abstract method cannot have body, a class who extends abstract method gives body to that method
    //by overriding it
    public abstract void testcaseWriting();

    public void timesheetApprove(){
        System.out.println("approve timesheet");
    }
}

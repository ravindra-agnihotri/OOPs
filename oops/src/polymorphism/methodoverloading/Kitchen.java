package polymorphism.methodoverloading;

public class Kitchen {
    /**
     * method overloading means having a method with different type of parameters in same class
     * method overloading doesn't depend on return type(return type can be different)
     */
    public void cooker(){
        System.out.println("simple cooker");
    }

    public void cooker(String rice){
        System.out.print("cooker with"+ rice);
    }

    public void cooker(int eggs){
        System.out.println("cooker with"+eggs);
    }
}

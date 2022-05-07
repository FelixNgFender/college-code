//Refer to Chinese.java

public class JavaOOP1 {
    int y;
    String z;

    static void myMethod() {
        System.out.println("Hello gay!");
    }

    public void publicMethod() {
        System.out.println("A public shame!");
    }

    static void staticMethod() {
        System.out.println("Static electricity!");
    }

    //CONSTRUCTOR
    public JavaOOP1() {
        y = 6;
        z = "Felix";
    }

    //OVERLOADING CONSTRUCTOR
    public JavaOOP1(int k, String l) {
        y = k;
        z = l;
    }

    public static void main(String[] args) {
        //OOP
        //OOP vs procedural programming: faster, easier, clearer structure, DRY (Don't Repeat Yourself), easier to maintain, modify and debug, shorter development time
        
        //CLASSES & OBJECTS
        //A class is like an object constructor, or a blueprint for creating objects
        //Objects have attributes (variables) and methods inherited from their respective class
        //Creating an object = Instantiating => Object is an instance of a class that has specified values rather than variables
        Chinese ling = new Chinese();
        System.out.println(ling.x);

        JavaOOP1 jav = new JavaOOP1();
        System.out.println(jav.y);
        myMethod();

        //STATIC VS NON-STATIC
        //Static methods need not creating an object to be invoked, whereas non-static methods can only accessed by objects
        jav.publicMethod();
        staticMethod();

        //CONSTRUCTORS
        //A special method used to initialize values for object attributes & is called when an object is instantiated
        //Constructor name = class name & no return type (even void)
        //Can take parameters to initialize attributes
        JavaOOP1 jaV = new JavaOOP1(420, "YOASOBI");
        System.out.println(jaV.y + " " + jaV.z);

        //MODIFIERS
        //Access & non-access modifiers: https://www.w3schools.com/java/java_modifiers.asp
    }
}
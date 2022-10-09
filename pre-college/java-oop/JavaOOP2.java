//ENCAPSULATION: refer to Vietnam.java
//INHERITANCE: refer to School.java and Lop.java
//ABSTRACTION:refer to Abs.java and AbsSub.java
//INTERFACE: refer to Inf1.java and SubClassImplement.java
//ENUMS: refer to DaysOfTheWeek.java

public class JavaOOP2 {
    public static void main(String[] args) {
        //ENCAPSULATION
        //Hide sensitive data from users
        //Declare class attributes as private & provide public get & set methods to accesss private variables
        //Attributes can be made to be read-only or write-only if you provide either the getter or the setter

        Vietnam felix = new Vietnam();
        System.out.println("The population before editing: " + felix.getPop());
        felix.setPop(60000);
        System.out.println("The population after: " + felix.getPop());

        //INHERITANCE
        //Inherit attributes and methods from one class to another
        //The subclass (child) inherits from its superclass (parent) (Java does not support multiple inheritance)
        //Constructors cannot be inherited, but the constructor of the superclass can be invoked from the subclass
        //final keyword can be used for class to prevent inheritation

        //POLYMORPHISM
        //Polymorphism uses inherited methods to perform different tasks (Same method's name, different subclasses, different output)
        //https://www.w3schools.com/java/java_polymorphism.asp

        //ABSTRACTION
        //The process of hiding certain information and only showing the essential to the users
        //Abstract class cannot be used to create objects
        //To access abstract class, it must be inherited from another class
        //Abstract methods can only be created in an abstract class & do not have any statements. Their body is provided by the subclass
        //Essentially, abtract class is the blueprint for creating subclasses
        //Abstraction = Don't Repeat Yourself (DRY)

        AbsSub absObj = new AbsSub();
        absObj.noAbsMethod();
        absObj.absMethod();
        
        //PACKAGES
        //A group of related classes
        //Two types: Built-in (from the Java API) & user-defined
        //import package.name.Class;   // Import a single class
        //import package.name.*;   // Import the whole package 
        //Package: https://www.w3schools.com/java/java_packages.asp

        //INNER CLASSES
        //Nest a class within a class
        //To access the inner class, create an object of the outer class, then create an object of the inner class
        JavaOOP2 myOuter = new JavaOOP2();
        JavaOOP2.innerClass myInner = myOuter.new innerClass(); //Using the myOuter object to invoke the innerClass constructor
        System.out.println(myInner.y + myOuter.x);
        //Inner classes can be made to be static, needing no creation of an object of the outer class
        JavaOOP2.innerStaticClass myInnerStatic = new JavaOOP2.innerStaticClass();
        System.out.println(myInnerStatic.z + myOuter.x);
        //Inner classes can access attributes and methods of the outer class
        System.out.println(myInner.myInnerMethod());

        //INTERFACE
        //A completely "abstract class" to group related methods with empty bodies
        //Interface methods are public & abstract, interface attributes are public, static & final, cannot contain a constructor since it cannot create objects
        //On implemetation, all abstract methods must be overridden
        //Although there is no multiple inheritance, multiple implementation can be achieved (...implements Interface1, Interface 2...)

        SubClassImplement implementObj = new SubClassImplement();
        implementObj.method1();
        implementObj.method2();

        //ENUMS
        //A special "class" that represents a group of constants
        //You cannot use the "new" keyword to instantiate a new object with the type DaysOfTheWeek
        //enum = class = can have attributes and methods
        //enum constants are public, static, and final
        //Use enums when you have constants

        DaysOfTheWeek day = DaysOfTheWeek.MONDAY;
        System.out.println(day);
        for (DaysOfTheWeek myday : DaysOfTheWeek.values()) {
            System.out.println(myday);
        }

    }

    int x = 6;
    class innerClass {
        int y = 5;
        public int myInnerMethod() {
            return x;
        }
    }
    private static class innerStaticClass {
        int z = 7;
    }
}


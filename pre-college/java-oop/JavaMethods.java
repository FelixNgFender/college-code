public class JavaMethods {
    static void methodTest(String name, int age) {
        //void: does not return value
        //When a parameter is passed to method, it is called an argument => name, age are parameters, Felix, 18 are arguments
        System.out.println(name + " is " + age);
    }

    static int plus(int vailin) {
        //int: return type
        return vailin + 5;
    }

    static double gay(double vailin) {
        //Method overloading: Methods of the same class having the same name but different in parameters
        return vailin + 5;
    }
    public static void main (String[] args) {
        methodTest("Felix", 18);
        System.out.println(plus(5));
        
        //SCOPE
        //Variables are only accessible inside the region they are created. 
        //Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared.

        //RECURSION
        //Essentially making a function call itself
        //Every recursive function should have a halting condition to prevent infinite recursion
        System.out.println(sum(10));
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k-1);
        }
        else return 0;

    }
}
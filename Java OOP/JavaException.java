public class JavaException {
    public static void main(String[] args) {
        //EXCEPTION
        //try-catch: try then execute the catch statement when Java throws an error
        //finally: lets you execute code after try-catch regardless of the result
        //Types of exceptions: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc
        try {
            int[] myNums = {1, 2, 3};
            System.out.println(myNums[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This statement will be printed regardless of the result of the try-catch statement");
        }
        //throw: creates a custom error
        throwGender("Male");

        
    }
    
    public static void throwGender(String a) {
        if (a == "Male") {
            throw new SecurityException("You are a male - Access not granted");
        }
        else {
            System.out.println("Access granted");
        }
    }
    
}
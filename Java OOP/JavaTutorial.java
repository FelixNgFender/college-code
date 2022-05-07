public class JavaTutorial {
    public static void main(String[] args) {
        System.out.println("Hello");
        //System is a Java class

        /* The shortcut to multi-line comments in 
        VSCode is Alt+Shift+A */

        //DATA TYPES
        /* Primitive data types: int, boolean, byte, short, long, float, double, char
        * Reference (non-primitive) data types: Strings, Arrays, Classes, Interface
        * ------------------------------------------
        * Primitive                 ||               Reference
        * 8 types, pre-defined                   Unlimited (user defined, not defined by Java except for Strings)
        * Cannot                                 Can be used to call methods to perform certain operations
        * stores data (depends on data type)     stores an address (=> all types have the same size)
        * hold 1 data                            more than 1
        * less memory                            more memory
        * fast                                   slower */
        
        //TYPE CASTING
        //Widening casting (automatically, small => large)
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myDouble);
        //Narrowing casting (manually, large => small)
        double myDoublee = 9.78;
        int myIntt = (int) myDoublee;
        System.out.println(myIntt);

        //OPERATORS
        // + - * / % ++ -- = += >= <= != && || !
        
        //CONDITIONAL STATEMENTS:
        //if, else, else if, switch
        //Short-hand if else: ternary operator => variable = (condition) ? expressionTrue : expressionFalse;
        int time = 19;
        System.out.println((time == 20)? "It is not time yet": "It is the time");
        //Switch statement:
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break; //saves processing time
            default:
                System.out.println("Looking forward to the Weekend"); //baseline case
        }
        //While loop:
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //Do while loop: always execute once before checking the condition
        int ii = 0;
        do {
            System.out.println(ii);
            ii++;
        }
        while (ii < 0);
        //For loop: when you know exactly how many times to loop
        /* for (1;2;3){
            code;
        }
        1: executed one time before code, 2: condition for continuing code, 3: executes every time after code */
        for (int iii = 0; iii < 2; iii++) {
            System.out.println(iii);
        }
        //For each loop: used exclusively to loop through elements of an Array
        String[] chinese = {"ling", "ching", "ping"};
        for (String iiii: chinese){
            System.out.println(iiii);
        }
        //break & continue: used to break out of loops & skip one iteration in the loop
    }   
}

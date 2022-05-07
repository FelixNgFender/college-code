import java.util.Scanner;
import java.time.*; 

public class JavaBuiltinClasses {
    public static void main(String[] args) {
        //STRING CLASS
        //String is an object, which means you can perform methods with them
        String tenTao = "Thinh";
        System.out.println(tenTao.length());
        //Addition methods: .toUppercase(), .toLowerCase(), indexOf();
        //Concatenation:
        String x = "10";
        int y = 20;
        System.out.println(x + y);
        //Escape characters:
        System.out.println("We are the so-called \"Vikings\"\nFrom the north.");

        //MATH CLASS
        System.out.println(Math.max(5, 60));
        //Additional methods: Math.min(x, y), Math.sqrt(x), Math.abs(x), Math.random() (0.0 <= x < 1.0),
        
        //USER INPUT
        //Import the Scanner class from the java.utility package
        
        Scanner scanObj = new Scanner(System.in);

        System.out.println(scanObj.nextLine());
        System.out.println("I repeated what you just said!");
        scanObj.close(); //Good practice to close IO classes

        //DATE & TIME
        //Import java.time package
        System.out.println(LocalTime.now());

        //WRAPPER
        Integer myInt = 500;
        System.out.println(myInt.toString().length());

    }

}
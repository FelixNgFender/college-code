import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegEx {
    public static void main(String[] args) {
        //REGULAR EXPRESSION
        //import java.util.regex
        //A sequence of characters that form a search pattern
        //Used for text search & text replace
        Pattern pattern = Pattern.compile("Bich", Pattern.CASE_INSENSITIVE); //The pattern is created using the compile() method, the first parameter is the pattern, the second one is an optional flag
        Matcher matcher = pattern.matcher("Bich is a good student"); //The matcher() method is used to search for the pattern in a String & returns a Matcher object that contains information about the search
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        //https://www.w3schools.com/java/java_regex.asp
        
    }
    

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class JavaDataStructure {
    public static void main(String[] args) {
        //ARRAYS
        //Fixed size
        int[] zodiac = {69, 420, 6969, 9696};
        for (int te: zodiac) {
            System.out.println(te + 1);
        }
        for (int iiiii = 0; iiiii < zodiac.length; iiiii++) {
            System.out.println(zodiac[iiiii]);
        }
        //Multidimesional Arrays:
        int[][] myNums = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int k = 0; k < myNums.length; k++) {
            for (int l = 0; l < myNums[k].length; l++) {
                System.out.print(myNums[k][l] + " ");
            }
        }

        //ARRAYS VS COLLECTIONS
        //https://javabydeveloper.com/arrays-vs-collections-java/#:~:text=What%20is%20an%20Array%20in,homogeneous%20(same%20type)%20elements.

        //ARRAYLIST
        //Import the ArrayList class
        //Elements can be added or removed from ArrayList
        ArrayList<String> classes = new ArrayList<String>();
        classes.add("Ly");
        System.out.println(classes.get(0));
        classes.set(0, "Toan");
        System.out.println(classes.get(0));
        //classes.remove(index); classes.clear(); 
        System.out.println(classes.size());
        classes.add("Hoa");
        classes.add("Ly");
        classes.add("Sinh");
        for (int i = 0; i < classes.size(); i++) {
            System.out.print(classes.get(i));
        }
        for (String x : classes) {
            System.out.print(x);
        }
        //Elements in an ArrayList are actually objects like Strings. To use a primitive data type, wrapper classes are needed
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(5);
        integers.add(6);
        for (int i : integers) {
            System.out.println(i);
        }
        //Sorting an ArrayList alphabetically or numerically: import the Collections class
        Collections.sort(integers);
        for (int i : integers) {
            System.out.println(i);
        }

        //LINKED LIST
        //Import the LinkedList class, almost identical to ArrayList
        //Both have the same methods for implementing the List interface
        //Difference: ArrayList has a regular array, when an element is added, it is placed into the array. If the array is not big enough, a new larger one is created and the old one is deleted
        //LinkedList stores items in containers. The list has a link to the first container & each container has a link to the next one. Adding an element is placing it in one container and linking it to one of the others.
        //ArrayList: storing & accessing data, LinkedList: manipulating data
        LinkedList<Boolean> humansLie = new LinkedList<Boolean>();
        //ArrayList is more efficient when accessing random elements, but LinkedList has the advantage of size
        humansLie.addFirst(true);
        humansLie.addLast(false);
        humansLie.removeFirst();
        System.out.println(humansLie.getFirst());

        //HASHMAP
        //Import the HashMap class
        //Accessing items in an Array requires an index of int type, with HashMap the index can be of another type
        //E.g: String keys - Integer values, String keys - String values
        HashMap<Integer, String> myNumbers = new HashMap<Integer, String>();
        myNumbers.put(1, "One");
        myNumbers.put(69, "Sixty-nine");
        myNumbers.put(420, "Four twenty");
        System.out.println(myNumbers.get(420));
        for (Integer i : myNumbers.keySet()) {
            System.out.println("key: " + i + " value: " + myNumbers.get(i));
        }
        // keySet(): only keys, values(): only values
        myNumbers.remove(420);
        myNumbers.clear();
        System.out.println(myNumbers.size());
        
        //HASHSET
        //Import the HashSet class
        //A collection where every item is unique
        HashSet<String> woodwinds = new HashSet<String>();
        woodwinds.add("Clarinet");
        woodwinds.add("Oboe");
        woodwinds.add("Saxophone");
        for (String i : woodwinds) {
            System.out.println(i);
        }
        System.out.println(woodwinds.contains("Guitar"));
        woodwinds.remove("Clarinet");
        woodwinds.clear();
        System.out.println(woodwinds.size());        

        //ITERATOR
        //Import the Iterator class
        //An object used to loop through collections
        woodwinds.add("Clarinet");
        woodwinds.add("Oboe");
        woodwinds.add("Saxophone");
        Iterator<String> iterObj = woodwinds.iterator(); //Get an Iterator at this current state of the collection
        System.out.println(iterObj.next());
        //woodwinds.add("Flute"); //This line will cause an error
        while(iterObj.hasNext()) {
            System.out.println(iterObj.next());
        }
        //iterObj.remove(): remove an element
        //Trying to remove items with for loop or for-each loop would not work since the size of the collection is changing => while loop, baby
    }
}

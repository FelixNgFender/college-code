public class JavaThreads extends Thread {
    public static int randomTest = 0;

    public void run() {
        System.out.println("This code is running in a thread");
        randomTest++;
    }

    public static void main(String[] args) {
        //THREADS
        //Allows a program to operate more efficiently by perfoming multiple tasks at once
        //Creating threads: 1/ extending the Thread class & overriding its default run() method 2/ implementing the Runnable interface
        //Running threads: 1/ (w/ extension) creating a JavaThreads object & calling the start() method 2/ (w/ implementation) create a Thread object by creating & passing a JavaThreads object to the Thread's constructor, then call the thread's start() method
        JavaThreads thread = new JavaThreads();
        thread.start();
        System.out.println("This code is running outside of the thread");
        //Extending VS Implementing: Multiple inheritance is inhibited, while multiple implementation is not => class MyClass extends SomeRandomClass implements Runnable {}
        //Concurrency problems: Since threads run simultaneously with other parts of the program, the code will run in a random order. When the threads & the main program are using the same variables, the values are unpredictable
        //Prevention: use isAlive() method
        while (thread.isAlive()) {
            System.out.println("Waiting");
        }
        //Update randomTest and print its value
        System.out.println("Main: " + randomTest);
        randomTest++;
        System.out.println("Main: " + randomTest);    
    }
}
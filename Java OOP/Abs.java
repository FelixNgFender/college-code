abstract class Abs {
    public abstract void absMethod(); //Abstract method needs to be implemeted

    public void noAbsMethod() {
        System.out.println("You called an inherited non-abstract method"); //Regular method does not
    }
}

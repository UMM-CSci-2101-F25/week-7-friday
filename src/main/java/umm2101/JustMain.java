package umm2101;

public class JustMain {

    public static void main(String[] args) {
        Stack<Integer> myStack = new AStack<>();
        myStack.push(23);
        myStack.push(34);
        myStack.push(45);

        for ( ; !myStack.isEmpty(); myStack.pop()){
            System.out.println(myStack.topValue());
        }
        System.out.println("This is coming from the class JustMain when you run the main method.\nUse this to exercise your code and help you understand it.");
    }

}

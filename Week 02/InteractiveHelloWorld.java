import java.util.Scanner;

class InteractiveHelloWorld {
    public static void main(String[] args) {
        // method main calls a method we wrote for a more fancy and
        // interactive experience.
        ourOwnMethod();
    } // method main

    /**
     * A simple method of our own making, that prompts users to enter their
     * names and then greets them personally. The method demonstrates how
     * we can create code that can be summoned by other parts of the program.
     */
    public static void ourOwnMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nHello, what is your first name? ");
        String firstName = sc.nextLine();
        System.out.printf("\nIt's a pleasure to meet you %s\n\n", firstName);
    } // method ourOwnMethod
} // class InteractiveHelloWorld

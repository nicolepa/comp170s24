import java.util.Scanner;

class InteractiveHelloWorld {
    public static void main(String[] args) {
        ourOwnMethod();
    }

    public static void ourOwnMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nHello, what is your first name? ");
        String firstName = sc.nextLine();
        System.out.printf("\nIt's a pleasure to meet you %s\n\n", firstName);
    }
}

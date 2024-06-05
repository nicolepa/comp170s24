/*
 * Use the starter code below to write a program that assigns values to three
 * variables for the following information:
 *  - your first name,
 *  - your favorite movie, and
 *  - your hometown
 * Then use the variables above to produce the following output with the underlined 
 * parts indicating data specific to you, stored in the variables you created.
 *   
 * Hello, my name is Frodo, I am from Hobbiton, and my favorite movie is Young Frankenstein
 *                   -----            --------                           ------------------
 * 
 * DO NOT USE any tools that require to be imported, ie, do not use the import command.
 *
 * To save this assignment, make sure you commit your changes to your GitHub repository,
 * following the instructions in Sakai. IF YOU DO NOT COMMIT THE CHANGES, IT IS POSSIBLE THAT
 * YOUR WORK MAY BE LOST AND YOU MAY HAVE TO START ALL OVER AGAIN.
 */
public class A01 {
    public static void main(String[] args) {
        // variable to store my first name
        String myFirstName = "NYJ";
        // variable to store my hometown
        String myHometown = "Stillwater";
        //variable to store my favorite movie
        String myFavMovie = "Harry Potter and the Order of the Phoenix";

        // print out my personal message
        System.out.printf("Hello, my name is %1$s," + "I am from %2$s," +
            "and my favorite movie is %3$s", myFirstName, myHometown, myFavMovie);

    } // method main
} // class A01

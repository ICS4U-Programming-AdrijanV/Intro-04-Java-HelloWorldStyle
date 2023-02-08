/**
* The HelloWorld program implements an application that
* simply displays my plans for next year to the standard output.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-08
*/
public final class HelloWorldStyle {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class.");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println("Next year I plan on going to university.");
        System.out.println("I'm very exited!");
    }
}


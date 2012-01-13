/**
 * Main class of application.
 *
 *
 * @author Gevorg Harutyunyan.
 */
public class App {
    /**
     * We have forked this project.
     */
    public static String[] whoForkedThisProject = {
            "Gevorg Harutyunyan",
            "Known Forker",
            "Hmm..."
    };

    /**
     * Returns mission message.
     *
     * @return string containing mission message.
     */
    public static String getMission() {
        return "Welcome to project with known mission!";
    }

    /**
     * Standard main method.
     *
     * @param args input argument array.
     */
    public static void main(String[] args) {
        // Prints mission message.
        System.out.println( getMission() );
        System.out.println();
        
        // Prints list.
        for ( String person : whoForkedThisProject ) {
            System.out.println( person );
        }
    }
}

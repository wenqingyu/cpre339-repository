import java.io.*;

public class useCustomer {

    private static Movie monty = new Movie("Life of Brian", Movie.REGULAR);
    private static Movie terry = new Movie("Brazil", Movie.REGULAR);
    private static Movie disney = new Movie("Snow White", Movie.CHILDRENS);
    private static Movie nicole = new Movie("Moulin Rouge", Movie.NEW_RELEASE);
    

    private static Rental r1 = new Rental(monty, 7);
    private static Rental r2 = new Rental(terry, 14);
    private static Rental r3 = new Rental(disney, 4);
    private static Rental r4 = new Rental(nicole, 2);

    private static Customer ken = new Customer("Ken Anderson");

    public static void main(String[] args) {
        try {
            ken.addRental(r1);
            ken.addRental(r2);
            ken.addRental(r3);
            ken.addRental(r4);

//            File target = new File(args[0]);
            File target = new File("targetStatement.txt");
            

            LineNumberReader in = new LineNumberReader(new FileReader(target));

            String targetStatement = null;
            String line            = null;

            while ((line = in.readLine()) != null) {
                if (targetStatement != null) {
                    targetStatement += line;
                } else {
                    targetStatement = line;
                }
                targetStatement += "\n";
            }
            // strip off last \n
            targetStatement =
                targetStatement.substring(0, targetStatement.length()-1);

            System.out.println("Current Statement:\n\n" + ken.statement());
            System.out.println("");
            System.out.println("");
            System.out.println("Target Statement:\n\n" + targetStatement);
            System.out.println("");

            if (targetStatement.equals(ken.statement())) {
                System.out.println("Test Passed.");
            } else {
                System.out.println("Test Failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

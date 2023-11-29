package soal1;
import java.text.DecimalFormat;
public class PaintThings {
    public static void main(String[] args) {
        //--------------------------------------------------
        // Creates some shapes and a Paint object
        // and prints the amount of paint needed
        // to paint each shape.
        //--------------------------------------------------
        final double COVERAGE = 350;
        Paint p1 = new Paint(COVERAGE);
        Rectangle deck; Sphere bigBall; Cylinder tank;
        double deckAmt, ballAmt, tankAmt;
        // Instantiate the three shapes to paint
        deck= new Rectangle(20,30);
        bigBall=new Sphere(15);
        tank=new Cylinder(10,30);
        // Compute the amount of paint needed for each shape
        deckAmt= p1.amount(deck);
        ballAmt= p1.amount(bigBall);
        tankAmt= p1.amount(tank);
        DecimalFormat fmt = new DecimalFormat("0.#");
        // Print the amount of paint for each.
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
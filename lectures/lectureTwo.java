import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class lectureTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Two values: ");
        int intOne = sc.nextInt(); // take first input
        int intTwo = sc.nextInt(); // takes next input after space char ' '

        System.out.println(intOne + " " + intTwo);

        DecimalFormat df = new DecimalFormat("0.00"); // format template for double type variables
        double num = 0.000000;
        System.out.println(df.format(num)); // formats num to 9.99

    }

}

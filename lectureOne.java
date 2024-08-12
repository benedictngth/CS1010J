import java.util.Scanner;

public class lectureOne {
    public static void main(String[] args) {
        // primitive types are all value types
        // int, double, float, char, boolean, byte, short, long

        Scanner sc = new Scanner(System.in); // new Scanner object
        System.out.print("Enter a double number: "); // print does not cause a newline
        double dNum = sc.nextDouble();
        int iNum = (int) dNum; // type casting works primitive types
        System.out.println("Hello, " + iNum + "!"); // print jumps cursor to newline

        double celcius = 5.0 / 9 * (dNum - 32); // 5/9 will be 0 due to integer division hence used double 5.0
        // double celcius = (dNum-32) * 5/9; // this works as dNum is of type double

        System.out.println("Temperature in Celcius: " + celcius); // + operator is overloaded for string concatenation

    }
}
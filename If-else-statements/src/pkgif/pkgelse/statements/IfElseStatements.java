package pkgif.pkgelse.statements;

import java.util.Scanner;
// Import Scanner Here

/**
 *
 * Name: Period: Project Name:
 *
 *
 */
public class IfElseStatements {

    private static Scanner kb = new Scanner(System.in);
    // Create Scanner Object here So it may be used in all methods

    public static void main(String[] args) {
        // Happy Coding!

        //Invoke the methods here 
    }

    public static void question1() {
        int averageGrade = kb.nextInt();
        if (averageGrade < 70) {
            System.out.println("Passing");
        } else {
            System.out.println("Not Passing");
        }

    }

    public static void question2() {
        System.out.println("Gimme a numba");
        int numba = kb.nextInt();
        if (numba >= 50) {
            System.out.println("GO");
        } else {
            System.out.println("STOP");
        }

    }

    public static void question3() {
        System.out.println("Gimme a integer");
        int integer = kb.nextInt();
        if (integer % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }

    public static void question4() {
        System.out.println("Give me another integer");
        int integer = kb.nextInt();
        if (integer % 5 == 0) {
            System.out.println("Multiple of 5");
        } else {
            System.out.println("Not a multiple of 5");
        }

    }

    public static void question5() {
        System.out.println("Give me a numba again");
        int numba = kb.nextInt();
        if (numba < 10) {
            System.out.println("One digit");
        } else if (numba <= 100) {
            System.out.println("Three digits");
        } else {
            System.out.println("Two digits");
        }

    }

    public static void question6() {
        System.out.println("Gimme a jersey number");
        int jerseyNum = kb.nextInt();
        if (jerseyNum == 12 || jerseyNum == 71 || jerseyNum == 80) {
            System.out.println("That number is retired by the Seattle Seahawks");
        }

    }

    public static void question7() {
        System.out.println("Give me a state");
        String state = kb.nextLine();
        if (state.equals("Washington") || state.equals("Oregon") || state.equals("Idaho")) {
            System.out.println("This state is in the PNW");
        } else {
            System.out.println("You should move to the PNW; its great there");
        }

    }

    public static void question8() {
        System.out.println("Give me a drink size");
        String drinkSize = kb.nextLine();
        if (drinkSize.equals("Short"))
            System.out.println("This drink is 8 ounces");
        else if (drinkSize.equals("Tall"))
            System.out.println("This drink is 12 ounces");
        else if (drinkSize.equals("Grande"))
            System.out.println("This drink is 16 ounces");
        else if (drinkSize.equals("Venti"))
            System.out.println("This drink is 20 ounces");
        

    }

    public static void question9() {

    }

    public static void question10() {

    }

}

package utils;

import java.util.Scanner;

public class Validation {
    public static Scanner in = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
    public double checkInputDouble() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    }
    public boolean checkOdd(double n) {
        if (n % 2 == 1) {
            return true;
        } else  {
            return false;
        }
    }
    public  boolean checkEven(double n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }

}

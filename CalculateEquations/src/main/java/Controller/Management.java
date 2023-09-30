package Controller;

import View.Menu;
import lib.Algorithm;

public class Management extends Menu {
    Algorithm algorithm = new Algorithm();
    static String[] menu = {
            "Calculate Superlative Equation",
            "Calculate Quadratic Equation",
            "Exit"
    };

    public Management() {
        super("Equation Program", menu);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                algorithm.superlativeEquation();
                break;
            case 2:
                algorithm.quadraticEquation();
                break;
            default:
                System.exit(0);
        }
    }
}


package controller;

import common.Algorithm;
import java.util.ArrayList;
import model.Country;
import view.Menu;

public class CountryController {

    private final String[] MAIN_MENU_ITEMS = {
        " Input the information of 11 countries in East Asia",
        " Display the information of country you've just input",
        " Search the information of country by user-entered name",
        " Display the information of countries sorted name in ascending order",
        " Exit",};

    Algorithm algorithm = new Algorithm();
    ArrayList<Country> lc = new ArrayList<>();

    Menu mainMenu = new Menu("===== Menu =====", MAIN_MENU_ITEMS) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    algorithm.inputCountry(lc);
                    break;
                case 2:
                    algorithm.printCountry(lc);
                    break;
                case 3:
                    algorithm.searchByName(lc);
                    break;
                case 4:
                    algorithm.printCountrySorted(lc);
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }
    };

    public void run() {
        mainMenu.run();
    }
}

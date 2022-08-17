package com.revature.ui;

import java.util.Scanner;

public interface Menu {
    //Will display the information for the menu to the console
    public void getDisplay();

    //Will route the user to the correct menu
    //May also display extra choices depending on the user's choice
    public MenuType userChoice(Scanner scan);

    default void wrongChoice(Scanner scan){
        System.out.println("Please input a valid answer");
        System.out.println("Press Enter to continue");
        scan.nextLine();
    }
}

package com.revature.ui;

import java.util.Scanner;

public class MainMenu implements Menu{

    @Override
    public void getDisplay() {
        System.out.println("Welcome to the Pokemon MainMenu!");
        System.out.println("What would you like to do today?");
        System.out.println("[1] - Add Pokemon");
        System.out.println("[0] - Exit");
    }

    @Override
    public MenuType userChoice(Scanner scan) {
        String userChoice = scan.nextLine();
        
        switch (userChoice) {
            case "0":
                return MenuType.Exit;
            case "1":
                return MenuType.AddPokemon;
            default:
                wrongChoice(scan);
                return MenuType.MainMenu;
        }
    }
    
}

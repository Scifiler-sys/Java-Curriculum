package com.revature.ui;

import java.util.Scanner;

import com.revature.models.Pokemon;
import com.revature.services.PokemonServ;

public class AddPokemon implements Menu{

    //=========== Dependency Injection ===========
    private PokemonServ pokeserv;

    public AddPokemon(PokemonServ pokeserv) {
        this.pokeserv = pokeserv;
    }
    //============================================


    public static Pokemon currentPokemon = new Pokemon();

    @Override
    public void getDisplay() {
        System.out.println("=== Add Pokemon Menu ===");
        System.out.println("Name - " + (currentPokemon.getName() == null ? "" : currentPokemon.getName()));
        System.out.println("Lvl - " + (currentPokemon.getLevel() == 0 ? "" : currentPokemon.getLevel()));
        System.out.println("Health - " + (currentPokemon.getHealth() == 0 ? "" : currentPokemon.getHealth()));
        System.out.println("Damage - " + (currentPokemon.getDamage() == 0 ? "" : currentPokemon.getDamage()));
        
        System.out.println("[5] - Enter Name");
        System.out.println("[4] - Enter Lvl");
        System.out.println("[3] - Enter Health");
        System.out.println("[2] - Enter Damage");
        System.out.println("[1] - Add Pokemon");
        System.out.println("[0] - Go Back");
    }

    @Override
    public MenuType userChoice(Scanner scan) {
        String userInput = scan.nextLine();

        switch (userInput) {
            case "0":
                return MenuType.MainMenu;
            case "1":
                this.pokeserv.addPokemon(this.currentPokemon);
                this.currentPokemon = new Pokemon();

                System.out.println("Pokemon Creation Successful!");
                System.out.println("Please press Enter to continue");
                scan.nextLine();
                return MenuType.MainMenu;
            case "2":
                int dmg = scan.nextInt();
                scan.nextLine();

                currentPokemon.setDamage(dmg);
                return MenuType.AddPokemon;
            case "3":
                int hlth = scan.nextInt();
                scan.nextLine();

                currentPokemon.setHealth(hlth);
                return MenuType.AddPokemon;
            case "4":
                int lvl = scan.nextInt();
                scan.nextLine();

                currentPokemon.setLevel(lvl);
                return MenuType.AddPokemon;
            case "5":
                String name = scan.nextLine();

                currentPokemon.setName(name);
                return MenuType.AddPokemon;
            default:
                wrongChoice(scan);
                return MenuType.AddPokemon;
        }
    }
    
}

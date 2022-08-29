package com.revature;

import java.util.Scanner;

import com.revature.dao.PokemonDao;
import com.revature.dao.Repository;
import com.revature.models.Pokemon;
import com.revature.services.PokemonServ;
import com.revature.ui.AddPokemon;
import com.revature.ui.MainMenu;
import com.revature.ui.Menu;
import com.revature.ui.MenuType;

/**
 * Pokemon project that emulates P0 reqs for Java curriculum 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Used to check if I should keep running the app until the user exits out
        boolean isRunning = true;

        Menu menu = new MainMenu();
        Scanner scan = new Scanner(System.in);

        //Declaring our apps dependencies
        Repository<Pokemon> pokemonDao = new PokemonDao();
        PokemonServ pokemonServ = new PokemonServ(pokemonDao);

        while (isRunning) {
            //Clear the screen
            System.out.print("\033[H\033[2J");  
            System.out.flush();  

            //Show the display
            menu.getDisplay();

            //Grabs the menu we have to display next
            MenuType type = menu.userChoice(scan);

            //Switches our menu reference variable to point to another menu object
            switch (type) {
                case MainMenu:
                    menu = new MainMenu();
                    break;
                case AddPokemon:
                    menu = new AddPokemon(pokemonServ);
                    break;
                case Exit:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Menu doesn't exist.");
                    break;
            }
        }
    }
}

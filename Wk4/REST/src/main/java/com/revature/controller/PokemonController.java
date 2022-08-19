package com.revature.controller;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.PokemonDao;
import com.revature.models.Pokemon;
import com.revature.services.PokemonService;

public class PokemonController extends HttpServlet{
    
    private static PokemonService pokeserv = new PokemonService(new PokemonDao());

    /**
     * This method is responsible with handling all the get request right?
     * 
     * But what if we need multiple get requests from the same Controller??
     * Ex: 
     * Note - it is a POKEMON controller
     * So we should be able to grab a single 
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        /**
         * We are getting the very last part of the URI after
         * Ex:
         * http://localhost:8080/rest/allpokemon -> allpokemon is left
         * http://localhost:8080/rest/pokemon -> pokemon is left
         */
        final String URI = req.getRequestURI().replace("/rest/", "");
        resp.getWriter().write(req.getRequestURI() + "\n");
        resp.getWriter().write(URI+ "\n");

        //By getting the last part we can use a switch statement to change our functionality based on the endpoint
        //So in this way, we can have multiple functionalities with the same controller in the same doGet method
        switch (URI) {
            case "pokemon":
                resp.getWriter().write("Getting one pokemon ");

                int id = Integer.parseInt(req.getParameter("id"));
                // resp.getWriter().write(id);

                Pokemon poke = pokeserv.getPokemonById(id);

                resp.getWriter().write("\n" + poke.getName());
                break;
            case "allpokemon":
                resp.getWriter().write("Getting multiple pokemons");

                List<Pokemon> listOfPoke = pokeserv.getAllPokemon();

                for (Pokemon pokemon : listOfPoke) {
                    resp.getWriter().write("\n"+pokemon.getName());
                }
                break;
            default:
                break;
        }
    }
}

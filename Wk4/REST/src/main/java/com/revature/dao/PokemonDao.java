package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Pokemon;
import com.revature.utils.ConnectionUtil;

public class PokemonDao implements Dao<Pokemon> {

    @Override
    public Pokemon addInstance(Pokemon instance) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Pokemon> getAllInstances() {
        String sql = "select * from Pokemon";

        List<Pokemon> listOfPokemon = new ArrayList<>();

        try (Connection con = ConnectionUtil.getConnection()) {
            
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            //next() method will check if there is another row in our sql table
            while (rs.next()) {
                
                //The actual mapping of the sql table into java obj
                listOfPokemon.add(new Pokemon(
                    rs.getInt("pokeId"),
                    rs.getString("pokename"),
                    rs.getInt("pokelevel"),
                    rs.getInt("health"),
                    rs.getInt("damage")
                ));
            }

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        
        return listOfPokemon;
    }

    @Override
    public Pokemon updateInstance(Pokemon instance) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pokemon deleteInstance(Pokemon instance) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

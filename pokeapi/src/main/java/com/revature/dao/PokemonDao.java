package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.revature.models.Pokemon;
import com.revature.utils.ConnectionUtil;

public class PokemonDao implements Repository<Pokemon>{

    @Override
    public Pokemon addInstance(Pokemon instance) {
        String sql = "Insert into Pokemon(name, pokelevel, health, damage) values (?,?,?,?) returning id";

        try (Connection con = ConnectionUtil.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, instance.getName());
            stmt.setInt(2, instance.getLevel());
            stmt.setInt(3, instance.getHealth());
            stmt.setInt(4, instance.getDamage());
            
            ResultSet rs = stmt.executeQuery();
            rs.next();
            instance.setId(rs.getInt(1));

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        
        return instance;
    }

    @Override
    public List<Pokemon> getAllInstances() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pokemon updateInstance(Pokemon instance) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteInstance(Pokemon instance) {
        // TODO Auto-generated method stub
        
    }
    
}

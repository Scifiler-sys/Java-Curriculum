package com.revature.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
    The aim for lombok java library is to make life easier as a developer when generating boilerplate code
        - boilerplate code is just extra syntaxes that you have to repeat multiple times
        - Ex: your setters and getters, constructors, toString() methods, etc.
    
    Lombok will generate those extra code for you with ease

    @Getter - generates getters for your model
    @Setter - generates setters for your model
    @NoArgsConstructor - makes a constructor with no parameters
    @ToString - overrides and creates a toString() method
    @EqualAndHashCode - overrides and creates equals method and hashcode method
    @Data - for models, it will generate both setter, getter, equals, hashcode, and toString for you
*/

public @Data class Pokemon {
    private String name;
    private int level;
    private int health;
}

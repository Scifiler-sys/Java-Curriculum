package com.revature;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.revature.models.Pokemon;

public class StreamDriver {
    public static void main(String[] args){
        
        /**
         * Stream Api
         * It is used to process/manipulate a collection of objects
         * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
         * 
         * Streams need a data source and it can be from Collection, Arrays, or even IO channels
         */

        List<String> listOfNames = Arrays.asList("Donato", "Marielle", "Garrett", "Win", "wint");

        //What if we want to print any names that start with W (case-insensitive)
        listOfNames.forEach(element -> {
            if (element.startsWith("W") || element.startsWith("w")) {
                //We have a problem and won't show wint cause it is lowercase
                System.out.println(element);
            }
        });

        /*
            Streams are a great way to manipulate the elements in a collection and then do some process/filtering

            You can also just not even filter and just manipulate the elements

            You can also do aggregate functions such as Count which works the same way in SQL
        */
        System.out.println("Stream way");
        listOfNames.stream()
            .map(element -> element.toUpperCase())
            .filter(element -> element.startsWith("W"))
            .sorted()
            .forEach(element -> System.out.println(element)); 
    
        System.out.println("Stream Fancy");

        //Lets get even fancier
        listOfNames.stream()
            .map(String::toUpperCase) //We are referencing the toUpperCase method from the String class
            .filter(element -> element.startsWith("W"))
            .sorted()
            .forEach(System.out::println); //We are referencing the printline method from System.out

        //We can always save the result of the stream api by attaching it to a variable
        List<String> nameWithW = listOfNames.stream()
            .map(String::toUpperCase)
            .filter(ele -> ele.startsWith("W"))
            .collect(Collectors.toList()); //We need to use the collect method to indicate how we should store this information

        // You can also use collectors to display the list in a string
        String aListInString = listOfNames.stream()
            .collect(Collectors.joining(", "));
        
        System.out.println(aListInString);
        
        //What if you want to find an element that may or may not exist?? As we know we hate null values
        //Stream api uses Optional classes to indicate "No result" rather than just straight up giving a null
        //Because returning a null usually leads to your program to stop working because of NullReferencePointer
        Optional<String> sLetter = listOfNames.stream()
            .map(String::toUpperCase)
            .filter(ele -> ele.startsWith("W"))
            .findFirst();

        System.out.println(sLetter);

        /**
         * Fun challenge time but you can only use Streams!
         */

        Pokemon poke1 = new Pokemon("Pikachu", 20);
        Pokemon poke2 = new Pokemon("Charizard", 10);
        Pokemon poke3 = new Pokemon("Eevee", 3);

        List<Pokemon> pokemons = Arrays.asList(poke1, poke2, poke3);

        //===================== DON'T ALTER CODE ABOVE THIS LINE =========================

        /**
         * Get the pokemon who's name is Charizard
         */
    }
}

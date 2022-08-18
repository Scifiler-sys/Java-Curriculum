package com.revature;

import java.util.ArrayList;
import java.util.List;

public class SubTypeDriver {

    /**
     * Subtyping to really know about inheritance and what is happening
     */

    public static void main(String[] args){
        System.out.println("Hello World");
        Object obj = new Object();
        Integer int1 = Integer.valueOf(10);
        Double doubl1 = Double.valueOf(10.6);
        Float float1 = Float.valueOf(56);

        //Yes it is valid since every object inherits object class
        obj = int1;
        
        //Yes also works because Integer, Double, Float all inherits Number
        method1(int1);
        method1(doubl1);
        method1(float1);

        List<Integer> intList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();

        // method2(intList); won't work because it is checking the type of List and not the subtype or the generic type
        // method2(doubleList); 
        // method2(floatList); 
        method2(numberList);

        /**
         * Subtyping is when you want to check the subtype of a class not the actual class itself when doing method2
         * Really only matters to generic classes because they have a secondary type to check on
         */
    }

    public static void method1(Number num1){

    }

    public static void method2(List<Number> list) {
        
    }
}

package br.com.jcury.findbeer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcury on 06/10/2017.
 */

public class BeerExpert {
    public List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();

        if (color.equalsIgnoreCase("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}

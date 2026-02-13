package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * this is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * this adds a city to the list if the city does not exist
     * @param city
     * this is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * this returns a sorted list of cities
     * @return
     * return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * checks whether a given city already exists in the list
     * @param city the city to check
     * @return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * removes a city from the list
     * if the city does not exist, throws an exception
     * @param city the city to remove
     * @throws IllegalArgumentException if the city is not found
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * counts how many cities are currently in the list
     * @return number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}
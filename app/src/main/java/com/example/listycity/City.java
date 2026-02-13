package com.example.listycity;

import java.util.Objects;

/**
 * this is a class that defines a city
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * compares this city to another
     * two cities are equal if they have the same city
     * and province name
     * @param obj the object to compare
     * @return true if both objects represent the same city
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        City other = (City) obj;
        return Objects.equals(this.city, other.city) &&
                Objects.equals(this.province, other.province);
    }

    /**
     * returns a hash code consistent with equals()
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city @param city form add()
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return return for getCities()
     * Return the sorted list of cities
     */
    public List<City> getCities() {
        List<City> cityList = cities;
        Collections.sort(cityList);
        return cityList;
    }

    /**
     *
     * @param city This function delete city from CityList
     */
    //Task i
    public void delete(City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        else{
            cities.remove(city);
        }
    }

    /**
     * This function return the no of City in CityList(Description)
     * @return This function return the no of City in CityList
     * This function return the no of City in CityList(OK)
     */
    //Task ii
    public int count(){
        return cities.size();
    }

    /**
     * This function return the sorted list of CityList
     * @param flag This function helps to sort CityList based on City name and Province name
     * @return return for getCitiesSort
     */
    //Task iii
    public List<City> getCitiesSort(int flag) {
        List<City> cityList = cities;
        if(flag==1){
            Collections.sort(cityList);
        }
        else{
            Collections.sort(cityList, new Comparator<City>() {
                @Override
                public int compare(City city, City t1) {
                    return city.getProvinceName().compareTo(t1.getProvinceName());
                }
            });
        }

        return cityList;
    }

}

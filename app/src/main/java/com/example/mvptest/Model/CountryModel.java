package com.example.mvptest.Model;

public class CountryModel {
    String name,capital;
    int age;
    public CountryModel(String name,String capital,int age){
        this.name=name;
        this.capital=capital;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getAge() {
        return age;
    }
}

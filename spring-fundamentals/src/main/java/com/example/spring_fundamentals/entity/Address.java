package com.example.spring_fundamentals.entity;


import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;

    public Address(String city){
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

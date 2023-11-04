package com.example.firstProj;

import org.springframework.stereotype.Component;
/*
@Author Santhosh
While creating a spring bean in the Spring container, the name of the object in the container will defaultly be
laptop for Laptop and alien for Alien, if we want to customise it we can use the @Component("lap1"), and use the @Qualifier("lap1")
to search for objects
 */
@Component("lap1")
public class Laptop {
    private int lid;
    private String brand;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void compile() {
        System.out.println("Laptop is Showing");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }



}

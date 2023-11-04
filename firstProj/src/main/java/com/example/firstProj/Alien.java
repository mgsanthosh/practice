package com.example.firstProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
@Author Santhosh
To Tell that Alien.class is a bean we have use @Component/ @Service etc anotations
 */
@Component
public class Alien {
    private int aid;
    private String aName;
    private String tech;
    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;


    public Alien() {
        System.out.println("Object Created");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show() {
        System.out.println("Alien is Showing");

        /*
        @Author Santhosh
        if you call the below lne without making the Laptop class a bean and without autowiring it wont work,
        because if you don't have autowired, it won't be able to create an instance/object of the Laptop Class.

         */
        laptop.compile();
    }


}

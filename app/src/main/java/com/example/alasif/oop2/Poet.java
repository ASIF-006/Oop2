package com.example.alasif.oop2;


import java.util.ArrayList;

public class Poet {
    String name, description;
    ArrayList<Poet> poets ;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Poet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Poet() {
    }

    @Override
    public String toString() {
        return name;
    }

    public ArrayList<Poet> allpoets(){

        poets = new ArrayList<Poet>();
        poets.add(new Poet("kazi","National Poet"));
        poets.add(new Poet("Rabi","Novel winner Poet"));
        poets.add(new Poet("Michel","Patriot Poet"));

        return poets;
    }
}

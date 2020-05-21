package com.example.project;

public class News {
    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String auxdata;
    private int cost;

    public News(String id, String name, String type, String company, String location, String auxdata, int cost) {
        ID = id;
        this.name = name;
        this.type = type;
        this.company = company;
        this.location = location;
        this.auxdata = auxdata;
        this.cost = cost;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public String getAuxdata() {
        return auxdata;
    }
    public int getCost() {
        return cost;
    }


}

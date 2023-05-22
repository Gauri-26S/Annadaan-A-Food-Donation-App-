package com.example.aahaarapp;

public class model {
    String name,type,description,userid;
    String id;

    public model() {

    }

    public model(String id,String name, String type, String description, String userid) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.userid = userid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

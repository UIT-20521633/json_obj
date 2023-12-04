package com.example.app.asset;

import java.util.ArrayList;

public class asset {
    public String id;
    public int version;
    public Object createdOn;
    public String name;
    public boolean accessPublicRead;
    public String parentId;
    public String realm;
    public String type;
    public ArrayList<String> path;
    public Attributes attributes;

    public asset() {
    }

    public asset(String id, int version, Object createdOn, String name, boolean accessPublicRead, String parentId, String realm, String type, ArrayList<String> path, Attributes attributes) {
        this.id = id;
        this.version = version;
        this.createdOn = createdOn;
        this.name = name;
        this.accessPublicRead = accessPublicRead;
        this.parentId = parentId;
        this.realm = realm;
        this.type = type;
        this.path = path;
        this.attributes = attributes;
    }


}

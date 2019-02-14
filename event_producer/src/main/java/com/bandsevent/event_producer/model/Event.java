package com.bandsevent.event_producer.model;

import com.google.gson.Gson;

public class Event {

    private Integer id;
    private String name;
    private String venue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

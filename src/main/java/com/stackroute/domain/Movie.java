package com.stackroute.domain;

public class Movie{
    private int id;
    private String mname;
    private Actor actor;

    public Movie(int id, String mname, Actor actor) {
        this.id = id;
        this.mname = mname;
        this.actor = actor;
    }

    public Movie() {

    }

    public Actor getActor() {
        return actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMName() {
        return mname;
    }

    public void setMName(String name)
    {
        this.mname = name;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}

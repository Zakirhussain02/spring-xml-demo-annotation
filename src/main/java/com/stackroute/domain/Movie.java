package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    public Actor getActor() {
        return actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    private Actor actor;
}

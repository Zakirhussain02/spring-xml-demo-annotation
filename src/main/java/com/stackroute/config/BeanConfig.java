package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    //actorOne
    @Bean(name = "actor")
    public Actor getActorBeanOne(){
        Actor actor = new Actor("mahesh","male",37);
        return actor;
    }

    @Bean(name = "movie")
        public Movie getMovieBeanOne(){
            return new Movie(getActorBeanOne());
        }
//actorTwo
    @Bean(name = "actors")
    public Actor getActorBeanTwo(){
        Actor actor = new Actor("mahesha","male",22);
        return actor;
    }

    @Bean(name = "movies")
    public Movie getMovieBeanTwo(){
        return new Movie(getActorBeanTwo());
    }

    //actorThree
    @Bean(name = "actorss")
    public Actor getActorBeanThree(){
        Actor actor = new Actor("mahesha","male",22);
        return actor;
    }

    @Bean(name = "moviess")
    public Movie getMovieBeanThree(){
        return new Movie(getActorBeanThree());
    }

    }


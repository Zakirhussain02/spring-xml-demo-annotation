package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    //actorOne
    //@Bean(name = "actorOne")
    public Actor getActorBeanOne(){
        Actor actor = new Actor("mahesh","male",37);
        return actor;
    }

    @Bean(name = "movieOne")
        public Movie getMovieBeanOne(){
            return new Movie(getActorBeanOne());
        }
    //actorTwo
    //@Bean(name = "actorTwo")
    public Actor getActorBeanTwo(){
        Actor actor = new Actor("mahesha","male",22);
        return actor;
    }

    @Bean(name = "movieTwo")
    public Movie getMovieBeanTwo(){
        return new Movie(getActorBeanTwo());
    }

    //actorThree
    @Bean(name = "actorThree")
    public Actor getActorBeanThree(){
        Actor actor = new Actor("mahesha","male",22);
        return actor;
    }

    @Bean(name = "movieThree")
    public Movie getMovieBeanThree(){
        return new Movie(getActorBeanThree());
    }

    @Bean(name = "actorz")
    public Actor getActorBeanActorz(){
        Actor actor= new Actor();
        actor.setName("Uday");
        actor.setGender("male");
        actor.setAge(22);
        return actor;
    }
    @Bean(name = "moviez")
    public Movie getMovieBeanMoviez(){
        return new Movie(getActorBeanActorz());
    }

    }


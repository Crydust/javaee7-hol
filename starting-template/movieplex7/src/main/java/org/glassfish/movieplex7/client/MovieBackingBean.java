package org.glassfish.movieplex7.client;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author kristof
 */
@Named
@SessionScoped
public class MovieBackingBean implements Serializable{

    int movieId;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    
    
}

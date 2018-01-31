package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 * Interface for getting messages and dates of tweets
 *
 */

public interface Tweetable {
    public String getMessage();
    public Date getDate();
}

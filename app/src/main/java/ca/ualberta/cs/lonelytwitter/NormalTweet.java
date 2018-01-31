package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 * Represents a normal tweet object
 *
 * @author afilbert
 * @version 1.0
 * @see Tweet
 */

public class NormalTweet extends Tweet {
    /**
     * Constructs a normal tweet object
     *
     * @param message the message of the important tweet
     */

    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a normal tweet object
     *
     * @param message the message of the normal tweet
     * @param date the current date
     */

    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Determine if the tweet is important
     *
     * @return false
     */

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

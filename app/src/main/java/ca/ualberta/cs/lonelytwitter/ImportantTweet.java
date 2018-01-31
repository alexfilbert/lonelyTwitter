package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 * Represents an important tweet
 *
 * @author afilbert
 * @version 1.0
 * @see Tweet
 */

public class ImportantTweet extends Tweet {
    /**
     * Constructs an important tweet object
     *
     * @param message the message of the important tweet
     */

    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an important tweet object
     *
     * @param message the message of the important tweet
     * @param date the current date
     */

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Determine if the tweet is important
     *
     * @return true
     */

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}

/*
 * Tweet
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet
 *
 * @author afilbert
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     */

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet exception is over 140 characters
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Retrieve date
     *
     * @return date get the date
     */

    public Date getDate(){
        return date;
    }

    /**
     * Set the date
     *
     * @param date set the date
     */

    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Check if important
     *
     * @return true or false depending on importance
     */

    public abstract Boolean isImportant();

    /**
     * Combine message with date into a string
     *
     * @return message string
     */

    public String toString() {
        return date.toString() + " | " + message;
    }

}

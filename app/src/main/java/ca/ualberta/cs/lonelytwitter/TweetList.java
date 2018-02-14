package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

import static junit.framework.Assert.assertFalse;

/**
 * Created by afilbert on 2/13/18.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){

        tweets.add(tweet);

    }

    public boolean hasTweet(Tweet tweet){

        for (int i = 0; i < tweets.size(); i++){
            if (tweets.get(i).getDate().equals(tweet.getDate()) && tweets.get(i).getMessage().equals(tweet.getMessage())){
                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }

    public Tweet getTweet(int index){

        return tweets.get(index);
    }

    public void delete(Tweet tweet){

        tweets.remove(tweet);
    }

    public void addTweet(Tweet tweet){
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException("Attempting to add duplicate tweet.");
        } else {
            tweets.add(tweet);
        }
    }

    public ArrayList getTweets(){
        ArrayList<Tweet> sortedTweets = new ArrayList<Tweet>();
        ArrayList<Tweet> tweetListCopy = tweets;
        int tempIndex = 0;


        while (tweetListCopy.size() != 0){
            Tweet tempTweet = tweetListCopy.get(0);
            for (int i = 0; i < tweetListCopy.size(); i+= 1){
                tempTweet = tweetListCopy.get(i);
                if (tweetListCopy.get(i).getDate().before(tempTweet.getDate())){
                     tempIndex = i;
                }
            }
            sortedTweets.add(tweetListCopy.get(tempIndex));
            tweetListCopy.remove(tempIndex);
        }

        return sortedTweets;
    }


    public int getCount(){
        return tweets.size();
    }

}

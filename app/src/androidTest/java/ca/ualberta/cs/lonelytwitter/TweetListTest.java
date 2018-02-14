package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.text.Normalizer;
import java.util.ArrayList;

/**
 * Created by afilbert on 2/13/18.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }

    public void testGetTweet(){

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());

    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }


    public void testGetTweets(){
        // should return a list of tweets in chronological order

        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("hello1");
        Tweet tweet2 = new NormalTweet("hello2");

        tweets.add(tweet2);
        tweets.add(tweet1);
        System.out.println(tweets.getTweets().get(0));
        assertTrue(tweets.getTweets().get(0) == tweet1);

    }


    public void testGetCount(){
        // should accurately count up the tweets

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        tweets.add(tweet);
        assertTrue(tweets.getCount() == 1);
    }

}

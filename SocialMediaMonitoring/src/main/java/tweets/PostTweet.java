package tweets;

import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class PostTweet
{
	public void postTweet(long tweetid, String name, String result) throws TwitterException
	{
		    ConfigurationBuilder cb = new ConfigurationBuilder();
		    cb.setDebugEnabled(true)
		    .setOAuthConsumerKey("w")
		    .setOAuthConsumerSecret("KOz")
		    .setOAuthAccessToken("7u")
		    .setOAuthAccessTokenSecret("k");
		    Twitter twitter = new TwitterFactory(cb.build()).getInstance();
		    if(result.equals("Negative"))
		    {
		    String text = "@" + name + " Thank you for your feedback. We always working to improve our services. It will be resolved in 2 to three Business days";
		    StatusUpdate stat= new StatusUpdate(text);
            stat.setInReplyToStatusId(tweetid);
		    twitter.updateStatus(stat);
		    }
	}

}

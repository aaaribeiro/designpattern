package observer;

import java.util.ArrayList;

public class Post {

    private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
    private String latestPost;

    public void addSubscriber(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }

    public ArrayList<Subscriber> getSubscribers(){
        return this.subscribers;
    }

    public void addPost(String post){
        this.latestPost = post;
    }

    public String getPost(){
        return "got a post: " + this.latestPost;
    }

    public void notifySubscribers(){
        for(Subscriber subscriber: subscribers){
            subscriber.notifySubscriber();
        }
    }
}

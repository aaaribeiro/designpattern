package observer;

public class FriendOne implements Subscriber{
    
    Post post;

    FriendOne(Post post){
        this.post = post;
        this.post.addSubscriber(this);
    }

    @Override
    public void notifySubscriber(){
        System.out.println("Friend One " + this.post.getPost());
    }

}

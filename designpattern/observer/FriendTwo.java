package observer;

public class FriendTwo implements Subscriber{
    
    Post post;

    FriendTwo(Post post){
        this.post = post;
        this.post.addSubscriber(this);
    }

    @Override
    public void notifySubscriber(){
        System.out.println("Friend Two " + this.post.getPost());
    }

}

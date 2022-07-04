package observer;

public class PostTester {

    public static void main(String[] args) {
        Post post = new Post();
        
        new FriendOne(post);
        post.addPost("hello world");
        post.notifySubscribers();
        System.out.println(post.getSubscribers());

        new FriendTwo(post);
        post.addPost("bye bye world");
        post.notifySubscribers();
        System.out.println(post.getSubscribers());


    }
    
}

package decorator;

public class PhotoTagTester {

    public static void main(String[] args) {

        PhotoTag photoOne = new Photo("vacation", "me");
        photoOne = new ExtraTags(photoOne, "europe", "my girlfriend");
        System.out.println("Some tags and people marked in photoOne");
        System.out.println(photoOne.getTag());
        System.out.println(photoOne.getPerson());
        System.out.println();
        
        System.out.println("Some tags and people marked in photoTwo");
        PhotoTag photoTwo = new Photo("family", "me");
        photoTwo = new ExtraTags(photoTwo, "grandmother's house", "my grandmother");
        photoTwo = new ExtraTags(photoTwo, "birthday", "my brother");
        System.out.println(photoTwo.getTag());
        System.out.println(photoTwo.getPerson());
    }
    
}

package factory;
import java.util.ArrayList;

public class ProfileTester {
    
    static Profile linkedin = new LinkedIn();
    static Profile facebook = new Facebook();
    static ArrayList<Section> linkedinSections = new ArrayList<Section>();
    static ArrayList<Section> facebookSections = new ArrayList<Section>();

    public static void main(String[] args) {
        linkedinSections = linkedin.getSections();
        System.out.println(linkedinSections);
        facebookSections = facebook.getSections();
        System.out.println(facebookSections);
    }
    
}

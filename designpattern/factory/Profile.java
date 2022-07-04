package factory;
import java.util.ArrayList;

public abstract class Profile {

    ArrayList<Section> sections = new ArrayList<Section>();

    public abstract void createProfile();

    public ArrayList<Section> getSections(){
        return this.sections;
    }

    public void addSection(Section section){
        this.sections.add(section);
    }

}

package factory;
public class Facebook extends Profile{

    Facebook(){
        createProfile();
    }
    
    public void createProfile(){
        this.addSection(new PersonalSection());
        this.addSection(new AlbumSection());
    }
}

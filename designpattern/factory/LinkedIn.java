package factory;
public class LinkedIn extends Profile{
    
    LinkedIn(){
        createProfile();
    } 

    public void createProfile(){
        this.addSection(new PersonalSection());
        this.addSection(new PatentSection());
        this.addSection(new PublicationSection());

    }
}

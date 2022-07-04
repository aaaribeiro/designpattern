package state;

public class State implements ProfileType {
    
    ProfileType profileType;
    
    State(){
        this.profileType = new OpenToWork(); //default state
    }

    public ProfileType getState(){
        return this.profileType;
    }

    public void setState(ProfileType newProfileType){
        this.profileType = newProfileType;
    }

    public void printProfileBehavior(){
        this.profileType.printProfileBehavior();
    }
}

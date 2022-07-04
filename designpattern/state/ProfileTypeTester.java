package state;

public class ProfileTypeTester {
    
    public static void main(String[] args) {
        
        State profileType = new State();
        OpenToWork openToWork = new OpenToWork();
        OnVacation onVacation = new OnVacation();
        Hiring hiring = new Hiring();

        profileType.printProfileBehavior();
        profileType.setState(onVacation);
        profileType.printProfileBehavior();
        profileType.setState(hiring);
        profileType.printProfileBehavior();
        profileType.setState(openToWork);
        profileType.printProfileBehavior();
    }
}

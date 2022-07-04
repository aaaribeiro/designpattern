package decorator;

public class Photo implements PhotoTag {
    private String tag;
    private String person;

    public Photo(String tag, String person){
        this.tag = tag;
        this.person = person;
    }

    public String getTag(){
        return this.tag;
    }

    public String getPerson(){
        return this.person;
    }
}

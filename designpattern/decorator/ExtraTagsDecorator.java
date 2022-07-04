package decorator;

public abstract class ExtraTagsDecorator implements PhotoTag {
    
    protected PhotoTag photoTag;
    protected String tag;
    protected String person; 

    public ExtraTagsDecorator(PhotoTag photoTag, String tag, String person){
        this.photoTag = photoTag;
        this.tag = tag;
        this.person = person;
    }

    public abstract String getTag();
    public abstract String getPerson();
    
}

package decorator;

public class ExtraTags extends ExtraTagsDecorator{

    public ExtraTags(PhotoTag photoTag, String tag, String person){
        super(photoTag, tag, person);
    }
    
    public String getTag(){
        return this.tag + ", " + photoTag.getTag();
    }

    public String getPerson(){
        return this.person + ", " + photoTag.getPerson();
    }
}

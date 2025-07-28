package LibraryManagemnt;

public class Magazine extends LibraryItem {
    private int issueNumber;

    Magazine(String title, String id, int issueNumber){
        super(title, id);
        this.issueNumber = issueNumber;
    }

    public String getItemType(){
        return "Magazine";
    }
    public String toString(){
        return super.toString()+" by "+issueNumber;
    }
}

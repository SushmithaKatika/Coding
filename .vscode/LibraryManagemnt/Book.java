package LibraryManagemnt;

public class Book extends LibraryItem {
    private String author;
    public Book(String id,String title, String author){
        super(title,id);
        this.author = author;
    }
    public String getItemType(){
        return "Book";
    }
    public String getAuthor(String author){
        return author;
    }
    
    public String toString(){
        return super.toString()+" by "+author;
    }
}

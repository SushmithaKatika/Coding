package LibraryManagemnt;

import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<LibraryItem> items = new ArrayList<>();

        public void addItem(LibraryItem item){
            items.add(item);
        }
        public void showItem(){
            for (LibraryItem libraryItem : items) {
                System.out.println(libraryItem.getItemType()+ "..."+libraryItem.toString());
            }
        }
    public static void main(String args[]){
    Library library = new Library();
    
    Book book = new Book("1", "hero", "jamson");
        library.addItem(book);
    Magazine magazine = new Magazine("times now", "23", 2456);
       library.addItem(magazine);
       library.showItem();
    }
    
}

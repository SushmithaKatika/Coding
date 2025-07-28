package LibraryManagemnt;

abstract class LibraryItem {
    private String title;
    private String id;
public LibraryItem(String title,String id){
    this.title = title;
    this.id = id;
}

public String getTitle(){
    return title;
}
public String getId(){
    return id;
}
public abstract String getItemType();

public String toString(){
    return id + "-"+ title;
}
}

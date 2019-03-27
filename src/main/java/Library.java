import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> collection;
    private int capacity;


    public Library(String name, int capacity){
        this.name = name;
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBookIfUnderCapacity(Book book){
        if(this.underCapacity()) {
            this.collection.add(book);
        }
    }

    public int countBooks(){
        return this.collection.size();
    }

    public boolean underCapacity(){
        if(countBooks()<=this.capacity){
            return true;
        }
        return false;
    }
}

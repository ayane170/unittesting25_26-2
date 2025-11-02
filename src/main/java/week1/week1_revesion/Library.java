package week1.week1_revesion;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<String> books = new ArrayList<>();

    void addBook(String title){
        books.add(title);
    }
    boolean hasBook(String title){
      return books.contains(title);
    }
    int getBookCount(){
        return books.size();
    }

}

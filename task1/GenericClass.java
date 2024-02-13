package Lesson6.Hometask.task1;

import java.util.ArrayList;
import java.util.List;

public class GenericClass <T extends Human >{
    private List<T> items;
    public GenericClass(){
        items = new ArrayList<>();
    }
    public void add(T item){
        items.add(item);
    }
    public void remove(int id){
        items.removeIf(item -> item.getId() == id);
    }
    public T searchFor(int id){
        for(T item: items){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public void displayItems(){
        for(T item: items){
            System.out.println(item);
        }
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class VoidMethodClass {

    private final List<String> people = new ArrayList<>();

    public void add(String name){
        people.add(name);
    }

    public void remove(String name){
        if(!people.contains(name))
            throw new NoSuchElementException();
        people.remove(name);
    }

    public  int size(){
        return people.size();
    }

    public void removeAll(){
        people.clear();
    }
}

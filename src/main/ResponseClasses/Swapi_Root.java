import java.util.List;

public class Swapi_Root {
    public int count;
    public String next;
    public List<Swapi_Results> results;
    public Object previous;

    public Object getPrevious(){
        return previous;
    }
    public int getCount(){
        return count;
    }

    public String getNext(){
        return next;
    }

    public List<Swapi_Results> getResults(){
        return results;
    }
}

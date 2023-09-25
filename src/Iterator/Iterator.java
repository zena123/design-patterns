package Iterator;

//
public interface Iterator{  
    boolean hasNext();
    String current(); 
    void next();
}

/* 

notice we want general uses interface , dealing with different types of current info 

public interface Iterator <T>{
    T current(); 

}

then when we implement this interface:

 * implements Iterator<String>
 * implements Iterator<User>
 */

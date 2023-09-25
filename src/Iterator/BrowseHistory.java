package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();


    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var last_index = urls.size() - 1;
        var last_item = urls.get(last_index);
        urls.remove(last_item);
        return last_item;

    }
    public Iterator createIterator(){
        return new ListIterator(this);
    }

    // this class able to see the private members of HistoryBrowser
    public class ListIterator implements Iterator {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public String current() {
            // TODO Auto-generated method stub
            return history.urls.get(index);
        }

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return (index < history.urls.size());
        }

        @Override
        public void next() {
            index ++;
            
        }}
}

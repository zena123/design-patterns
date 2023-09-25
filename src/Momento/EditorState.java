package Momento;

public class EditorState {
    // final so once we initialize it we make sure it won't change 
    private final String content;

    public String getContent() {
        return this.content;
    }

    public EditorState(String content) {
        this.content = content;
    }
    
}

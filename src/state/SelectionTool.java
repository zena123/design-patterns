package state;

public class SelectionTool implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("this Selection tool");
    }

    @Override
    public void mouseDown() {
        System.out.println("draw a rectangle");
    }
    
}

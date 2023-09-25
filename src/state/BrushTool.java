package state;

public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("this Brush tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("draw a circle");
        
    }
    
}

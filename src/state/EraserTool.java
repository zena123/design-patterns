package state;

public class EraserTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("this Eraser tool");
        
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
        
    }
    
}

package command.fx;

public class Button {
    private String label;
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    private Command command;
    public Button(Command command) {
        this.command = command;
    }
    
    public void click(){
        command.excecute();
    }
}

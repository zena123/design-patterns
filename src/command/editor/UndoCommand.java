package command.editor;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void Execute() {
        // TODO Auto-generated method stub
        if (history.size() >1){
            history.pop().unexecute();
        }
        
    }
    
}

package command.editor;

public interface UndoableCommand extends Command{
    public void unexecute();
}

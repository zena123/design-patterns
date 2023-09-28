package command.editor;

public class BoldCommand implements UndoableCommand{
    private String  prevCommand;
    private History history;
    private HtmlDocumnet htmlDocumnet;

    public BoldCommand(History history, HtmlDocumnet htmlDocumnet) {
        this.history = history;
        this.htmlDocumnet = htmlDocumnet;
    }

    @Override
    public void unexecute() {
        // TODO Auto-generated method stub
        htmlDocumnet.setContent(prevCommand);
        
    }

    @Override
    public void Execute() {
        // TODO Auto-generated method stub
        htmlDocumnet.getContent();
        history.push(this);
        htmlDocumnet.makeBold();
        
    }
    
}

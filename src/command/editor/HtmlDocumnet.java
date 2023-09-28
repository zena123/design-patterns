package command.editor;

public class HtmlDocumnet {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void makeBold(){
        content = "<br>" + content + "</br>";
    }
}

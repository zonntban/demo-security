package hello.model;

public class ChatMessage {
    
    private MessageType type;
    private String content;
    private String sender;
 
    public enum MessageType {
    	//for chat
        CHAT, JOIN, LEAVE, 
        //for game
        PLAY, START, CHOOSE, DONE_HINT,
        SHOW_ONLY, SHOW_CHOOSE,
        SHOW_RESULT, GAME_OVER, RESET_GAME
        //for viewer
        ,VIEWER_START
        
    }
 
    public MessageType getType() {
        return type;
    }
 
    public void setType(MessageType type) {
        this.type = type;
    }
 
    public String getContent() {
        return content;
    }
 
    public void setContent(String content) {
        this.content = content;
    }
 
    public String getSender() {
        return sender;
    }
 
    public void setSender(String sender) {
        this.sender = sender;
    }
     
}
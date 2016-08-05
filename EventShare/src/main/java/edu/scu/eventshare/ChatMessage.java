package edu.scu.eventshare;


public class ChatMessage {
    public boolean left;
    public String message;

    public ChatMessage(boolean left, String message) {
        this.left = left;
        this.message = message;
    }
    public String getMessage(){
        return  this.message;
    }

}

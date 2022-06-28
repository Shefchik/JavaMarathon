package day13;

import java.util.Date;

public class Message {
    private final String  sender;
    private final String receiver;
    private final String text;
    private final Date sendDate;

    @Override
    public String toString(){
        return "FROM: " + sender + "\n" +
                "TO: "  + receiver + "\n" +
                "ON: "  + sendDate + "\n" + text;
    }

    public Message(String sender, String receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        sendDate = new Date();
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getSendDate() {
        return sendDate;
    }
}

package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1.getUsername(), u2.getUsername(), text));
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        String dialogString;
        for(Message item : messages){
            dialogString = "";
            if(item.getSender().equals(u1.getUsername())
                                && item.getReceiver().equals(u2.getUsername())){

                dialogString = u1.getUsername().concat(": ") + item.getText();

            }else if(item.getSender().equals(u2.getUsername())
                                && item.getReceiver().equals(u1.getUsername())){

                dialogString = u2.getUsername().concat(": ") + item.getText();
            }

            if(!dialogString.isEmpty()){
                System.out.println(dialogString);
            }
        }
    }
}

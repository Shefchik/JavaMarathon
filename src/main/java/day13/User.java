package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    List<User> subscriptions;

    public User(String username){
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return subscriptions.contains(user) && user.getSubscriptions().contains(this);
    }

    public void sendMessage(User user, String text){
        //!!!!Use MessageDatabase method
    }

    @Override
    public String toString(){
        return username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}

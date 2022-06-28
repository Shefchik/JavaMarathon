package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("stefa");
        User user2 = new User("trooper");
        User user3 = new User("admin");

        user1.subscribe(user2);
        user2.subscribe(user1);
        user3.subscribe(user1);
        user3.subscribe(user2);
        String friendsString = user1.getUsername() + " and " + user2.getUsername() + " are";
        if (!user1.isFriend(user2)){
            friendsString += " not";
        }
        friendsString += " friends!";
        System.out.println(friendsString);

        MessageDatabase.addNewMessage(user1, user2, "Привет, " +  user2.getUsername() + "!");
        MessageDatabase.addNewMessage(user1, user2, "Как дела у тебя " + user2.getUsername() + "?");
        MessageDatabase.addNewMessage(user2, user1, "Привет, " + user1.getUsername() + "!");
        MessageDatabase.addNewMessage(user2, user1, "Все хорошо, у тебя как дела " + user1.getUsername() + "?");
        MessageDatabase.addNewMessage(user2, user1, user1.getUsername() + ", ты в городе?");
        MessageDatabase.addNewMessage(user3, user1, "Привет, " + user1.getUsername() + "!");
        MessageDatabase.addNewMessage(user3, user1, user1.getUsername() + ", когда мы встеримся?");
        MessageDatabase.addNewMessage(user3, user1, user1.getUsername() + ", сегодня можешь?");
        MessageDatabase.addNewMessage(user1, user3, "Конечно, могу, " + user3.getUsername());
        MessageDatabase.addNewMessage(user1, user3, user3.getUsername() + ", давай встеримся в 19-00?");
        MessageDatabase.addNewMessage(user1, user3, user3.getUsername() + ", или ты не можешь?");
        MessageDatabase.addNewMessage(user3, user1, "Могу, " + user1.getUsername());
        MessageDatabase.addNewMessage(user3, user1, user1.getUsername() + ", встречаемся возле памятника!?");
        MessageDatabase.addNewMessage(user3, user1, user1.getUsername() + ", до встречи!");

        MessageDatabase.showDialog(user1, user3);


    }
}

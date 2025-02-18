
package chatApp;


public class ChatApp {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("John");
        User user2 = new User("Jane");

        chatServer.addUser(user1);
        chatServer.addUser(user2);

        chatServer.createChatRoom("General");
        chatServer.createChatRoom("Private");

        chatServer.startChat();
        
        chatServer.shareScreen(user1);
        
        // Send a private message from John to Jane
        chatServer.sendPrivateMessage("Hello, Jane!", user1, user2);
        
        // Share a file from John to Jane
        chatServer.shareFile("example.txt", user1, user2);
        
        // Start an audio conference between John and Jane
        chatServer.startAudioConference(user1);




    }

}

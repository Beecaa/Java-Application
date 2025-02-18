
package chatApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;







public class ChatServer {
    private List<User> users;
    private Map<String, ChatRoom> chatRooms;
    private Scanner scanner;
    private ServerSocket serverSocket;

    public ChatServer(int port) throws Exception {
        serverSocket = new ServerSocket(port);
    }

    public void start() throws Exception {
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            String message = reader.readLine();
            System.out.println("Received message: " + message);

            // Process the message and send a response
            String response = "Hello, client!";
            writer.println(response);
        }
    }

    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer(8000);
        server.start();
    }

    public ChatServer() {
        this.users = new ArrayList<>();
        this.chatRooms = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void createChatRoom(String roomName) {
        chatRooms.put(roomName, new ChatRoom(roomName));
    }

    public void joinChatRoom(User user, String roomName) {
        ChatRoom chatRoom = chatRooms.get(roomName);
        if (chatRoom != null) {
            chatRoom.addUser(user);
        }
    }

    public void leaveChatRoom(User user, String roomName) {
        ChatRoom chatRoom = chatRooms.get(roomName);
        if (chatRoom != null) {
            chatRoom.removeUser(user);
        }
    }

    public void sendMessage(String message, User sender, String roomName) {
        ChatRoom chatRoom = chatRooms.get(roomName);
        if (chatRoom != null) {
            chatRoom.sendMessage(message, sender);
        }
    }
       
    public void sendPrivateMessage(String message, User sender, User recipient) {
        System.out.println(sender.getUsername() + " (private): " + message);
        // Send the message to the recipient's console
        // (Note: This is a simplified implementation and may not work in a real-world scenario)
        System.out.println("Private message from " + sender.getUsername() + ": " + message);
    }

    public void shareFile(String fileName, User sender, User recipient) {
        try {
            // Create a server socket to transfer the file
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();

            // Send the file to the recipient
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream("received_" + fileName);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            fileInputStream.close();
            fileOutputStream.close();
            socket.close();
            serverSocket.close();

            System.out.println("File shared successfully!");
        } catch (IOException e) {
            System.out.println("Error sharing file: " + e.getMessage());
        }
    }
    public void shareScreen(User user) {
        try {
            // Create a robot to capture the screen
            Robot robot = new Robot();

            // Create a datagram socket to send the screen captures
            DatagramSocket socket = new DatagramSocket();

            // Get the screen size
            Rectangle screenSize = new Rectangle(0, 0, 1920, 1080);

            // Capture and send the screen every 100ms
            while (true) {
                // Capture the screen
                BufferedImage screenshot = robot.createScreenCapture(screenSize);

                // Convert the screenshot to a byte array
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ImageIO.write(screenshot, "png", bos);
                byte[] bytes = bos.toByteArray();

                // Send the screenshot over the network
                DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 8080);
                socket.send(packet);

                // Wait 100ms before capturing the next screenshot
                Thread.sleep(100);
            }
        }
        catch (AWTException | SocketException | IOException | InterruptedException e) {
            System.out.println("Error sharing screen: " + e.getMessage());
        }
    }
    public void startAudioConference(User user) {
        try {
            // Create an audio format to capture audio
            AudioFormat audioFormat = new AudioFormat(8000.0f, 16, 1, true, false);

            // Create a target data line to capture audio
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, audioFormat);
            TargetDataLine targetDataLine = (TargetDataLine) AudioSystem.getLine(info);
            targetDataLine.open(audioFormat);
            targetDataLine.start();

            // Capture and play audio every 100ms
            byte[] buffer = new byte[1024];
            while (true) {
                // Capture audio
                int bytesRead = targetDataLine.read(buffer, 0, buffer.length);

                // Play audio
                SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem.getLine(info);
                sourceDataLine.open(audioFormat);
                sourceDataLine.start();
                sourceDataLine.write(buffer, 0, bytesRead);
                sourceDataLine.drain();
                sourceDataLine.close();

                // Wait 100ms before capturing the next audio frame
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println("Error starting audio conference: " + e.getMessage());
        }
    }

    public void startChat() {
        while (true) {
            System.out.println("Enter your username:");
            String username = scanner.nextLine();

            User user = getUserByUsername(username);
            if (user == null) {
                System.out.println("User not found. Please try again.");
                continue;
            }

            System.out.println("Welcome, " + username + "!");

            while (true) {
                System.out.println("Enter 'join' to join a chat room, 'leave' to leave a chat room, or 'quit' to exit:");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("quit")) {
                    break;
                } else if (input.equalsIgnoreCase("join")) {
                    System.out.println("Enter the name of the chat room to join:");
                    String roomName = scanner.nextLine();
                    joinChatRoom(user, roomName);
                } else if (input.equalsIgnoreCase("leave")) {
                    System.out.println("Enter the name of the chat room to leave:");
                    String roomName = scanner.nextLine();
                    leaveChatRoom(user, roomName);
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
    }

    private User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    
    

}

class ChatRoom {
    private String roomName;
    private List<User> users;

    public ChatRoom(String roomName) {
        this.roomName = roomName;
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void sendMessage(String message, User sender) {
        System.out.println(sender.getUsername() + " in " + roomName + ": " + message);
    }


}

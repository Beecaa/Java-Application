/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatApp;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatGUI extends Application {
    private TextArea chatArea;
    private TextField messageField;
    private Button sendButton;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create the chat area
        chatArea = new TextArea();
        chatArea.setEditable(false);
        chatArea.setPrefRowCount(20);
        chatArea.setPrefColumnCount(40);

        // Create the message field
        messageField = new TextField();
        messageField.setPrefColumnCount(40);

        // Create the send button
        sendButton = new Button("Send");
        sendButton.setOnAction(event -> {
            // Send the message
            String message = messageField.getText();
            if (!message.isEmpty()) {
                try {
                    writer.println(message);
                    messageField.clear();
                } catch (Exception e) {
                    System.out.println("Error sending message: " + e.getMessage());
                }
            }
        });

        // Create the GUI layout
        HBox messageBox = new HBox(10);
        messageBox.getChildren().addAll(messageField, sendButton);
        messageBox.setAlignment(Pos.CENTER);

        VBox mainBox = new VBox(10);
        mainBox.getChildren().addAll(chatArea, messageBox);
        mainBox.setPadding(new Insets(10));
        mainBox.setAlignment(Pos.CENTER);

        // Create the scene
        Scene scene = new Scene(mainBox, 400, 600);

        // Set up the stage
        primaryStage.setTitle("Chat Application");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Connect to the chat server
        socket = new Socket("localhost", 8000);
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream(), true);

        // Receive messages from the server
        Thread receiverThread = new Thread(() -> {
            try {
                while (true) {
                    String message = reader.readLine();
                    chatArea.appendText("Server: " + message + "\n");
                }
            } catch (Exception e) {
                System.out.println("Error receiving message: " + e.getMessage());
            }
        });
        receiverThread.start();
    }

    public static void main(String[] args) {
        launch(args);
    }

}



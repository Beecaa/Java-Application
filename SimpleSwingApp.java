import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Set background color of the frame
        frame.getContentPane().setBackground(new Color(240, 240, 240)); // Light gray background

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(255, 255, 255)); // White background for the panel
        frame.add(panel);

        // Create a text field
        JTextField textField = new JTextField(20);
        textField.setMaximumSize(new Dimension(200, 30));
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);
        textField.setToolTipText("Enter some text here");
        panel.add(textField);

        // Create a button
        JButton button = new JButton("Show Message");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setToolTipText("Click to display your input");
        panel.add(button);

        // Add mouse hover effect
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                button.setBackground(Color.CYAN); // Change background color on hover
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                button.setBackground(UIManager.getColor("control")); // Reset to default
            }
        });

        // Create a combo box with icons
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        comboBox.setToolTipText("Choose an option from the list");
        panel.add(comboBox);

        // Create a checkbox with a custom font
        JCheckBox checkBox = new JCheckBox("Check me!");
        checkBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        checkBox.setFont(new Font("Arial", Font.PLAIN, 14));
        checkBox.setToolTipText("Check this box if applicable");
        panel.add(checkBox);

        // Create a progress bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.setPreferredSize(new Dimension(300, 25));
        panel.add(progressBar);

        // Add action listener to the button
        button.addActionListener((ActionEvent e) -> {
            String text = textField.getText();
            String selectedOption = (String) comboBox.getSelectedItem();
            boolean isChecked = checkBox.isSelected();

            String message = "You entered: " + text + "\nSelected: " + selectedOption + "\nChecked: " + (isChecked ? "Yes" : "No");
            JOptionPane.showMessageDialog(frame, message, "User Input", JOptionPane.INFORMATION_MESSAGE);
        });

        // Add action listener to the button (for progress bar)
        button.addActionListener((ActionEvent e) -> {
            new Thread(() -> {
                // Simulate a task with a progress bar
                for (int i = 0; i <= 100; i++) {
                    progressBar.setValue(i);
                    try {
                        Thread.sleep(50); // Simulate work
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }

                // Show message with user input
                String text = textField.getText();
                String selectedOption = (String) comboBox.getSelectedItem();
                boolean isChecked = checkBox.isSelected();

                String message = "You entered: " + text + "\nSelected: " + selectedOption + "\nChecked: " + (isChecked ? "Yes" : "No");
                JOptionPane.showMessageDialog(frame, message, "User Input", JOptionPane.INFORMATION_MESSAGE);
            }).start();
        });

       

        // Create a clear button to reset inputs
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> {
            textField.setText("");
            comboBox.setSelectedIndex(0);
            checkBox.setSelected(false);
            progressBar.setValue(0);
        });

        // Add panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
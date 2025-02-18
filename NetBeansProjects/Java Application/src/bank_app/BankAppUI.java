
package bank_app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAppUI {
    private JFrame frame;
    private JTextField phoneNumberField;
    private JPasswordField passwordField;
    private JTextField recipientAccountNumberField;
    private JTextField amountField;
    private JTextField airtimeDataPhoneNumberField;
    private JComboBox<String> networkComboBox;
    private JTextField airtimeDataAmountField;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    
    public BankAppUI() {
        createUI();
    }

    private void createUI() {
        frame = new JFrame("Banking App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.decode("#F7F7F7")); // Set background color
        frame.setSize(800, 600); // Set frame size

        // Main panel to hold different sections (Login, Dashboard, Airtime, Data)
        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        // Login Panel
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 2));
        loginPanel.setBackground(Color.decode("#F7F7F7")); // Set panel background color

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set font size and style
        loginPanel.add(phoneNumberLabel);
        phoneNumberField = new JTextField();
        phoneNumberField.setFont(new Font("Arial", Font.PLAIN, 16)); // Set font size and style
        phoneNumberField.setPreferredSize(new Dimension(200, 30)); // Set text field size
        loginPanel.add(phoneNumberField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set font size and style
        loginPanel.add(passwordLabel);
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16)); // Set font size and style
        passwordField.setPreferredSize(new Dimension(200, 30)); // Set password field size
        loginPanel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 16)); // Set font size and style
        loginButton.setPreferredSize(new Dimension(100, 30)); // Set button size
        loginButton.addActionListener(new LoginButtonListener());
        loginPanel.add(loginButton);

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 16)); // Set font size and style
        signUpButton.setPreferredSize(new Dimension(100, 30)); // Set button size
        signUpButton.addActionListener(new SignUpButtonListener());
        loginPanel.add(signUpButton);

        // Add panels to the main panel
        mainPanel.add(loginPanel, "Login");

        // Create and add the dashboard panel (for after login)
        JPanel dashboardPanel = new JPanel();
        dashboardPanel.add(new JLabel("Dashboard"));
        JButton transferButton = new JButton("Transfer");
        transferButton.addActionListener(new TransferButtonListener());
        dashboardPanel.add(transferButton);
        JButton airtimeDataButton = new JButton("Airtime/Data");
        airtimeDataButton.addActionListener(new AirtimeDataButtonListener());
        dashboardPanel.add(airtimeDataButton);
        JButton checkBalanceButton = new JButton("Check Balance");
        checkBalanceButton.addActionListener(new CheckBalanceButtonListener());
        dashboardPanel.add(checkBalanceButton);
        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new LogoutButtonListener());
        dashboardPanel.add(logoutButton);

        mainPanel.add(dashboardPanel, "Dashboard");

        // Airtime Panel
        JPanel airtimePanel = new JPanel();
        airtimePanel.setLayout(new GridLayout(3, 2));

        JLabel airtimePhoneLabel = new JLabel("Phone Number:");
        airtimePanel.add(airtimePhoneLabel);
        airtimeDataPhoneNumberField = new JTextField();
        airtimePanel.add(airtimeDataPhoneNumberField);

        JLabel networkLabel = new JLabel("Network:");
        airtimePanel.add(networkLabel);
        networkComboBox = new JComboBox<>(new String[]{"MTN", "GLO", "Airtel"});
        airtimePanel.add(networkComboBox);

        JLabel amountLabel = new JLabel("Amount:");
        airtimePanel.add(amountLabel);
        airtimeDataAmountField = new JTextField();
        airtimePanel.add(airtimeDataAmountField);

        JButton airtimeSubmitButton = new JButton("Submit Airtime");
        airtimePanel.add(airtimeSubmitButton);
        airtimeSubmitButton.addActionListener(new AirtimeSubmitButtonListener());

        mainPanel.add(airtimePanel, "Airtime");

        // Data Panel
        JPanel dataPanel = new JPanel();
        dataPanel.setLayout(new GridLayout(4, 2));

        JLabel dataPhoneLabel = new JLabel("Phone Number:");
        dataPanel.add(dataPhoneLabel);
        airtimeDataPhoneNumberField = new JTextField();
        dataPanel.add(airtimeDataPhoneNumberField);

        JLabel dataNetworkLabel = new JLabel("Network:");
        dataPanel.add(dataNetworkLabel);
        networkComboBox = new JComboBox<>(new String[]{"MTN", "GLO", "Airtel"});
        dataPanel.add(networkComboBox);

        JLabel dataPlanLabel = new JLabel("Data Plan:");
        dataPanel.add(dataPlanLabel);
        JComboBox<String> dataPlanComboBox = new JComboBox<>(new String[]{"1GB", "2GB", "5GB", "10GB"});
        dataPanel.add(dataPlanComboBox);

        JButton dataSubmitButton = new JButton("Submit Data Plan");
        dataPanel.add(dataSubmitButton);
        dataSubmitButton.addActionListener(new DataSubmitButtonListener());

        mainPanel.add(dataPanel, "Data");

        // Set the main panel as the content pane
        frame.add(mainPanel);

        // Set frame visibility
        frame.setVisible(true);
    }

    // Listener classes
    private class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // For now, let's assume the login is successful and proceed to the dashboard
            cardLayout.show(mainPanel, "Dashboard");
        }
    }

    private class AirtimeDataButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Toggle between Airtime and Data panels
            String currentCard = cardLayout.toString();
            if (currentCard.equals("Airtime")) {
                cardLayout.show(mainPanel, "Data");
            } else {
                cardLayout.show(mainPanel, "Airtime");
            }
        }
    }

    private class AirtimeSubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String phoneNumber = airtimeDataPhoneNumberField.getText();
            String network = (String) networkComboBox.getSelectedItem();
            String amount = airtimeDataAmountField.getText();
            JOptionPane.showMessageDialog(frame, "Airtime Purchase\nPhone: " + phoneNumber + "\nNetwork: " + network + "\nAmount: " + amount);
        }
    }

    private class DataSubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String phoneNumber = airtimeDataPhoneNumberField.getText();
            String network = (String) networkComboBox.getSelectedItem();
            JOptionPane.showMessageDialog(frame, "Data Plan Purchase\nPhone: " + phoneNumber + "\nNetwork: " + network);
        }
    }

    private class LogoutButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            cardLayout.show(mainPanel, "Login");
        }
    }
    private class SignUpButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Sign-Up button clicked! Implement sign-up functionality here.");
        }
    }
    private class CheckBalanceButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Check Balance button clicked! Implement balance check functionality here.");
        }
    }
    private class TransferButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Transfer button clicked! Implement transfer functionality here.");
        }
    }
    
}

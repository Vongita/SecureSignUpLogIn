//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public static class Secsignuplogin {
}

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 3));

        // Create labels and text fields
        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField();

        JButton loginButton = new JButton("LOGIN");
        JLabel successLabel = new JLabel("");

        // Add action listener to the button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // Simple validation
                if (username.equals("tanatswa") && password.equals("unicorns259")) {
                    JFrame newFrame = new JFrame("Welcome");
                    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newFrame.setSize(400, 200);
                    newFrame.setLayout(new FlowLayout());

                    // Create label for the new frame
                    JLabel welcomeLabel = new JLabel("VONGAYI TANATSWA KUNDISHORA       REG NUMBER        H230693F");
                    newFrame.add(welcomeLabel);

                    // Make the new frame visible
                    newFrame.setVisible(true);

                    // Dispose the old frame
                    frame.dispose();
                } else {
                    successLabel.setText("Invalid username or password, try again.");
                }
            }
        });

        // Add components to the frame
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passwordLabel);
        frame.add(passwordText);
        frame.add(loginButton);
        frame.add(successLabel);

        // Make the frame visible
        frame.setVisible(true);
    }


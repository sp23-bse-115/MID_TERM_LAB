
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp23-bse-115
 */
public class KidsMonitoringAppGUI1 {
     public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Kids Monitoring App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Panel for the header
        JPanel headerPanel = new JPanel();
        headerPanel.add(new JLabel("Kids Monitoring App: Kid Monitoring API"));
        frame.add(headerPanel, BorderLayout.NORTH);

        // Panel for the registration form
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Form fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel regNoLabel = new JLabel("Reg No:");
        JTextField regNoField = new JTextField();
        JLabel parentLabel = new JLabel("Parent's Email:");
        JTextField parentField = new JTextField();

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(regNoLabel);
        formPanel.add(regNoField);
        formPanel.add(parentLabel);
        formPanel.add(parentField);

        // Buttons
        JButton registerButton = new JButton("Register");
        JButton cancelButton = new JButton("Cancel");

        // Button actions
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String regNo = regNoField.getText();
                String parentEmail = parentField.getText();

                if (name.isEmpty() || regNo.isEmpty() || parentEmail.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Simulate registration (replace with actual logic)
                    JOptionPane.showMessageDialog(frame, 
                        "Registration Successful!\n" +
                        "Name: " + name + "\n" +
                        "Reg No: " + regNo + "\n" +
                        "Parent: " + parentEmail, 
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the window
            }
        });

        // Add buttons to a separate panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(registerButton);
        buttonPanel.add(cancelButton);

        // Add panels to the frame
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

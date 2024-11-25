import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {
    JButton b1;

    public HotelManagementSystem() {
        // Get screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Set frame properties
        setSize(screenWidth, screenHeight);
        setLocationRelativeTo(null); // Center the frame
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Start maximized

        // Add background image with scaling
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.png"));
        Image scaledImage = i1.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel image = new JLabel(scaledIcon);
        image.setBounds(0, 0, screenWidth, screenHeight);
        add(image);

        // Create the "Next" button
        b1 = new JButton("Next");
        b1.setBackground(Color.WHITE); // Set background to white
        b1.setForeground(Color.BLACK); // Set text color to black for better contrast
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setBorderPainted(false); // Remove the border
        b1.setFocusPainted(false);  // Remove focus outline when clicked
        int buttonWidth = 150;
        int buttonHeight = 50;

        // Position button near the "BOOK NOW" area
        // Adjust the coordinates (x, y) to align it with the "BOOK NOW" button on the image
        int buttonX = (int)(screenWidth * 0.7)-113 ;  // Adjust this percentage based on the image's "BOOK NOW" location
        int buttonY = (int)(screenHeight * 0.62); // Adjust this percentage to align vertically
        b1.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
        image.add(b1);

        b1.addActionListener(this);

        setVisible(true); // Make visible after all components are added
    }

    public void actionPerformed(ActionEvent ae) {
        new Login().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HotelManagementSystem();
        });
    }
}

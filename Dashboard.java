import java.awt.*;
import javax.swing.*;

public class Dashboard extends JFrame {

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        // Set the exact frame size as the image
        int imageWidth = 1919;
        int imageHeight = 718;
        setSize(imageWidth, imageHeight);
        setLocationRelativeTo(null); // Center the frame on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add background image in the center
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.png")); 
        JLabel backgroundLabel = new JLabel(i1);
        backgroundLabel.setHorizontalAlignment(JLabel.CENTER); // Align horizontally
        backgroundLabel.setVerticalAlignment(JLabel.CENTER);   // Align vertically

        // Use a panel with a proper layout to center the image
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(backgroundLabel, BorderLayout.CENTER);
        setContentPane(contentPanel);

        // Add a menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // HOTEL MANAGEMENT menu
        JMenu hotelManagementMenu = new JMenu("HOTEL MANAGEMENT");
        hotelManagementMenu.setForeground(Color.BLUE);
        menuBar.add(hotelManagementMenu);

        JMenuItem receptionMenuItem = new JMenuItem("RECEPTION");
        hotelManagementMenu.add(receptionMenuItem);

        // ADMIN menu
        JMenu adminMenu = new JMenu("ADMIN");
        adminMenu.setForeground(Color.RED);
        menuBar.add(adminMenu);

        JMenuItem addEmployeeMenuItem = new JMenuItem("ADD EMPLOYEE");
        adminMenu.add(addEmployeeMenuItem);

        JMenuItem addRoomsMenuItem = new JMenuItem("ADD ROOMS");
        adminMenu.add(addRoomsMenuItem);

        JMenuItem addDriversMenuItem = new JMenuItem("ADD DRIVERS");
        adminMenu.add(addDriversMenuItem);

        // Event listeners for menu items
        addEmployeeMenuItem.addActionListener(e -> {
            try {
                new AddEmployee().setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        addRoomsMenuItem.addActionListener(e -> {
            try {
                new AddRoom().setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        addDriversMenuItem.addActionListener(e -> {
            try {
                new AddDrivers().setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        receptionMenuItem.addActionListener(e -> {
            try {
                new Reception();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        setVisible(true);
    }
}

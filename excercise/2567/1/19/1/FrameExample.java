import javax.swing.*;
import java.awt.*;

public class FrameExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create a new JFrame with a meaningful title
        JFrame frame = new JFrame("Swing GUI Example");

        // Set default close operation to exit the program when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Swing components (e.g., JPanel, JTextField, JButton) here if needed

        // Set the layout manager if multiple components are added
        frame.setLayout(new FlowLayout());

        // Set meaningful variable names for components
        JLabel lengthLabel = new JLabel("Length: ");
        JTextField lengthTextField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        // Add components to the frame
        frame.add(lengthLabel);
        frame.add(lengthTextField);
        frame.add(submitButton);

        // Set the window to be located at the middle of the screen
        frame.setLocationRelativeTo(null);

        // Adjust the window size appropriately with the components inside the object
        frame.pack();

        // Make the window visible
        frame.setVisible(true);
    }
}

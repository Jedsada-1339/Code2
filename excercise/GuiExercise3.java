import javax.swing.*;
import java.awt.*;

public class GuiExercise3 extends JFrame {
    protected JPanel buttonPanel;
    protected JPanel textPanel;
    protected JPanel mainPanel;

    public GuiExercise3(String title) {
        super(title);
    }

    protected void addComponents() {
        buttonPanel = new JPanel();
        textPanel = new JPanel();
        mainPanel = new JPanel();

        JLabel nameLabel = new JLabel("Jedsada:");
        JTextField textField = new JTextField(20); // Add a JTextField with a specified column width

        JButton food1 = createButton("Salad");
        JButton food2 = new JButton("Shrimp");
        JButton food3 = new JButton("Sabu");

        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.add(food1);
        buttonPanel.add(food2);
        buttonPanel.add(food3);

        textPanel.setLayout(new FlowLayout());
        textPanel.add(nameLabel);
        textPanel.add(textField);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(buttonPanel, BorderLayout.CENTER); // Place buttonPanel in the north region
        mainPanel.add(textPanel, BorderLayout.NORTH); // Place textPanel in the center region

        add(mainPanel);
    }

    protected void setFrameFeatures() {
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    // Method to create a JButton with a specified label
    private JButton createButton(String label) {
        JButton button = new JButton(label);
        return button;
    }

    public static void createAndShowGUI() {
        GuiExercise3 msw = new GuiExercise3("663040133-9");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

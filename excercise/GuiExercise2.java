import javax.swing.*;
import java.awt.*;

public class GuiExercise2 extends JFrame {
    protected JPanel buttonPanel;
    protected JPanel mainPanel;

    public GuiExercise2(String title) {
        super(title);
    }

    protected void addComponents() {
        buttonPanel = new JPanel();
        mainPanel = new JPanel();
        JLabel nameLabel = new JLabel("Jedsada:");
        JButton food1 = createButton("Salad");
        JButton food2 = new JButton("Shrimp");
        JButton food3 = new JButton("Sabu");

        buttonPanel.setLayout(new GridLayout(1, 3));
        buttonPanel.add(nameLabel);
        buttonPanel.add(food1);
        buttonPanel.add(food2);
        buttonPanel.add(food3);

        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(buttonPanel);

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
        GuiExercise2 msw = new GuiExercise2("663040133-9");
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

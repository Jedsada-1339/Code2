import javax.swing.*;
import java.awt.*;

public class Guitest extends JFrame {
    protected JPanel buttonPanel;
    protected JPanel textPanel;
    protected JPanel mainPanel;

    public Guitest(String title) {
        super(title);
    }

    protected void addComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5,1));
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,2));
        buttonPanel.add(new JLabel("Dove"));
        buttonPanel.add(new JLabel("Dove"));
        mainPanel.add(buttonPanel);
        textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(1,1));
        textPanel.add(new JLabel("test"));
        mainPanel.add(textPanel);

        add(mainPanel);
    }

    protected void setFrameFeatures() {
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public static void createAndShowGUI() {
        Guitest msw = new Guitest("663040133-9");
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

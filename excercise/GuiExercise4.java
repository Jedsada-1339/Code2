import javax.swing.*;
import java.awt.*;

public class GuiExercise4 extends JFrame {
    protected JPanel buttonPanel;
    protected JPanel textPanel;
    protected JPanel mainPanel;

    public GuiExercise4(String title) {
        super(title);
    }

    protected void addComponents() {
        JPanel textAreaPanel = new JPanel();
        JPanel namePanel = new JPanel();
        textPanel = new JPanel();
        mainPanel = new JPanel();

        JLabel nameLabel = new JLabel("Name:");
        JLabel addressLabel = new JLabel("Address:");
        JTextField textField = new JTextField("Jedsada", 20);

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        JTextArea textArea = new JTextArea(4, 10);
        textArea.setText("HELLOHELLOHELLOHELLOHELLOHELL" + "HELLOHELLOHELLOHELLOHELLOHELL" + "HELLOHELLOHELLOHELLOHELLOHELLE");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);

        textAreaPanel.setLayout(new FlowLayout());
        textAreaPanel.add(addressLabel);
        textAreaPanel.add(scrollPane);

        namePanel.setLayout(new FlowLayout());
        namePanel.add(okButton);
        namePanel.add(cancelButton);

        textPanel.add(nameLabel);
        textPanel.add(textField);

        mainPanel.setLayout(new BorderLayout()); 
        mainPanel.add(textPanel,BorderLayout.NORTH);
        mainPanel.add(textAreaPanel,BorderLayout.CENTER);
        mainPanel.add(namePanel,BorderLayout.SOUTH);

        add(mainPanel);
    }

    protected void setFrameFeatures() {
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public static void createAndShowGUI() {
        GuiExercise4 msw = new GuiExercise4("663040133-9");
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

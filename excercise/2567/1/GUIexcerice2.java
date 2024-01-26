import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GUIexcerice2 extends JFrame{
    private JLabel nameLabel;

    public GUIexcerice2(String studentID) {
        super(studentID); // Set the title of the window to your student ID

        // Create components
        nameLabel = new JLabel("Jedsada");
        JButton button1 = new JButton("Favorite Food 1");
        JButton button2 = new JButton("Favorite Food 2");
        JButton button3 = new JButton("Favorite Food 3");

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Set layout for the panel
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));

        // Add the panel to the frame
        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true);
    }

    private static void createAndShowGUI(){
        GUIexcerice2 myWindow = new GUIexcerice2("663040133-9");
        myWindow.setLocationRelativeTo(null);
        myWindow.pack();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

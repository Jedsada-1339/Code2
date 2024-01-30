import javax.swing.*;
import java.awt.*;

public class Gui2ex1 extends JFrame {
    protected JPanel mainPanel;

    public Gui2ex1(String title) {
        super(title);
    }

    protected static class CoordinatePanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();
            int w = width / 2;
            int h = height / 2;
            String name = "Jedsada Sirikhojornsombut";
            Font font = new Font("SansSerif", Font.BOLD + Font.ITALIC, 32);
            g.setFont(font);
            g.setColor(Color.RED);
            g.drawString(name, w - g.getFontMetrics().stringWidth(name) / 2, h + g.getFontMetrics().getHeight() / 4);
        }
    }

    protected void addComponents() {
    }

    protected void setFrameFeatures() {
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public static void createAndShowGUI() {
        Gui2ex1 msw = new Gui2ex1("663040133-9");
        CoordinatePanel nameText = new CoordinatePanel();
        msw.setContentPane(nameText);
        msw.setPreferredSize(new Dimension(500,200));
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

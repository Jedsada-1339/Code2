import javax.swing.*;
import java.awt.*;

public class Gui2ex2 extends JFrame {
    public Gui2ex2(String title) {
        super(title);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    protected static class CoordinatePanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);

            Graphics2D g2d = (Graphics2D) g;

            g2d.setStroke(new BasicStroke(2));

            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;

            g2d.setColor(Color.RED);
            g2d.drawOval(centerX - 50, centerY - 50, 100, 100);

            g2d.setColor(Color.BLUE);
            g2d.fillRect(centerX - 5, centerY - 5, 10, 10);
        }
    }

    public static void createAndShowGUI() {
        Gui2ex2 msw = new Gui2ex2("663040133-9"); // Corrected class name
        CoordinatePanel coordinatePanel = new CoordinatePanel();
        msw.setContentPane(coordinatePanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;
import javax.swing.event.*;
import java.awt.*;

public class SimpleFormV6 extends SimpleFormV5 implements ActionListener{
    JPanel genderPanel, codeLanguagesPanel;
    JFileChooser fileChooser; // Fix the variable name
    File file;

    public SimpleFormV6(String name) {
        super(name);
    }

    public void addComponents() {
        super.addComponents();
    }

    public void addListeners() {
        super.addListeners();
        openMI.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object srcObject = e.getSource();
        if (srcObject == okButton) {
            String name = nameTxt.getText();
            String addr = addrTxtArea.getText();
            JOptionPane.showMessageDialog(this, name + " teaches at " + addr);
        } else if (srcObject == cancelButton) {
            nameTxt.setText("");
            addrTxtArea.setText("");
        }

        fileChooser = new JFileChooser();

        if (srcObject == openMI) {
            int returnVal = fileChooser.showOpenDialog(this); // Fix the variable name

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Opening file " + file.getName());
            } else {
                JOptionPane.showMessageDialog(this, "Open file cancelled by user");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        SimpleFormV6 window = new SimpleFormV6("SimpleFormV6");
        window.addComponents();
        window.addMenus(); // Ensure you have the addMenus() method
        window.addListeners();
        window.setFrameFeatures();
    }
}

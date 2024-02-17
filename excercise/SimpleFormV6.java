import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;
import java.awt.*; // Add this import statement for BorderLayout

public class SimpleFormV6 extends SimpleFormV5 implements ActionListener, ItemListener {
    JPanel genderPanel,codeLanguagesPanel;
    public SimpleFormV6(String name) {
        super(name);
    }

    public void addComponents() {
        super.addComponents();

    }

    public void addListeners() {
        super.addListeners();
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);   
        Object srcObject = e.getSource();
        if (srcObject == okButton) {
            String name = nameTxt.getText();
            String addr = addrTxtArea.getText();
            JOptionPane.showMessageDialog(this, name + " teaches at " + addr);
        }else if(srcObject == cancelButton){
            nameTxt.setText("");
            addrTxtArea.setText("");
        }
    }

    public void itemStateChanged(ItemEvent e) {
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
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }
}

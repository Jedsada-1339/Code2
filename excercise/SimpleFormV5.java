import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class SimpleFormV5 extends SimpleFormV4
    implements ActionListener, ListSelectionListener {  
    ListSelectionModel lsm;
    public SimpleFormV5(String name) {
        super(name);
    }
    public void addComponents() {
        super.addComponents();
        hobbiesLst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        lsm = hobbiesLst.getSelectionModel();

    }

    public void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
        lsm.addListSelectionListener(this);
    }

    public void valueChanged(ListSelectionEvent e) {
        boolean isAdjusting = e.getValueIsAdjusting();
        // Need to make sure that the user finishes
        // selecting
        StringBuffer message = new StringBuffer();
        if (!isAdjusting) {
            // Print the names of selected items
            List<String> selectedHobbies = hobbiesLst.getSelectedValuesList();
            int numSelected = selectedHobbies.size();
            for (int i = 0; i < numSelected; i++) {
                message.append(selectedHobbies.get(i) + " ");
            }
            JOptionPane.showMessageDialog(this, message.toString());
        }
    }

    public void actionPerformed(ActionEvent e) {
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
    
    public static void createAndShowGUI() {
        SimpleFormV5 window = new SimpleFormV5("SimpleFormV5");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
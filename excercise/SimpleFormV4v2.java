import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class SimpleFormV4v2 extends SimpleFormV4 implements ActionListener{

    public SimpleFormV4v2(String title) {
        super(title);
    }

    public void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {   
        Object srcObject = e.getSource();
        StringBuilder hobbyList = new StringBuilder();  // Fix the variable name
        List<String> selectedList = hobbiesLst.getSelectedValuesList();
        int listsSelected = selectedList.size();
        for (int i = 0; i < listsSelected; i++){
            hobbyList.append(selectedList.get(i) + " ");
        }
        if (srcObject == okButton) {
            JOptionPane.showMessageDialog(this, hobbyList);
        } else if(srcObject == cancelButton){
            nameTxt.setText("");
            addrTxtArea.setText("");
        }
    }

    public static void createAndShowGUI() {
        SimpleFormV4v2 window = new SimpleFormV4v2("SimpleFormV4vs");
        window.addComponents();
        window.addMenus();
        window.setFrameFeatures();
        window.addListeners();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}


import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {
    protected JPanel buttonsPanel, namePanel, addrPanel, mainPanel;
    protected JLabel nameLabel, addrLabel;
    protected JTextField nameTxt;
    protected JButton okButton, cancelButton;
    protected JTextArea addrTxtArea;
    protected JScrollPane addrScrollPane;

    public SimpleForm(String title) {
        super(title);
    }

    public void addComponents() {
        nameLabel = new JLabel("Name:");
        nameTxt = new JTextField("Kanda", 15);
        mainPanel = (JPanel) this.getContentPane();
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        addrLabel = new JLabel("Address:");
        addrTxtArea = new JTextArea(4, 12);
        addrScrollPane = new JScrollPane(addrTxtArea);

        mainPanel.setLayout(new BorderLayout());

        namePanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameTxt);

        addrPanel = new JPanel();
        addrPanel.setLayout(new BoxLayout(addrPanel, BoxLayout.Y_AXIS));
        addrTxtArea.setLineWrap(true);
        addrTxtArea.setWrapStyleWord(true);
        addrTxtArea.setText("Khon Kaen");
        JPanel addJPaneln = new JPanel();
        addJPaneln.setLayout(new FlowLayout(FlowLayout.CENTER));
        addJPaneln.add(addrLabel);
        addJPaneln.add(addrScrollPane);
        addrPanel.add(addJPaneln);

        buttonsPanel = new JPanel();
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);

        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(addrPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
    }

    public void setFrameFeatures() {
        // window.add(buttonsPanel);
        // window.setContentPane(buttonsPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleForm window = new SimpleForm("642-28-5829");
        window.addComponents();
        window.setFrameFeatures();
    }
}


import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private JTextField outputField;
    private JTextField inputField;

    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(300,200));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        

        outputField = new JTextField("0");
        outputField.setEnabled(false);
        

        inputField = new JTextField();
        
        container.add(outputField);
        container.add(inputField);
        container.add(createPanel());
    }
    
    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1,3));
        JButton addButton = new JButton("+");

        JButton minusButton = new JButton("-");
        JButton zButton = new JButton("Z");
        
        if(this.outputField.getText().equals("0")) {
            zButton.setEnabled(false);
        }
        
        addButton.addActionListener(new AddListener(this.outputField, this.inputField, zButton));
        minusButton.addActionListener(new MinusListener(this.inputField, this.outputField, zButton));
        zButton.addActionListener(new ZListener(this.inputField,this.outputField, zButton));
        
        panel.add(addButton);
        panel.add(minusButton);
        panel.add(zButton);
        
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
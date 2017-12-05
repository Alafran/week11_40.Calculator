import java.awt.event.*;
import javax.swing.*;

public class ZListener implements ActionListener {

    private JTextField output;
    private JTextField input;
    private JButton zButton;
    
    
    public ZListener(JTextField input, JTextField output, JButton zButton) {
        this.input = input;
        this.output = output;
        this.zButton = zButton;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.output.setText("0");
        this.input.setText("");
        this.zButton.setEnabled(false);
    }
    
}

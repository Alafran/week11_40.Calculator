import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AddListener implements ActionListener {

    private JTextField output;
    private JTextField input;
    private JButton zButton;
    
    public AddListener(JTextField output, JTextField input, JButton zButton) {
        this.input = input;
        this.output = output;
        this.zButton = zButton;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int inputNum = 0;
        int outputNum = 0;
        
        try {
            inputNum = Integer.parseInt(this.input.getText());
            outputNum = Integer.parseInt(this.output.getText());
            
            outputNum += inputNum;
            
            this.output.setText("" + outputNum);
            this.input.setText("");
            
            if(this.output.getText().equals("0")) {
                zButton.setEnabled(false);
            }
            else {
                zButton.setEnabled(true);
            }
        } catch(Exception e) {
            this.input.setText("");
        }
       
    }
    
}

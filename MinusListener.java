import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinusListener implements ActionListener {

    private JTextField input;
    private JTextField output;
    private JButton zButton;
    
    public MinusListener(JTextField input, JTextField output, JButton zButton) {
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
            
            outputNum -= inputNum;
            
            this.output.setText("" + outputNum);
            this.input.setText("");
            
            if(Integer.parseInt(this.output.getText()) == 0) {
                this.zButton.setEnabled(false);
            } else {
                this.zButton.setEnabled(true);
            }
            
        }
        catch (Exception e) {
            this.input.setText("");
        }
    }
}

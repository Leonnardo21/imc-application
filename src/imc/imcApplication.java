package imc;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author leonardo
 */

public class imcApplication extends JFrame{
    
    private JPanel contentPane;
    
    public static void main(String[] args) {
        imcApplication frame = new imcApplication();
        frame.setVisible(true);
    }

    public imcApplication(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 450, 300);
        setTitle("IMC");
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(this);
        setResizable(false);       
        
    }
    
}

package imc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
        
        /*JLabel Weight*/
        JLabel lblWeight = new JLabel("Informe seu peso");
        lblWeight.setBounds(5,5, 160, 32 );
        contentPane.add(lblWeight);
        
        /*JTextField Weight*/
        JTextField txtWeight = new JTextField();
        txtWeight.setBounds(5, 30, 160, 32);
        contentPane.add(txtWeight);
        
        /*JLabel Height*/
        JLabel lblHeight = new JLabel("Informe sua altura");
        lblHeight.setBounds(5, 60, 160, 32);
        contentPane.add(lblHeight);
        
        /*JTextField Height*/
        JTextField txtHeight = new JTextField();
        txtHeight.setBounds(5, 85, 160, 32);
        contentPane.add(txtHeight);
        
        /*JButton Calc*/
        JButton btnCalc = new JButton("Calcular");
        btnCalc.setBounds(5, 120, 160, 32);
        contentPane.add(btnCalc);
        
        }
    
}

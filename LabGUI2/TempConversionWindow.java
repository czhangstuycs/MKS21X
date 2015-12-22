
import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton CtoF = new JButton("CtoF");
	CtoF.addActionListener(this);
	CtoF.setActionCommand("CtoF");
	JButton FtoC = new JButton("FtoC");
	FtoC.addActionListener(this);
	FtoC.setActionCommand("FtoC");


	t = new JTextField(10);

	JCheckBox c = new JCheckBox("OverClock");
	j = new JLabel("Meaning of life is... ");
	pane.add(c);
	pane.add(t);
	pane.add(CtoF);
	pane.add(FtoC);
	pane.add(j);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	String s = t.getText(); 
	if(event.equals("CtoF")){
	    s += (String) CtoF(Integer.parseInt(s));
	    j.setText(s);
	}
	if(event.equals("FtoC")){
	    s += (String) FtoC(Integer.parseInt(s));
	    j.setText(s);
    
	}
 
 
    }

    public static double CtoF(double temp)                                                                                                                                                                 
    {                                                                                                                                                                                                      
        return (temp - 32)*5/9;                                                                                                                                                                            
    }                                                                                                                                                                                                      
                                                                                                                                                                                                           
    public static double FtoC(double temp)                                                                                                                                                                 
    {                                                                                                                                                                                                      
        return temp*9/5 + 32;                                                                                                                                                                              
    }              
}

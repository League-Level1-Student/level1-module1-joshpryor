
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class binaryConverter implements ActionListener {
	
	JFrame  window1 = new JFrame ();
	JPanel panal1 = new JPanel();
	JLabel lable1 = new JLabel ();
	JButton butt1 = new JButton ();
	JTextField textthing = new JTextField(6);
	String h =  ("enter random 1s and 0s and i will conveerrt it");
	private void creatAWES() {
		
		window1.add(panal1);
		window1.setVisible(true);
		panal1.add(textthing);
		panal1.add(butt1);
		panal1.add(lable1);
		lable1.setText(h);
		panal1.setVisible(true);
		butt1.setVisible(true);
		butt1.setText("convert");
	
		butt1.addActionListener(this);
		
		
	window1.pack();
		}
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if (buttonPressed == butt1) {
			h =  ("A");
			lable1.setText(h);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		new binaryConverter().creatAWES();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

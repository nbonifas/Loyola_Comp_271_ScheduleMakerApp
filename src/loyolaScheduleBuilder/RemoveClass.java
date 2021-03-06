
/* Remove Class	Similar to Add class		
BASIC_STRUCTURE			
	- Combo box that displays current classes			- Returns location of box selected
			- The main class will then clear the time slot label
			
*/

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class RemoveClass extends JFrame{

	JButton removeButton;
	JTextField textField1;
	JTextArea textArea1;
	JComboBox Classes;
	String CurrentClass="";
	
	public RemoveClass(){
		
		this.setSize(400,400);

		Toolkit tk = Toolkit.getDefaultToolkit();
		
		this.setVisible(true);
		
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
	

		this.setResizable(false); 
				
		this.setTitle("Remove Class");
		
		JPanel thePanel = new JPanel();
		
		Classes = new JComboBox();
		
		JLabel label1 = new JLabel("Remove Class"); //Labels
		
		thePanel.add(label1);
		
		removeButton = new JButton("Remove"); //Buttons
		
		thePanel.add(removeButton);

		thePanel.add(Classes);
		
		textArea1 = new JTextArea(15,20);
		
		textArea1.setText("");
		
		thePanel.add(textArea1);
		
		
		ListenForButton lisForB = new ListenForButton(); 
		
		removeButton.addActionListener(lisForB);
		
		this.add(thePanel);

		this.setVisible(true);
		
		

	}
	private class ListenForButton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == removeButton){
				
				int removedClass = Classes.getSelectedIndex();
				Classes.removeItemAt(removedClass);
				textArea1.append("Class Removed" + "\n");				
			}
				
				
		}
		
		  
	  }
	
}

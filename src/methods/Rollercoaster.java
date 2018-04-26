package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {

	public static void main(String[] args) {
		
		String Bob=JOptionPane.showInputDialog("what height are you (in inches)?");
		int  h=Integer.parseInt(Bob);
		if(h>=48) {
			JOptionPane.showMessageDialog(null, "You can go");
	}
		if(h<48) {
			
			JOptionPane.showMessageDialog(null, "Grow More First");
		}
	}
}

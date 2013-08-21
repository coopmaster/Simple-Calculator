import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * 
 */

/**
 * <b>Text Box Event Handler</b>
 * <p>updates the math once the text in the text boxes are changed</p>
 * <p></p>
 * @author Cooper Mahring
 */
public class TextBoxEventHandler implements DocumentListener{

	public TextBoxEventHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		GUI.update();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		GUI.update();
	}

}

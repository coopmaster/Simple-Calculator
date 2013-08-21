import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * <b>GUI</b>
 * <p>Holds the visible components</p>
 * <p></p>
 * @author Cooper Mahring
 */
public class GUI extends JPanel{
	
	Font defaultFont = new Font("Arial", Font.PLAIN, 50);
	
	static JTextField numberOne = new JTextField("0000");
	static JTextField numberTwo = new JTextField("0000");
	static JTextField equalsBox = new JTextField("0000");
	JTextArea plus = new JTextArea("+");
	JTextArea equals = new JTextArea("=");

	public GUI() {
		super(null);
		setSize(500,500);
		setVisible(true);
		setBackground(Color.white);
		
		numberOne.setBounds(50, 75, 150, 50);
		numberOne.getDocument().addDocumentListener(new TextBoxEventHandler());
		numberOne.setEditable(true);
		numberOne.setFont(defaultFont);
		add(numberOne);
		numberOne.setVisible(true);
		
		plus.setBounds(225,75,50,50);
		plus.setEditable(false);
		plus.setFont(defaultFont);
		add(plus);
		plus.setVisible(true);
		
		numberTwo.setBounds(300, 75, 150, 50);
		numberTwo.getDocument().addDocumentListener(new TextBoxEventHandler());
		numberTwo.setEditable(true);
		numberTwo.setFont(defaultFont);
		add(numberTwo);
		numberTwo.setVisible(true);
		
		equals.setBounds(225,175,50,50);
		equals.setEditable(false);
		equals.setFont(defaultFont);
		add(equals);
		equals.setVisible(true);
		
		equalsBox.setBounds(175, 250, 150, 50);
		equalsBox.setEditable(false);
		equalsBox.setFont(defaultFont);
		add(equalsBox);
		equalsBox.setVisible(true);
	}
	
	public static void update(){
		
		
		try{
			Reference.firstNumber = Integer.parseInt(numberOne.getText());
			Reference.secondNumber = Integer.parseInt(numberTwo.getText());
		}catch(Exception e){
			System.out.println("That isn't an integer");
		}
		Reference.finalNumber = Reference.firstNumber + Reference.secondNumber;
		equalsBox.setText(""+Reference.	finalNumber);
		MainClass.frame.setTitle("Simple Input Calculator  "+Reference.finalNumber);
	}

}

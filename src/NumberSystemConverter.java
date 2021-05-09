import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NumberSystemConverter
{

	private JFrame frameConverter;
	private JTextField textFieldInput;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					NumberSystemConverter window = new NumberSystemConverter();
					window.frameConverter.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NumberSystemConverter()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frameConverter = new JFrame();
		frameConverter.setResizable(false);
		frameConverter.setTitle("Number System Converter");
		frameConverter.setBounds(100, 100, 827, 587);
		frameConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameConverter.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(144, 355, 75, 40);
		frameConverter.getContentPane().add(lblNewLabel);
		
		JLabel lblBinary = new JLabel("Binary: ");
		lblBinary.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBinary.setBounds(46, 40, 64, 23);
		frameConverter.getContentPane().add(lblBinary);
		
		JLabel lblBinAns = new JLabel("");
		lblBinAns.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBinAns.setBounds(120, 26, 339, 57);
		frameConverter.getContentPane().add(lblBinAns);
		
		JLabel lblOctalAns = new JLabel("");
		lblOctalAns.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOctalAns.setBounds(120, 125, 227, 57);
		frameConverter.getContentPane().add(lblOctalAns);
		
		JLabel lblOctal = new JLabel("Octal:");
		lblOctal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOctal.setBounds(46, 139, 64, 23);
		frameConverter.getContentPane().add(lblOctal);
		
		JLabel lblDecAns = new JLabel("");
		lblDecAns.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDecAns.setBounds(120, 226, 218, 57);
		frameConverter.getContentPane().add(lblDecAns);
		
		JLabel lblDecimal = new JLabel("Decimal:");
		lblDecimal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDecimal.setBounds(25, 243, 85, 23);
		frameConverter.getContentPane().add(lblDecimal);
		
		JLabel lblHexAns = new JLabel("");
		lblHexAns.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHexAns.setBounds(512, 139, 218, 57);
		frameConverter.getContentPane().add(lblHexAns);
		
		JLabel lblHexadecimal = new JLabel("Hexadecimal:");
		lblHexadecimal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHexadecimal.setBounds(357, 156, 145, 23);
		frameConverter.getContentPane().add(lblHexadecimal);
		
		JLabel lblCharAns = new JLabel("");
		lblCharAns.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCharAns.setBounds(512, 226, 218, 57);
		frameConverter.getContentPane().add(lblCharAns);
		
		JLabel lblChar = new JLabel("Char:");
		lblChar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChar.setBounds(417, 243, 85, 23);
		frameConverter.getContentPane().add(lblChar);
		
		JLabel credotlbl = new JLabel("adnan13");
		credotlbl.setHorizontalAlignment(SwingConstants.CENTER);
		credotlbl.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 12));
		credotlbl.setBounds(727, 527, 72, 14);
		frameConverter.getContentPane().add(credotlbl);
		
		textFieldInput = new JTextField();
		textFieldInput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldInput.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInput.setBounds(235, 331, 356, 89);
		frameConverter.getContentPane().add(textFieldInput);
		textFieldInput.setColumns(10);
		
		JRadioButton rdbtnBinary = new JRadioButton("Binary");
		rdbtnBinary.setSelected(true);
		buttonGroup.add(rdbtnBinary);
		rdbtnBinary.setBounds(207, 427, 64, 23);
		frameConverter.getContentPane().add(rdbtnBinary);
		
		JRadioButton rdbtnOctal = new JRadioButton("Octal");
		buttonGroup.add(rdbtnOctal);
		rdbtnOctal.setBounds(273, 427, 64, 23);
		frameConverter.getContentPane().add(rdbtnOctal);
		
		JRadioButton rdbtnDecimal = new JRadioButton("Decimal");
		buttonGroup.add(rdbtnDecimal);
		rdbtnDecimal.setBounds(340, 427, 75, 23);
		frameConverter.getContentPane().add(rdbtnDecimal);
		
		JRadioButton rdbtnHexadecimal = new JRadioButton("Hexadecimal");
		buttonGroup.add(rdbtnHexadecimal);
		rdbtnHexadecimal.setBounds(417, 427, 100, 23);
		frameConverter.getContentPane().add(rdbtnHexadecimal);
		
		JRadioButton rdbtnChar = new JRadioButton("Char");
		buttonGroup.add(rdbtnChar);
		rdbtnChar.setBounds(535, 427, 56, 23);
		frameConverter.getContentPane().add(rdbtnChar);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					convert();
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "Invalid Input");
				}
			}

			private void convert()
			{
				String input = textFieldInput.getText();
		        
		        int dec = 0;
		        
		        if(rdbtnBinary.isSelected()) dec = Integer.parseInt(input, 2);
		        if(rdbtnOctal.isSelected()) dec = Integer.parseInt(input, 8);
		        if(rdbtnDecimal.isSelected()) dec = Integer.parseInt(input);
		        if(rdbtnHexadecimal.isSelected()) dec = Integer.parseInt(input, 16);
		        if(rdbtnChar.isSelected())
		        {
		        	if(input.length() > 1) dec = Integer.parseInt("55", 2); //I know.. LOL... this will create an Exception
		        	else dec = (int)input.charAt(0);
		        }
		        
		        lblBinAns.setText(Integer.toBinaryString(dec));
		        lblOctalAns.setText(Integer.toOctalString(dec));
		        lblDecAns.setText("" + dec);
		        lblHexAns.setText(Integer.toHexString(dec).toUpperCase());
		        lblCharAns.setText("" + (char)dec);
			}
		});
		
		textFieldInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					try
					{
						convert();
					}
					catch (Exception e1)
					{
						JOptionPane.showMessageDialog(null, "Invalid Input");
					}
				}
			}
			
			private void convert()
			{
				String input = textFieldInput.getText();
		        
		        int dec = 0;
		        
		        if(rdbtnBinary.isSelected()) dec = Integer.parseInt(input, 2);
		        if(rdbtnOctal.isSelected()) dec = Integer.parseInt(input, 8);
		        if(rdbtnDecimal.isSelected()) dec = Integer.parseInt(input);
		        if(rdbtnHexadecimal.isSelected()) dec = Integer.parseInt(input, 16);
		        if(rdbtnChar.isSelected())
		        {
		        	if(input.length() > 1) dec = Integer.parseInt("55", 2); //I know.. LOL... this will create an Exception
		        	else dec = (int)input.charAt(0);
		        }
		        
		        lblBinAns.setText(Integer.toBinaryString(dec));
		        lblOctalAns.setText(Integer.toOctalString(dec));
		        lblDecAns.setText("" + dec);
		        lblHexAns.setText(Integer.toHexString(dec).toUpperCase());
		        lblCharAns.setText("" + (char)dec);
			}
		});
		btnConvert.setBounds(340, 474, 146, 51);
		frameConverter.getContentPane().add(btnConvert);
	}
}

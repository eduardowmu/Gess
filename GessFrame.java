package OlaMundoJavaFX;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class GessFrame extends JFrame 
{	private JPanel contentPane;
	private JLabel lblText;
	private JSpinner spinner;
	private JLabel lblImage;
	private int aleat;
	/*Launch the application.*/
	public static void main(String[] args) 
	{	EventQueue.invokeLater(new Runnable() 
		{	public void run() 
			{	try 
				{	GessFrame frame = new GessFrame();
					frame.setVisible(true);
				} catch (Exception e) {e.printStackTrace();}
			}
		});
	}
	/*Create the frame.*/
	public GessFrame() 
	{
		setResizable(false);	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 380);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblText = new JLabel("<html>Estou pensando em um numero de 1 a 5. Que numero e este?</html>");
		lblText.setFont(new Font("Arial", Font.BOLD, 15));
		lblText.setVerticalAlignment(SwingConstants.TOP);
		lblText.setHorizontalAlignment(SwingConstants.LEFT);
		lblText.setBounds(60, 48, 167, 69);
		contentPane.add(lblText);
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.addActionListener(new ActionListener() 
		{	public void actionPerformed(ActionEvent arg0) 
			{	aleat = (int)(1 + Math.random()*(5-1));
				if(spinner.getValue().toString().equals(String.valueOf(aleat))) lblText.setText("<html>Parabens! Você acertou!</html>");
				else lblText.setText("<html>Você errou. Eu pensei em "+aleat+"</html>");
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(60, 283, 103, 40);
		contentPane.add(btnNewButton);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spinner.setFont(new Font("Arial", Font.PLAIN, 15));
		spinner.setBounds(85, 233, 47, 20);
		contentPane.add(spinner);
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon("C:\\Users\\eduardowmu\\Desktop\\meusdoc\\EMULADORES\\SOFTWARES\\ECLIPSE-JAVA\\TESTES\\JavaFX\\src\\OlaMundoJavaFX\\imagens\\jogo.png"));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(0, 0, 394, 351);
		contentPane.add(lblImage);
	}
}

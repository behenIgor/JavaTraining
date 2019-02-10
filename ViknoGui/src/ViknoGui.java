import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViknoGui {

	private JFrame frame;
	private JTextField txtMojeTekstovePole;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViknoGui window = new ViknoGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViknoGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(70, 130, 180));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMijLejbl = new JLabel("\u0412\u043A\u0430\u0436\u0456\u0442\u044C \u043C\u0456\u0441\u0442\u043E");
		lblMijLejbl.setForeground(new Color(255, 255, 255));
		lblMijLejbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMijLejbl.setBounds(26, 27, 141, 24);
		frame.getContentPane().add(lblMijLejbl);
		
		txtMojeTekstovePole = new JTextField();
		txtMojeTekstovePole.setFont(new Font("Times New Roman", Font.BOLD, 21));
		txtMojeTekstovePole.setBounds(171, 24, 205, 36);
		frame.getContentPane().add(txtMojeTekstovePole);
		txtMojeTekstovePole.setColumns(10);
		
		JButton btnMojaKnopka = new JButton("\u041E\u043F\u0440\u0430\u0446\u044E\u0432\u0430\u0442\u0438");
		btnMojaKnopka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String imjaMista = txtMojeTekstovePole.getText();
			if (imjaMista.length() == 0){
				JOptionPane.showMessageDialog(null, "¬и не ввели назву м≥ста");
			}else{
				JOptionPane.showMessageDialog(null, imjaMista + " - гарне м≥сто!");
			}
			}
		});
		btnMojaKnopka.setBounds(160, 124, 112, 23);
		frame.getContentPane().add(btnMojaKnopka);
	}
}

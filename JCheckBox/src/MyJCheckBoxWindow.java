import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MyJCheckBoxWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJCheckBoxWindow window = new MyJCheckBoxWindow();
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
	public MyJCheckBoxWindow() {
		initialize();
	}
	
	float summ; 
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		summ = 0;
		
		frame = new JFrame();
		frame.setTitle("\u0420\u0435\u0441\u0442\u043E\u0440\u0430\u043D"); // можна писати в дужках просто укр.текст напр.тут ("Ресторан")) (як в "Вареники" нижче)
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Zamovlennia = new JLabel("\u0417\u0430\u043C\u043E\u0432\u043B\u0435\u043D\u043D\u044F:");
		Zamovlennia.setBounds(10, 11, 121, 14);
		frame.getContentPane().add(Zamovlennia);
		
		
		JLabel lblTotal = new JLabel("0");
		lblTotal.setBounds(178, 189, 57, 14);
		frame.getContentPane().add(lblTotal);
		
		JCheckBox cbxBorsch = new JCheckBox("\u0411\u043E\u0440\u0449 (30 \u0433\u0440\u043D)");
		cbxBorsch.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxBorsch.isSelected()) {
					summ += 30;
				}else {
					summ -= 30;
				}
				lblTotal.setText(String.format("%.2f", summ));
			}
		});
		cbxBorsch.setBounds(20, 29, 161, 23);
		frame.getContentPane().add(cbxBorsch);
		
		JCheckBox cbxVarenyky = new JCheckBox("Вареники (35 грн)");
		cbxVarenyky.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxVarenyky.isSelected()) {
					summ += 35;
				}else {
					summ -= 35;
				}
				lblTotal.setText(String.format("%.2f", summ));
			}
		});
		cbxVarenyky.setBounds(20, 55, 161, 23);
		frame.getContentPane().add(cbxVarenyky);
		
		JCheckBox cbxGolubci = new JCheckBox("\u0413\u043E\u043B\u0443\u0431\u0446\u0456 (45 \u0433\u0440\u043D)");
		cbxGolubci.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxGolubci.isSelected()) {
					summ += 45;
				}else {
					summ -= 45;
				}
				lblTotal.setText(String.format("%.2f", summ));
			}
		});
		cbxGolubci.setBounds(20, 81, 161, 23);
		frame.getContentPane().add(cbxGolubci);
		
		JCheckBox cbxHolodec = new JCheckBox("\u0425\u043E\u043B\u043E\u0434\u0435\u0446\u044C (50 \u0433\u0440\u043D)");
		cbxHolodec.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxHolodec.isSelected()) {
					summ += 50;
				}else {
					summ -= 50;
				}
				lblTotal.setText(String.format("%.2f", summ));
			}
		});
		cbxHolodec.setBounds(20, 107, 161, 23);
		frame.getContentPane().add(cbxHolodec);
		
		JCheckBox cbxShashlyk = new JCheckBox("\u0428\u0430\u0448\u043B\u0438\u043A (100 \u0433\u0440\u043D)");
		cbxShashlyk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxShashlyk.isSelected()) {
					summ += 100;
				}else {
					summ -= 100;
				}
				lblTotal.setText(String.format("%.2f", summ));
			}
		});
		cbxShashlyk.setBounds(20, 133, 161, 23);
		frame.getContentPane().add(cbxShashlyk);
		
		JLabel lblSum = new JLabel("\u0421\u0443\u043C\u0430 \u0437\u0430\u043C\u043E\u0432\u043B\u0435\u043D\u043D\u044F (\u0433\u0440\u043D)");
		lblSum.setBounds(10, 189, 158, 14);
		frame.getContentPane().add(lblSum);
		
		
	}
}

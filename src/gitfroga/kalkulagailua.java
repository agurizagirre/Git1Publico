package gitfroga;

	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class kalkulagailua extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField textField;

		JButton btnzero;
		JButton btnbat;
		JButton btnhiru;
		JButton btnlau;
		JButton btnsei;
		JButton btnzortzi;
		JButton btnbederatzi;
		JButton btndezimal;
		
		JButton btnberdin;
		JButton btnzatiketa;
		JButton btnbiderketa;
		JButton btnkenketa;
		JButton btnbatuketa;
		
		/**
		 * Launch the application Hau GitHub etik aldatu dot.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						kalkulagailua frame = new kalkulagailua();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public kalkulagailua() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 550, 450);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(5, 5, 524, 60);
			contentPane.add(textField);
			textField.setColumns(10);
			
			btnbat = new JButton("1");
			btnbat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textField.setText (textField.getText() + "1");
				}
			});
			btnbat.setBounds(5, 81, 89, 70);
			contentPane.add(btnbat);
			
			btnlau = new JButton("4");
			btnlau.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnlau.setBounds(5, 162, 89, 70);
			contentPane.add(btnlau);
			
			JButton btnbost = new JButton("5");
			btnbost.setBounds(107, 162, 89, 70);
			contentPane.add(btnbost);
			
			JButton btnbi = new JButton("2");
			btnbi.setBounds(107, 81, 89, 70);
			contentPane.add(btnbi);
			
			JButton btnzazpi = new JButton("7");
			btnzazpi.setBounds(5, 243, 89, 70);
			contentPane.add(btnzazpi);
			
			btnzortzi = new JButton("8");
			btnzortzi.setBounds(107, 243, 89, 70);
			contentPane.add(btnzortzi);
			
			btnhiru = new JButton("3");
			btnhiru.setBounds(213, 81, 89, 70);
			contentPane.add(btnhiru);
			
			btnsei = new JButton("6");
			btnsei.setBounds(213, 162, 89, 70);
			contentPane.add(btnsei);
			
			btnbederatzi = new JButton("9");
			btnbederatzi.setBounds(213, 243, 89, 70);
			contentPane.add(btnbederatzi);
			
			btnzero = new JButton("0");
			btnzero.setBounds(107, 324, 89, 70);
			contentPane.add(btnzero);
			
			btnbatuketa = new JButton("+");
			btnbatuketa.setBounds(331, 141, 89, 70);
			contentPane.add(btnbatuketa);
			
			btnkenketa = new JButton("-");
			btnkenketa.setBounds(421, 141, 89, 70);
			contentPane.add(btnkenketa);
			
			btnbiderketa = new JButton("x");
			btnbiderketa.setBounds(331, 211, 89, 70);
			contentPane.add(btnbiderketa);
			
			btnzatiketa = new JButton("-");
			btnzatiketa.setBounds(421, 211, 89, 70);
			contentPane.add(btnzatiketa);
			
			btnberdin = new JButton("=");
			btnberdin.setBounds(376, 310, 89, 70);
			contentPane.add(btnberdin);
			
			btndezimal = new JButton(".");
			btndezimal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btndezimal.setBounds(213, 324, 89, 70);
			contentPane.add(btndezimal);
		}
	}

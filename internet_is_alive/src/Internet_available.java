import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class Internet_available extends JFrame {

	public JPanel contentPane;
	public JPanel panel;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Internet_available frame = new Internet_available();
					frame.setVisible(true);
					frame.setAlwaysOnTop(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Internet_available() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setBounds(100, 100, 638, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInternetOnline = new JLabel("INTERNET ONLINE");
		lblInternetOnline.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInternetOnline.setBounds(207, 23, 286, 40);
		contentPane.add(lblInternetOnline);
		
		JLabel lblComprobacinDePgina = new JLabel("Comprobaci\u00F3n de p\u00E1gina web:");
		lblComprobacinDePgina.setBounds(10, 74, 160, 14);
		contentPane.add(lblComprobacinDePgina);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(168, 71, 238, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 130, 602, 189);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnElRecuadroSuperior = new JTextPane();
		txtpnElRecuadroSuperior.setBounds(39, 75, 553, 83);
		panel.add(txtpnElRecuadroSuperior);
		txtpnElRecuadroSuperior.setEditable(false);
		txtpnElRecuadroSuperior.setBackground(Color.WHITE);
		txtpnElRecuadroSuperior.setText("Este recuadro cambiar\u00E1 a ROJO-NARANJA si la conexi\u00F3n a internet se pierde. \r\nEn ese caso contactar con IPP");
		txtpnElRecuadroSuperior.setOpaque(false);
		
		JToggleButton tglbtnSonidoOn = new JToggleButton("Sonido ON / OFF");
		tglbtnSonidoOn.setEnabled(false);
		tglbtnSonidoOn.setBounds(10, 384, 178, 23);
		contentPane.add(tglbtnSonidoOn);
		
		JLabel lblCada = new JLabel("Cada:");
		lblCada.setBounds(10, 105, 46, 14);
		contentPane.add(lblCada);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(168, 99, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblminutos = new JLabel("(minutos)");
		lblminutos.setBounds(264, 105, 121, 14);
		contentPane.add(lblminutos);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Codigo de salida:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 330, 602, 43);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(6, 16, 586, 20);
		panel_2.add(textField_2);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setOpaque(false);
		JLabel lblDeMomento = new JLabel("* de momento no se puede deshabilitar");
		lblDeMomento.setBounds(198, 388, 328, 14);
		contentPane.add(lblDeMomento);
		JLabel lblATravsDe = new JLabel(" a trav\u00E9s de proxy");
		lblATravsDe.setBounds(409, 74, 160, 14);
		contentPane.add(lblATravsDe);
		
		JLabel lblVersion = new JLabel("Version 0.1b Beta");
		lblVersion.setBounds(469, 38, 130, 14);
		contentPane.add(lblVersion);
		
		// Get default close operation
		int op = this.getDefaultCloseOperation(); // HIDE_ON_CLOSE

		// Set to ignore the button
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		 
		
	}
}

package trezeDeAgosto;

import java.awt.EventQueue;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;

public class tela {

	private JFrame frame;
	JFormattedTextField txtNome;
	JFormattedTextField txtCPF;
	JFormattedTextField txtBirth;
	JFormattedTextField txtPhone;
	JFormattedTextField txtEmail;
	JFormattedTextField txtCEP;
	JFormattedTextField txtCnpj;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
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
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		try {
			MaskFormatter maskcep, maskcpf, maskbirth, maskphone, maskcnpj;
			maskcep = new MaskFormatter("##.###-###");
			maskcpf = new MaskFormatter("###.###.###-##");
			maskbirth = new MaskFormatter("##/##/####");
			maskphone = new MaskFormatter("(##)#########");
			maskcnpj = new MaskFormatter("##.###.###/####-##");
			txtCEP = new JFormattedTextField(maskcep);
			txtCPF = new JFormattedTextField(maskcpf);
			txtBirth = new JFormattedTextField(maskbirth);
			txtPhone = new JFormattedTextField(maskphone);
			txtCnpj = new JFormattedTextField(maskcnpj);
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar", "Erro", JOptionPane.ERROR);
		}
		
		JLabel NomeLabel = new JLabel("Nome:");
		NomeLabel.setBounds(20, 24, 46, 14);
		frame.getContentPane().add(NomeLabel);
		
		JFormattedTextField txtNome = new JFormattedTextField();
		txtNome.setBounds(150, 21, 270, 20);
		frame.getContentPane().add(txtNome);
		
		JLabel CPFLabel = new JLabel("CPF:");
		CPFLabel.setBounds(20, 56, 120, 14);
		frame.getContentPane().add(CPFLabel);
		
		txtCPF.setBounds(150, 53, 270, 20);
		frame.getContentPane().add(txtCPF);
		
		JLabel BirthLabel = new JLabel("Data de Nascimento:");
		BirthLabel.setBounds(20, 87, 120, 14);
		frame.getContentPane().add(BirthLabel);

		txtBirth.setBounds(150, 84, 270, 20);
		frame.getContentPane().add(txtBirth);
		
		JLabel phoneLabel = new JLabel("Telefone:");
		phoneLabel.setBounds(20, 118, 120, 14);
		frame.getContentPane().add(phoneLabel);
		
		
		txtPhone.setBounds(150, 115, 270, 20);
		frame.getContentPane().add(txtPhone);
		
		JLabel EmailLabel = new JLabel("E-mail:");
		EmailLabel.setBounds(20, 149, 46, 14);
		frame.getContentPane().add(EmailLabel);
		
		JFormattedTextField txtEmail = new JFormattedTextField();
		txtEmail.setBounds(150, 146, 270, 20);
		frame.getContentPane().add(txtEmail);
		
		
		JLabel CEPLabel = new JLabel("CEP:");
		CEPLabel.setBounds(20, 180, 120, 14);
		frame.getContentPane().add(CEPLabel);
		
		
		txtCEP.setBounds(150, 177, 270, 20);
		frame.getContentPane().add(txtCEP);

		JLabel cnpjLabel = new JLabel("Cnpj:");
		cnpjLabel.setBounds(20, 207, 120, 14);
		frame.getContentPane().add(cnpjLabel);
		
		
		txtCnpj.setBounds(150, 204, 270, 20);
		frame.getContentPane().add(txtCnpj);
		
		JButton btnNewButton = new JButton("Enviar");	
		
		
		
		
		btnNewButton.setBounds(162, 248, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}

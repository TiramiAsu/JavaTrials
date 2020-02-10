/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c04_gui_ifelse;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

/**
 * <pre>
 * [簡易登入判斷] 2019-09-09 23:46
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@SuppressWarnings("serial")
public class _Login extends JFrame {

	private JPanel contentPane;
	private JTextField textF_account;
	private JTextField textF_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_Login frame = new _Login();
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
	public _Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(_Login.class.getResource("./pic2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(_Login.class.getResource("./pic1.png")));
		lblNewLabel.setBounds(125, 37, 150, 143);
		contentPane.add(lblNewLabel);

		JLabel lblAccount = new JLabel("Account：");
		lblAccount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAccount.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblAccount.setBounds(34, 212, 102, 44);
		contentPane.add(lblAccount);

		JLabel lblPassword = new JLabel("Password：");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblPassword.setBounds(34, 283, 102, 44);
		contentPane.add(lblPassword);

		textF_account = new JTextField();
		textF_account.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		textF_account.setBounds(139, 219, 210, 35);
		contentPane.add(textF_account);
		textF_account.setColumns(10);

		textF_Password = new JTextField();
		textF_Password.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		textF_Password.setBounds(139, 290, 210, 35);
		contentPane.add(textF_Password);
		textF_Password.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] accountText = { "guest", "tirami", "cano", "kitty", "kimmy" };
				String[] passwordText = { "12345", "12345", "12345", "12345", "12345" };
				String message = "";
				String title = "";
				int icon = 0;

				for (int i = 0; i < accountText.length; i++) {
					if (textF_account.getText().equals(accountText[i])
							&& textF_Password.getText().equals(passwordText[i])) {
						message = "Hello, " + accountText[i];
						title = "Welcome";
						icon = 1;
						break;
					} else {
						message = "Please check your account and password";
						title = "Error";
						icon = 2;
					}
				}
				JOptionPane.showMessageDialog(null, message, title, icon);
			}
		});
		btnLogin.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		btnLogin.setBounds(139, 370, 210, 35);
		contentPane.add(btnLogin);
	}
}

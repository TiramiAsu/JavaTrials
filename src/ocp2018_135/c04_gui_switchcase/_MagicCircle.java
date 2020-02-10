/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c04_gui_switchcase;

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

/**
 * <pre>
 * [Switch Picture] 2019-09-09 23:46
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@SuppressWarnings("serial")
public class _MagicCircle extends JFrame {

	private JPanel contentPane;
	private JTextField input_txtfd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_MagicCircle frame = new _MagicCircle();
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
	public _MagicCircle() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(_MagicCircle.class.getResource("./pic3.png")));
		setTitle("Magic Circle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel showImage = new JLabel("");
		showImage.setBounds(73, 55, 150, 150);
		contentPane.add(showImage);
		
		JLabel title_lbl = new JLabel("Input(1-3) :");
		title_lbl.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		title_lbl.setBounds(82, 253, 133, 25);
		contentPane.add(title_lbl);
		
		input_txtfd = new JTextField();
		input_txtfd.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		input_txtfd.setBounds(82, 291, 133, 25);
		contentPane.add(input_txtfd);
		input_txtfd.setColumns(10);
		
		JButton call_btn = new JButton("CALL");
		call_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// 取值
				int num = Integer.parseInt(input_txtfd.getText());
				if(num<1 || num>3) {
					JOptionPane.showMessageDialog(null,"超出範圍，請重新輸入!! ", "圖片轉換",1);
				}else {
					if(num == 1) {
						showImage.setIcon(new ImageIcon(_MagicCircle.class.getResource("./pic1.png")));
					}else if(num == 2) {
						showImage.setIcon(new ImageIcon(_MagicCircle.class.getResource("./pic2.png")));
					}else {
						showImage.setIcon(new ImageIcon(_MagicCircle.class.getResource("./pic3.png")));
					}
				}
				// 清空
				input_txtfd.setText("");

			}
			
		});
		call_btn.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		call_btn.setBounds(82, 332, 133, 33);
		contentPane.add(call_btn);
	}
}

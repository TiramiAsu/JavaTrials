/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c08_gui_verify;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * <pre>
 * [簡易輸入驗證] 2019-08-06 10:42
 * - 驗證輸入框必須輸入數字
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@SuppressWarnings("serial")
public class _InputVerify extends JFrame {

	private JPanel contentPane;
	private JTextField input1_txtfld;
	private JTextField input2_txtfld;
	private JButton submit_btn;
	private JLabel label;
	private JLabel info_lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_InputVerify frame = new _InputVerify();
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
	public _InputVerify() {
		setTitle("簡易輸入驗證");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 153);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		input1_txtfld = new JTextField();
		input1_txtfld.setBounds(33, 43, 96, 21);
		contentPane.add(input1_txtfld);
		input1_txtfld.setColumns(10);
		
		input2_txtfld = new JTextField();
		input2_txtfld.setBounds(180, 43, 96, 21);
		contentPane.add(input2_txtfld);
		input2_txtfld.setColumns(10);
		
		submit_btn = new JButton("計算");
		submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				int input1 = Integer.parseInt(tFieldInput1.getText());
				int input2 = Integer.parseInt(tFieldInput2.getText());
				
				JOptionPane.showMessageDialog(null,
						String.format("%d + %d = %d",input1,input2,input1+input2),
						"SUM", 1);
				*/
				
				// 判斷是否為數字
				String s1 = input1_txtfld.getText();
				String s2 = input2_txtfld.getText();
				if(judgeNum(s1) == true && judgeNum(s2) == true) {
					JOptionPane.showMessageDialog(null,
							String.format("%d + %d = %d",
									Integer.parseInt(s1),
									Integer.parseInt(s2),
									Integer.parseInt(s1)+Integer.parseInt(s2)),
							"SUM", 1);
				}else {
					JOptionPane.showMessageDialog(null,"請輸入數字","Error",1);
				}
			}
		});
		submit_btn.setBounds(317, 42, 87, 23);
		contentPane.add(submit_btn);
		
		label = new JLabel("+");
		label.setBounds(152, 28, 14, 50);
		contentPane.add(label);
		
		info_lbl = new JLabel("* 輸入文字會出現錯誤提示");
		info_lbl.setBounds(33, 9, 200, 21);
		contentPane.add(info_lbl);
	}
	
	// Regex 結合 Pattern 做檢查
	public boolean judgeNum(String var) {
		Pattern p = Pattern.compile("[0-9]*");
		return p.matcher(var).matches();
	}
}

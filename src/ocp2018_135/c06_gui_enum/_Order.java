/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c06_gui_enum;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * <pre>
 * [點餐介面] 2019-09-10 10:14
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@SuppressWarnings("serial")
public class _Order extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_Order frame = new _Order();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public _Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox setModel_cmb = new JComboBox();
		setModel_cmb.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		setModel_cmb.setModel(new DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F" }));
		setModel_cmb.setBounds(27, 65, 119, 21);
		contentPane.add(setModel_cmb);

		JComboBox food_cmb = new JComboBox();
		food_cmb.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		food_cmb.setModel(new DefaultComboBoxModel(FoodEnum.values()));
		food_cmb.setBounds(189, 65, 119, 21);
		contentPane.add(food_cmb);

		JComboBox drink_cmb = new JComboBox();
		drink_cmb.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		drink_cmb.setModel(new DefaultComboBoxModel(DrinkEnum.values()));
		drink_cmb.setBounds(347, 64, 119, 21);
		contentPane.add(drink_cmb);

		JLabel setModel_lbl = new JLabel("set model");
		setModel_lbl.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		setModel_lbl.setBounds(27, 37, 105, 15);
		contentPane.add(setModel_lbl);

		JLabel food_lbl = new JLabel("Food");
		food_lbl.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		food_lbl.setBounds(189, 37, 87, 15);
		contentPane.add(food_lbl);

		JLabel drink_lbl = new JLabel("Drink");
		drink_lbl.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		drink_lbl.setBounds(347, 36, 79, 15);
		contentPane.add(drink_lbl);

		JLabel choose_lbl = new JLabel("(choose)");
		choose_lbl.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		choose_lbl.setBounds(189, 114, 119, 15);
		contentPane.add(choose_lbl);

		JButton food_btn = new JButton("Order");
		food_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				lb_second.setText("ABCD");
				choose_lbl.setText(food_cmb.getSelectedItem().toString());
			}
		});
		food_btn.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		food_btn.setBounds(189, 153, 87, 23);
		contentPane.add(food_btn);

		JButton drink_btn = new JButton("Order");
		drink_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// 顯示原 item 名稱
				JOptionPane.showMessageDialog(
						null,
						String.format("你選擇的是： %s(%s)",
								drink_cmb.getSelectedItem(),
								DrinkEnum.getEnum(drink_cmb.getSelectedIndex() + 1)),
						"請確認", 1);
			}
		});
		drink_btn.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		drink_btn.setBounds(347, 153, 87, 23);
		contentPane.add(drink_btn);
	}
}

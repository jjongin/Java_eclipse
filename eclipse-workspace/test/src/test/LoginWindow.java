package test;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;
public class LoginWindow extends JFrame{
	public LoginWindow() {
		setTitle("login window");
		setSize(300, 150);
		
		JPanel panel = new JPanel();
		add(panel);
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.RIGHT);
		panel.setLayout(layout);
		panel.add(new JLabel("id "));
		JTextField txtFieldID = new JTextField(20);
		txtFieldID.setBackground(Color.cyan);
		txtFieldID.setText("홍길동");
		panel.add(txtFieldID);
		panel.add(new JLabel("pass"));
		JPasswordField pwField=new JPasswordField(20);
		pwField.setText("abce");
		pwField.setBackground(Color.pink);
		txtFieldID.requestFocus();
		panel.add(pwField);
		panel.setBackground(Color.yellow);
		JButton login = new JButton("login");
		panel.add(login);
		
		JButton cancel=new JButton("cancel");
		panel.add(cancel);
		
		setVisible(true);

}}

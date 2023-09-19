package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConverter extends JFrame implements ActionListener {
    private JTextField field1;
    private JTextField field2;

    public TempConverter() {
        JPanel panel = new JPanel();
        add(panel);
        JLabel label1 = new JLabel("화씨 온도");
        JLabel label2 = new JLabel("섭씨 온도");
        field1 = new JTextField(15);
        field2 = new JTextField(15);
        JButton button = new JButton("변환");
        button.addActionListener(this); // 버튼에 이벤트 리스너 추가
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button);
        setSize(300, 150);
        setTitle("온도변환기");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String argv[]) {
        TempConverter f = new TempConverter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("변환")) {
            try {
                // 입력된 화씨 온도를 읽어옴
                double fahrenheit = Double.parseDouble(field1.getText());
                // 화씨를 섭씨로 변환
                double celsius = (fahrenheit - 32) * 5 / 9;
                // 섭씨 온도를 텍스트 필드에 표시
                field2.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                // 잘못된 숫자가 입력되면 에러 처리
                field2.setText("유효한 숫자가 아님");
            }
        }
    }
}
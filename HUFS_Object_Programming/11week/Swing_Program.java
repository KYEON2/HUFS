import javax.swing.*;
import java.awt.*;

public class SwingExample {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("SwingD Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        // 패널을 생성하고 배경색을 설정
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);

        // 버튼 생성
        JButton submitButton = new JButton("Submit");
        JButton editButton = new JButton("Edit");
        JButton deleteButton = new JButton("Delete");

        // 패널에 버튼 추가
        panel.add(submitButton);
        panel.add(editButton);
        panel.add(deleteButton);

        // 프레임에 패널 추가
        frame.add(panel);

        // 프레임을 보이도록 설정
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // FlowLayout 배치관리자 생성, 간격 설정
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 30, 40);
        frame.setLayout(layout);

        // 버튼 생성 및 추가
        frame.add(new JButton("Button1"));
        frame.add(new JButton("Button2"));
        frame.add(new JButton("Button3"));
        frame.add(new JButton("Button4"));
        frame.add(new JButton("Button5"));

        // 프레임을 보이도록 설정
        frame.setVisible(true);
    }
}

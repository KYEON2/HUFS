package Todo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Timetable extends JFrame {

    private Map<String, String> scheduleMap;

    public Timetable() {
        scheduleMap = new HashMap<>();

        // 프레임 설정
        setTitle("주간 일정 관리 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // 패널 및 레이아웃 설정
        JPanel panel = new JPanel(new GridLayout(8, 2));

        // 시간대 표시
        panel.add(new JLabel("시간"));
        panel.add(new JLabel("일정"));

        for (int hour = 6; hour <= 18; hour++) {
            String time = hour + ":00 - " + (hour + 1) + ":00";
            panel.add(new JLabel(time));
            JTextField scheduleTextField = new JTextField();
            panel.add(scheduleTextField);
            scheduleMap.put(time, "");
        }

        // 일정 저장 버튼 및 이벤트 처리
        JButton saveButton = new JButton("일정 저장");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 2; i < panel.getComponentCount(); i += 2) {
                    JTextField scheduleTextField = (JTextField) panel.getComponent(i);
                    String time = panel.getComponent(i - 1).toString();
                    scheduleMap.put(time, scheduleTextField.getText());
                }
                JOptionPane.showMessageDialog(null, "일정이 저장되었습니다.");
            }
        });

        panel.add(saveButton);

        // 프레임에 패널 추가
        add(panel);

        // 프레임 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Timetable();
            }
        });
    }
}
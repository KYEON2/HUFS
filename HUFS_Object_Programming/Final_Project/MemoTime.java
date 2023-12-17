package Todo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class memotime extends JFrame {

    private Map<String, String> scheduleMap;
    private JTextArea memoArea;

    public memotime() {
        scheduleMap = new HashMap<>();

        // 프레임 설정
        setTitle("주간 일정 관리 및 메모 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new GridLayout(1, 2)); // 레이아웃을 GridLayout으로 설정

        // 일정 관리 패널 설정
        JPanel schedulePanel = new JPanel(new GridLayout(8, 2));
        schedulePanel.add(new JLabel("시간"));
        schedulePanel.add(new JLabel("일정"));
        for (int hour = 6; hour <= 18; hour++) {
            String time = hour + ":00 - " + (hour + 1) + ":00";
            schedulePanel.add(new JLabel(time));
            JTextField scheduleTextField = new JTextField();
            schedulePanel.add(scheduleTextField);
            scheduleMap.put(time, "");
        }

        JButton saveButton = new JButton("일정 저장");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 2; i < schedulePanel.getComponentCount(); i += 2) {
                    JTextField scheduleTextField = (JTextField) schedulePanel.getComponent(i);
                    String time = ((JLabel) schedulePanel.getComponent(i - 1)).getText();
                    scheduleMap.put(time, scheduleTextField.getText());
                }
                JOptionPane.showMessageDialog(null, "일정이 저장되었습니다.");
            }
        });
        schedulePanel.add(saveButton);

        // 메모 패널 설정
        JPanel memoPanel = new JPanel(new BorderLayout());
        memoArea = new JTextArea();
        memoPanel.add(new JScrollPane(memoArea), BorderLayout.CENTER);
        JButton memoSaveButton = new JButton("메모 저장");
        memoSaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 메모 저장 기능 구현
                JOptionPane.showMessageDialog(null, "메모가 저장되었습니다.");
            }
        });
        memoPanel.add(memoSaveButton, BorderLayout.SOUTH);

        // 프레임에 패널 추가
        add(schedulePanel);
        add(memoPanel);

        // 프레임 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new memotime();
            }
        });
    }
}

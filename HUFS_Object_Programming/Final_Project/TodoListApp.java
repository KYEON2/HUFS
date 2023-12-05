package Todo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TodoListApp {
    private JFrame frame;
    private DefaultListModel<JCheckBox> listModel;
    private JList<JCheckBox> todoList;
    private JTextField taskField;

    public TodoListApp() {
        setFrame(new JFrame("To-Do List"));
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        taskField = new JTextField(20);
        JButton addButton = new JButton("추가");
        JButton removeButton = new JButton("삭제");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText();
                if (!task.isEmpty()) {
                    JCheckBox checkBox = new JCheckBox(task);
                    listModel.addElement(checkBox);
                    taskField.setText("");
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = listModel.getSize() - 1; i >= 0; i--) {
                    JCheckBox checkBox = listModel.get(i);
                    if (checkBox.isSelected()) {
                        listModel.remove(i);
                    }
                }
            }
        });

        todoList.setCellRenderer(new CellRenderer());
        todoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // 마우스 리스너 추가
        todoList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = todoList.locationToIndex(e.getPoint());
                if (index != -1) {
                    JCheckBox checkBox = listModel.getElementAt(index);
                    checkBox.setSelected(!checkBox.isSelected());
                    todoList.repaint();
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(taskField);
        panel.add(addButton);
        panel.add(removeButton);

        getFrame().add(new JScrollPane(todoList), BorderLayout.CENTER);
        getFrame().add(panel, BorderLayout.SOUTH);
        getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getFrame().setSize(600, 500);
        getFrame().setVisible(true);
    }

    static class CellRenderer implements ListCellRenderer<JCheckBox> {
        @Override
        public Component getListCellRendererComponent(JList<? extends JCheckBox> list, JCheckBox value, int index, boolean isSelected, boolean cellHasFocus) {
            // JCheckBox의 상태 변경을 반영하기 위해 변경
            value.setBackground(isSelected ? list.getSelectionBackground() : list.getBackground());
            value.setForeground(isSelected ? list.getSelectionForeground() : list.getForeground());
            return value;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TodoListApp();
            }
        });
    }

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}

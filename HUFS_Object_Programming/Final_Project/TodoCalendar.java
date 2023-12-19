package Todo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

class TodoItem {
    private String name;
    private boolean completed;

    public TodoItem(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

public class TodoCalendar extends JFrame implements ActionListener {
    Calendar cal;
    int year, month, date;
    JPanel pane, pane2, datePane;
    JButton btn1, btn2;
    JComboBox<Integer> yearCombo, monthCombo;
    DefaultComboBoxModel<Integer> yearModel, monthModel;
    String[] titleStr = {"일", "월", "화", "수", "목", "금", "토"};

    private DefaultListModel<TodoItem> listModel;
    private JList<TodoItem> todoList;
    private JTextField taskField;

    public TodoCalendar() {
        cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        date = cal.get(Calendar.DATE);

        pane = new JPanel();
        btn1 = new JButton("◀");
        btn2 = new JButton("▶");
        JLabel yearlb = new JLabel("년");
        JLabel monthlb = new JLabel("월");

        yearModel = new DefaultComboBoxModel<>();
        monthModel = new DefaultComboBoxModel<>();
        for (int i = year - 100; i <= year + 50; i++) {
            yearModel.addElement(i);
        }
        yearCombo = new JComboBox<>(yearModel);
        yearCombo.setSelectedItem(year);
        
        for (int i = 1; i <= 12; i++) {
            monthModel.addElement(i);
        }
        monthCombo = new JComboBox<>(monthModel);
        monthCombo.setSelectedItem(month);

        pane.add(btn1);
        pane.add(yearCombo);
        pane.add(yearlb);
        pane.add(monthCombo);
        pane.add(monthlb);
        pane.add(btn2);
        pane.setBackground(Color.CYAN);

        pane2 = new JPanel(new BorderLayout());
        JPanel titlePanel = new JPanel(new GridLayout(1, 7));
        for (String title : titleStr) {
            JLabel lbl = new JLabel(title, JLabel.CENTER);
            lbl.setForeground(title.equals("일") ? Color.red : (title.equals("토") ? Color.blue : Color.black));
            titlePanel.add(lbl);
        }
        pane2.add(titlePanel, BorderLayout.NORTH);

        datePane = new JPanel(new GridLayout(0, 7));
        pane2.add(datePane, BorderLayout.CENTER);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        yearCombo.addActionListener(this);
        monthCombo.addActionListener(this);

        day(year, month);

        initTodoList();

        setLayout(new BorderLayout());
        JPanel calendarPanel = new JPanel(new BorderLayout());
        calendarPanel.add(pane, BorderLayout.NORTH);
        calendarPanel.add(pane2, BorderLayout.CENTER);
        add(calendarPanel, BorderLayout.WEST);

        JPanel todoPanel = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(todoList);
        todoPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(taskField);
        inputPanel.add(createButton("추가", this::addTodoItem));
        inputPanel.add(createButton("삭제", this::removeSelectedItems));
        todoPanel.add(inputPanel, BorderLayout.SOUTH);

        add(todoPanel, BorderLayout.CENTER);

        setTitle("Calendar and To-Do List");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initTodoList() {
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        todoList.setCellRenderer(new CellRenderer());
        todoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        todoList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = todoList.locationToIndex(e.getPoint());
                if (index != -1) {
                    TodoItem item = listModel.getElementAt(index);
                    item.setCompleted(!item.isCompleted());
                    todoList.repaint();
                }
            }
        });
        taskField = new JTextField(20);
    }

    private JButton createButton(String text, ActionListener action) {
        JButton button = new JButton(text);
        button.addActionListener(action);
        return button;
    }

    private void addTodoItem(ActionEvent e) {
        String task = taskField.getText();
        if (!task.isEmpty()) {
            listModel.addElement(new TodoItem(task));
            taskField.setText("");
        }
    }

    private void removeSelectedItems(ActionEvent e) {
        for (int i = listModel.getSize() - 1; i >= 0; i--) {
            TodoItem item = listModel.getElementAt(i);
            if (item.isCompleted()) {
                listModel.remove(i);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        Object eventObj = e.getSource();
        if (eventObj instanceof JComboBox) {
            datePane.removeAll();
            day((Integer) yearCombo.getSelectedItem(), (Integer) monthCombo.getSelectedItem());
            datePane.revalidate();
            datePane.repaint();
        } else if (eventObj instanceof JButton) {
            JButton eventBtn = (JButton) eventObj;
            int yy = (Integer) yearCombo.getSelectedItem();
            int mm = (Integer) monthCombo.getSelectedItem();
            if (eventBtn.equals(btn1)) {
                mm--;
                if (mm < 1) {
                    mm = 12;
                    yy--;
                }
            } else if (eventBtn.equals(btn2)) {
                mm++;
                if (mm > 12) {
                    mm = 1;
                    yy++;
                }
            }
            yearCombo.setSelectedItem(yy);
            monthCombo.setSelectedItem(mm);
        }
    }

    public void day(int year, int month) {
        Calendar date = Calendar.getInstance();
        date.set(year, month - 1, 1);
        int week = date.get(Calendar.DAY_OF_WEEK);
        int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int space = 1; space < week; space++) {
            datePane.add(new JLabel(""));
        }

        for (int day = 1; day <= lastDay; day++) {
            JLabel lbl = new JLabel(String.valueOf(day), JLabel.CENTER);
            cal.set(year, month - 1, day);
            int Week = cal.get(Calendar.DAY_OF_WEEK);
            lbl.setForeground(Week == 1 ? Color.red : (Week == 7 ? Color.BLUE : Color.black));
            datePane.add(lbl);
        }
    }

    static class CellRenderer extends JCheckBox implements ListCellRenderer<TodoItem> {
        @Override
        public Component getListCellRendererComponent(JList<? extends TodoItem> list, TodoItem value, int index, boolean isSelected, boolean cellHasFocus) {
            setSelected(value.isCompleted());
            setText(value.getName());
            setOpaque(true);
            setBackground(isSelected ? list.getSelectionBackground() : list.getBackground());
            setForeground(isSelected ? list.getSelectionForeground() : list.getForeground());
            return this;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TodoCalendar();
            }
        });
    }
}

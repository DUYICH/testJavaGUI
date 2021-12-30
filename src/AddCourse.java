import javax.swing.*;

public class AddCourse extends  JFrame {
    private JTextField code;
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JButton clearButton;
    private JPanel add;

    public AddCourse(String a){
        super(a);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(add);
        this.pack();

    }
    public void createUIComponents() {
        JFrame frame = new AddCourse("oke oke");
        frame.setVisible(true);
    }
}

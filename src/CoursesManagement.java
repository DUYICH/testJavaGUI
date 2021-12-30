import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoursesManagement extends JFrame {
    private JButton buttonDisplay;
    private JButton buttonAdd;
    private JButton searchCourse;
    private JButton exit;
    private JPanel management;

    public CoursesManagement() {
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddCourse addCourse = new AddCourse("okeoke");
                    addCourse.createUIComponents();
            }
        });
    }

    public CoursesManagement(String a){
        super(a);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(management);
        this.pack();

    }

    public static void main(String[] args) {
        JFrame frame = new CoursesManagement("oke oke");
        frame.setVisible(true
        );
    }
}

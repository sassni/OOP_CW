import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    public static void main(String[] args) {
        //    private int count = 0;
//    private JFrame frame;
//    private JLabel label;
//    private JPanel panel;

            JPanel panel = new JPanel();
            JFrame frame = new JFrame();
            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);

            panel.setLayout(null);

            JLabel userLabel = new JLabel("User Name");
            userLabel.setBounds(10, 20, 80, 25);
            panel.add(userLabel);

            JTextField userText = new JTextField(20);
            userText.setBounds(100, 20, 165, 25);
            panel.add(userText);

            JLabel passwordLable = new JLabel("Password");
            passwordLable.setBounds(10, 50, 80, 25);
            panel.add(passwordLable);

            JPasswordField passwordText = new JPasswordField();
            passwordText.setBounds(100, 50, 165, 25);
            panel.add(passwordText);

            JButton button = new JButton("Login");
            button.setBounds(10, 80, 80, 25);
            button.addActionListener(new GUI());
            panel.add(button);

            JLabel success = new JLabel();
            success.setBounds(10, 110, 300, 25);
            panel.add(success);


            frame.setVisible(true);

        }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
//        count++;
//        label.setText("Number of clicks: " + count);
    }
}

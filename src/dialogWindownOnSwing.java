import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dialogWindownOnSwing extends JFrame implements ActionListener {

    final int START_LOCATION = 300;
    final int WINDOW_WIDTH = 1000;
    final int WINDOW_HEIGHT = 1000;
    final String BTN_ENTER = "Enter";

    JTextPane dialogue;
    JTextField message;

    dialogWindownOnSwing(){
        setTitle("window for fourth homework on JavaTwo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HEIGHT);
        dialogue = new JTextPane();
        dialogue.setEditable(false);
        dialogue.setContentType("text/html");
        JScrollPane scrollBar = new JScrollPane(dialogue);
        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.X_AXIS));
        message = new JTextField();
        Font myFont = new Font("SansSerif", Font.BOLD, 20);
        message.setFont(myFont);
        message.addActionListener(this);
        JButton enter = new JButton(BTN_ENTER);
        enter.addActionListener(this);
        bp.add(message);
        bp.add(enter);
        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, bp);
        setVisible(true);
    }

    public static void main(String[] args){
        new dialogWindownOnSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (message.getText().trim().length() > 0) {
            try {
                StyledDocument doc = dialogue.getStyledDocument();
                doc.insertString(doc.getLength(), message.getText() + "\n", new SimpleAttributeSet());
            } catch(Exception ex) { }
        }
        message.setText("");
    }
}
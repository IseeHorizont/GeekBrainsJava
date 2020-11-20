import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextPane notes;
    JTextField enterNotes;
    int i = 1;

    public MyFrame(){
        setTitle("Simple Notes / Very simple toDolist");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 400, 500, 500);
        notes = new JTextPane();
        notes.setEditable(false);
        JScrollPane scrollBar = new JScrollPane(notes);
        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.X_AXIS));
        enterNotes = new JTextField();
        enterNotes.addActionListener(this);
        JButton enter = new JButton("Enter");
        enter.addActionListener(this);
        bp.add(enterNotes);
        bp.add(enter);
        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, bp);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (enterNotes.getText().trim().length() > 0) {
            StyledDocument doc = notes.getStyledDocument();
            try {
                doc.insertString(doc.getLength(), i + ": " + enterNotes.getText() + "\n",
                        new SimpleAttributeSet());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        i++;
        enterNotes.setText("");
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber extends JFrame implements ActionListener {

    private JPanel panel = new JPanel(new BorderLayout());
    private JPanel panelButtons = new JPanel(new FlowLayout());
    private JPanel panelBottom = new JPanel(new BorderLayout());
    private JButton button4 = new JButton("Start");
    private JButton button1 = new JButton("Lower");
    private JButton button2 = new JButton("Higher");
    private JButton button3 = new JButton("True");
    private JLabel comment = new JLabel("guess ..");
    private JLabel one= new JLabel("numbers");
    private int randomNumber;

    public GuessNumber() {
        super("Guess Number");
        button1.addActionListener(this);
        button2.addActionListener( this);
        button3.addActionListener(this);
        button3.addActionListener(this);
        add(buildWindow());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    private JComponent buildWindow() {
        panelButtons.add(button4);
        panelButtons.add(button3);
        panelButtons.add(button1);
        panelButtons.add(button2);

        panelBottom.add(panelButtons, BorderLayout.NORTH);
        panelBottom.add(comment, BorderLayout.SOUTH);
        panelBottom.add(one,BorderLayout.CENTER);
        panel.add(panelBottom, BorderLayout.SOUTH);
        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        int min = 1;
        int max = 100;

        int guesses = 0;
        boolean done = false;


        while(!done){
            int guess = min + (int)(Math.random() * (max - min + 1));
            guesses++;
            Object obj = e.getSource();
            if(obj.equals(button4)){
                one.setText("First guess is" +guess);
            }
            else if (obj.equals(button1)) {
                max = guess - 1;
                one.setText("My guess is" +max);
                }

                else if (obj.equals(button2)) {
                    min = guess + 1;
                one.setText("My guess is"+min);

                } else if (obj.equals(button3)) {

                    one.setText("Hooray!");
                    comment.setText("It took me " + guesses + " guesses to get it right. Thanks for playing!");
                 done = true;
                }
            }
        }
    private void setBackgroundColor(Color color) {
        panel.setBackground(color);
        panelBottom.setBackground(color);
        panelButtons.setBackground(color);
    }
}
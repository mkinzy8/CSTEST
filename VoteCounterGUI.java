
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterGUI
{
    private int width = 300;
    private int height = 400;
    private int jVotes;
    private JFrame frame;
    private JPanel panel;
    private JButton joe;
    private JLabel labelJoe;
    private int sVotes;
    private JFrame sframe;
    private JPanel spanel;
    private JButton sue;
    private JLabel labelSue;

    public VoteCounterGUI()
    {
        jVotes = 0;
        sVotes = 0;
        frame = new JFrame ("Total Vot");
    
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);


        joe = new JButton("Vote for Joe");
        sue = new JButton("Vote for Sue");
        joe.addActionListener(new JoeButtonListener());
        sue.addActionListener(new SueButtonListener());

        labelJoe = new JLabel("Joes Votes: " + jVotes);
        labelSue = new JLabel("Sues Votes: " + sVotes);
        panel = new JPanel();
        panel.setPreferredSize (new Dimension(width, height));
        panel.setBackground (Color.green);
        panel.add(joe);
        panel.add(labelJoe);
        panel.add(sue);
        panel.add(labelSue);
        frame.getContentPane().add (panel);
    }
    //-----------------------------------------------------------------
    //  Displays the primary application frame.
    //-----------------------------------------------------------------
    public void display()
    {
        frame.pack();
        frame.setVisible(true);
    }
    //***************************************************
    // Represents a listener for button push (action) events
    //***************************************************
    private class JoeButtonListener implements ActionListener
    {
        //----------------------------------------------
        // Updates the counter and label when Vote for Joe 
        // button is pushed
        //----------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            jVotes++;
            labelJoe.setText("Votes for Joe: " + jVotes);
        }
    }
     private class SueButtonListener implements ActionListener
    {
        //----------------------------------------------
        // Updates the counter and label when Vote for Joe 
        // button is pushed
        //----------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            sVotes++;
            labelSue.setText("Votes for Sue: " + sVotes);
        }
    }
}

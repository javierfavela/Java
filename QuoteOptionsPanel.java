//********************************************************************
//  QuoteOptionsPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of radio buttons.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuoteOptionsPanel extends JPanel
{
   private JLabel quote;
   private JRadioButton sad, angry, funny, happy;
   private String sadQuote, angryQuote, funnyQuote, happyQuote;

   //-----------------------------------------------------------------
   //  Sets up a panel with a label and a set of radio buttons
   //  that control its text.
   //-----------------------------------------------------------------
   public QuoteOptionsPanel()
   {
      sadQuote = "It may be stormy now, but it never rains forever!";
      angryQuote = "Don't be mad. Be even.";
      funnyQuote = "If you ran like your mouth, you'd be in good shape xD";
      happyQuote = "Exist to be happy, no to impress";

      quote = new JLabel (sadQuote);
      quote.setFont (new Font ("Helvetica", Font.BOLD, 34));

      sad = new JRadioButton ("Sad", true);
      sad.setBackground (Color.green);
     
      angry = new JRadioButton ("Angry");
      angry.setBackground (Color.green);
      
      funny = new JRadioButton ("Funny");
      funny.setBackground (Color.green);
      
      happy = new JRadioButton ("Happy");
      funny.setBackground(Color.CYAN);

      ButtonGroup group = new ButtonGroup();
      group.add (sad);
      group.add (angry);
      group.add (funny);
      group.add (happy);

      QuoteListener listener = new QuoteListener();
      sad.addActionListener (listener);
      angry.addActionListener (listener);
      funny.addActionListener (listener);
      happy.addActionListener (listener);

      add (quote);
      add (sad);
      add (angry);
      add (funny);
      add (happy);

      setBackground (Color.green);
      setPreferredSize (new Dimension(800, 600));
   }

   //*****************************************************************
   //  Represents the listener for all radio buttons
   //*****************************************************************
   private class QuoteListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Sets the text of the label depending on which radio
      //  button was pressed.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         Object source = event.getSource();

         if (source == sad)
         {
            quote.setText (sadQuote);
         }
         else
         {
        	 if (source == angry)
        	 {
        		 quote.setText (angryQuote);
        	 }
             else
             {
            	 if (source == funny)
            	 {
            		 quote.setText (funnyQuote);
            	 }
            	 else
            	 {
            		 quote.setText (happyQuote);
            	 }
             }
                 
         }
          
      }
   }
}

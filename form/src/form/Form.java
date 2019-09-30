/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author gitstein-prog5
 */
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.*;
/**
 *
 * @author gitstein-prog5
 */
  class Form extends JFrame implements ActionListener
{
 JPanel p= new JPanel();
 JTextArea ta=new JTextArea(20,60);
 JButton b= new JButton("choose");
 JButton b1= new JButton("Browse");
 JButton b2= new JButton("SAVE");
 JButton b3= new JButton("Print");
 JButton b4= new JButton("SPEaK");
 JMenuBar mb=new JMenuBar();
 JMenu m1=new JMenu("EDIT");
 JMenuItem mi1= new JMenuItem("CUT");
JMenuItem mi2= new JMenuItem("COPY");
JMenuItem mi3= new JMenuItem("PASTE");
JMenuItem mi4= new JMenuItem("EXIT");
 Form()
{
    setVisible(true);
    setSize(700,500);
    add(p);
    p.add(ta);
    p.add(b);
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(b4);
    b.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     mi1.addActionListener(this);
     mi2.addActionListener(this);
     mi3.addActionListener(this);
     mi4.addActionListener(this);
     setJMenuBar(mb);
     mb.add(m1);
     m1.add(mi1);
     m1.add(mi2);
     m1.add(mi3);
     m1.add(mi4);
     mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,Event.CTRL_MASK));
     mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK));
     mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,Event.CTRL_MASK));
     mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,Event.SHIFT_MASK));
} 
 
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
   Form f=new Form();
   
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    if(e.getSource()==b)
    {
        Color cl=null;
        Color clr=JColorChooser.showDialog(p,"Select any Color",cl);
        p.setBackground(clr);
    }
    else if(e.getSource()==b1)
    {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File fl=fc.getSelectedFile();
        try
        {
            FileInputStream fis =new FileInputStream(fl);
            int x=0;
            while((x=fis.read())!=-1)
            {
                char ch=(char)x;
                String str= Character.toString(ch);
                ta.append(str);
            }
            }
            catch(Exception c)
                    {
                    
        }
        
    
                
    }
    else if(e.getSource()==b2)
            {
                JFileChooser fc=new JFileChooser();
                fc.showSaveDialog(null);
                File fe=fc.getSelectedFile();
                try
                {
                String x=ta.getText();
                }
                catch(Exception c)
                {}
            }
    else if(e.getSource()==b3)
    {
        PrinterJob pj= PrinterJob.getPrinterJob();
        boolean bn= pj.printDialog();
        if(bn)
        {
            try
            {
                ta.print();
                
            }
            catch(Exception c)
            {
                System.out.println(c);
            }
        }
    }
    else if(e.getSource()==mi1)
            {
            ta.cut();
            }
    else if(e.getSource()==mi2)
            {
            ta.copy();
            }
    else if(e.getSource()==mi3)
            {
            ta.paste();
            }
    else if(e.getSource()==mi4)
            {
            System.exit(0);
            }
    else if (e.getSource()==b4)
    {
    String str="kevin";
    VoiceManager vm=VoiceManager.getInstance();
    Voice vc=vm.getVoice(str);
    vc.allocate();
    vc.speak(ta.getText());
    }
    }

}


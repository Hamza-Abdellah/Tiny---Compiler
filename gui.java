
package compilers;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.io.FileNotFoundException;



public class gui extends JFrame {
    JTextArea textArea;
    JTextArea textArea2;
    JButton jb1;
    File File;
    FileWriter f ;
    public gui()
    {
        setSize(700,1300);
        this.setLayout(null);
 textArea = new JTextArea(40,40); 
textArea.setBounds(0, 0, 200, 1300);
 jb1 = new JButton("compile");
jb1.setBounds(290, 250, 100, 50);
textArea2 = new JTextArea(40,40);
textArea2.setBounds(500, 0, 200, 1300);
this.add(textArea); 
this.add(jb1);
this.add(textArea2);
jb1.addActionListener(new execute1());

    }
  public class execute1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)  {
                
       
            try {
                
                f = new FileWriter("D:/code.txt");
                f.write(textArea.getText());
                f.close();
          
		 Scanner scanner= new Scanner(f);
                 textArea2.setText(scanner.analyze()+scanner.toString());
            
               
                
            } catch (IOException ex) {
                Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
}
  


package student.information;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


   public class STAGEONE extends student{
  
       
       
        
   private JFrame f;
    private JButton B;
    private JLabel lab;
    private JPanel p;

   private JButton b1;
   private JButton b2;
   private JButton b3;
   private FlowLayout layout;
   private Container container;
          
       
      public  STAGEONE (){
   
          GUI1();
          
      layout=new FlowLayout();
      container =getContentPane();
       setLayout(layout);
       b2=new JButton("STAGEONE");
       add(b2);
       
    }

       public void GUI1(){
       f=new JFrame();
       f.setVisible(true);
       f.setSize(300,300);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       p=new JPanel();
       p.setBackground(Color.yellow);
        
       
       B=new JButton("test");
       lab=new JLabel("this is stage1");
       
       p.add(B);
       p.add(lab);
       f.add(p);
       
       
       } 
      
      
      
    @Override
    public void actionPerformed(ActionEvent e) {
    b1.addActionListener(this);
    }
}


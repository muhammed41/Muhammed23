package student.information;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class student extends JFrame implements ActionListener{    
JPanel jp=new JPanel();
JLabel jl=new JLabel();
JTextField jt=new JTextField(20);

private JTextField tx1;
private  Font f1;
private  Font f2;
private  Font f3;
private  Font f4;
private JRadioButton ra1;
private JRadioButton ra2;
private JRadioButton ra3;
private JRadioButton ra4;
private ButtonGroup gr;

   private JFrame f;
    private JButton B;
    private JLabel lab;
    private JPanel p;

   private JButton b1;
   private JButton b2;
   private JButton b3;
   private FlowLayout layout;
   private Container container;
   
 
       
         
       
     
       public student(){
           
           
  setLayout(new FlowLayout());
  tx1=new JTextField("this is a program",20);
  add(tx1);
  ra1=new JRadioButton("plain",true);
  ra2=new JRadioButton("bold",false);
  ra3=new JRadioButton("italic",false);
  ra4=new JRadioButton("bold and italic",false);
 add(ra1);
 add(ra2);
 add(ra3);
 add(ra4);
 
 gr=new  ButtonGroup ();
 gr.add(ra1);
 gr.add(ra2);
 gr.add(ra3);
 gr.add(ra4);
   
 f1 =new Font("serif",Font.PLAIN,14);
 f2 =new Font("serif",Font.BOLD,14);
 f3 =new Font("serif",Font.ITALIC,14);
 f4 =new Font("serif",Font.BOLD+Font.ITALIC,14);
 
          
        GUI();
 setTitle("Homework");
 setVisible(true);
 setSize(500,400);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 jp.add(jt);
 jt.addActionListener(this);
 add(jp);
 
       layout=new FlowLayout();
       container =getContentPane();
       setLayout(layout);
       b1=new JButton("done");
       add(b1);
       }
      
       public void GUI(){
       f=new JFrame();
       f.setVisible(true);
       f.setSize(300,300);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       p=new JPanel();
       p.setBackground(Color.yellow);
        
       
       B=new JButton("test");
       lab=new JLabel("this is test");
       
       p.add(B);
       p.add(lab);
       f.add(p);
       
       
       } 
   
       @Override
       public void actionPerformed(ActionEvent e) {
       b1.addActionListener(this);
     }
    
     }   



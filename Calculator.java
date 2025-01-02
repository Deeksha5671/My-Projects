
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        MyScreen obj= new MyScreen();
    }
}
class MyScreen  {
     JFrame f1;
     JLabel l1;
     JButton b0, b1,b2,b3, b4,b5,b6, b7,b8,b9,bdot,badd, bsub,bmul,bdiv,bequ,bdel,bclr,bdec,bper;
     JTextField t1;
     MyScreen(){
        f1=new JFrame("Claculator");
        f1.setSize(350,440);
        f1.getContentPane().setLayout(null);
        f1.getContentPane().setBackground(Color.BLACK);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setlevel();
        f1.add(l1);
        setbutton();
        f1.add(b0);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);

        f1.add(b9);
        f1.add(bdot);
        f1.add(badd);
        f1.add(bsub);
        f1.add(bmul);
        f1.add(bdiv);
        f1.add(bdel);
        f1.add(bclr);
        f1.add(bdec);
        f1.add(bper);
        f1.add(bequ);
        settextfield();
        f1.add(t1);
        f1.setVisible(true);
     }
     void setlevel(){
        l1=new JLabel();
        l1.setBounds(260,80,150,80);    
        l1.setForeground(Color.white);     
     }
     void setbutton(){
        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        bdot=new JButton(".");
        badd=new JButton("+");
        bsub=new JButton("-");
        bmul=new JButton("*");
        bdiv=new JButton("/");
        bequ=new JButton("=");
        bdel=new JButton("DEL");
        bclr=new JButton("Clr");
        bdec=new JButton(".");
        bper=new JButton("%"); 
        b9.setBounds(140, 120, 50, 50);
        b9.setFont(new Font("Arial",Font.BOLD,20));
        b9.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"9");
         }
      }); 
      b8.setBounds(80, 120, 50, 50);
      b8.setFont(new Font("Arial",Font.BOLD,20));
      b8.addActionListener(new ActionListener() {
       public  void actionPerformed(ActionEvent e){
          t1.setText(t1.getText()+"8");
       }
    }); 
      b7.setBounds(20, 120,50, 50);
      b7.setFont(new Font("Arial",Font.BOLD,20));
      b7.addActionListener(new ActionListener() {
       public  void actionPerformed(ActionEvent e){
          t1.setText(t1.getText()+"7");
       }
    });
        b6.setBounds(140, 190, 50, 50);
        b6.setFont(new Font("Arial",Font.BOLD,20));
        b6.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"6");
         }
      }); 
        b5.setBounds(80, 190, 50, 50);
        b5.setFont(new Font("Arial",Font.BOLD,20));
        b5.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"5");
         }
      }); 
      b4.setBounds(20, 190, 50, 50);
      b4.setFont(new Font("Arial",Font.BOLD,20));
      b4.addActionListener(new ActionListener() {
       public  void actionPerformed(ActionEvent e){
          t1.setText(t1.getText()+"4");
       }
    }); 
        b1.setBounds(20, 260, 50, 50);

        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"1");
         }
      }); 
        b3.setBounds(140, 260, 50, 50);
        b3.setFont(new Font("Arial",Font.BOLD,20));
        b2.setBounds(80, 260, 50, 50);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"2");
         }
      }); 
        b3.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"3");
         }
      });   
        badd.setBounds(200, 120, 50, 50);
        badd.setFont(new Font("Arial",Font.BOLD,20));
        badd.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"+");
         }
      }); 
        bsub.setBounds(200, 190, 50, 50);
        bsub.setFont(new Font("Arial",Font.BOLD,20));
        bsub.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"-");
         }
      }); 
        bmul.setBounds(200, 260, 50, 50);
        bmul.setFont(new Font("Arial",Font.BOLD,20));
        bmul.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"*");
         }
      }); 
        bdiv.setBounds(200, 320, 50, 50);
        bdiv.setFont(new Font("Arial",Font.BOLD,20));
        bdiv.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"/");
         }
      }); 
      b0.setBounds(80,320,50,50);
      b0.setFont(new Font("Arial",Font.BOLD,20));
      b0.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"0");
         }
      }); 
      bdec.setBounds(20,320,50,50);
      bdec.setFont(new Font("Arial",Font.BOLD,20));
      bdec.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+".");
         }
      }); 
      bper.setBounds(140,320,50,50);
      bper.setFont(new Font("Arial",Font.BOLD,20));
      bper.addActionListener(new ActionListener() {
         public  void actionPerformed(ActionEvent e){
            t1.setText(t1.getText()+"%");
         }
      }); 
             // Equals Button
             bequ.setBounds(260, 120, 50, 80);
             bequ.setFont(new Font("Arial", Font.BOLD, 20));
             bequ.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                     String s = t1.getText();
                     String a = "";
                     String b = "";
                     char op = 'x';
     
                     for (int i = 0; i < s.length(); i++) {
                         if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*') {
                             op = s.charAt(i);
                             a = s.substring(0, i);
                             b = s.substring(i + 1);
                         }
                     }
     
                     int x = Integer.parseInt(a);
                     int y = Integer.parseInt(b);
                     int c = 0;
     
                     switch (op) {
                         case '+':
                             c = x + y;
                             break;
                         case '-':
                             c = x - y;
                             break;
                         case '*':
                             c = x * y;
                             break;
                         case '/':
                             if (y != 0) {
                                 c = x / y;
                             } else {
                                 t1.setText("Error");
                                 return;
                             }
                             break;
                     }
     
                     t1.setText(Integer.toString(c));
                 }
             });
     
             // Clear Button
             bclr.setBounds(260, 210, 50, 80);
             bclr.setFont(new Font("Arial", Font.BOLD, 20));
             bclr.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                     t1.setText("");
                 }
             });
         }
      
   
   void settextfield(){
      t1=new JTextField();
        t1.setBounds(20, 50, 280,50);
        t1.setFont(new Font("Arial",Font.BOLD,30));
        t1.setEditable(false);
     }
}
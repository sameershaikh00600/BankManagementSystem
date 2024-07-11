
package bankmanagementsystem;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class signup3 extends JFrame implements ActionListener {
    String formno;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
     JPasswordField pf2;
     JButton    Button1,   Button2,bt3;
     JCheckBox    checkbox1,   checkbox2,   checkbox3,   checkbox4,   checkbox5,   checkbox6,   checkbox7;
     JRadioButton    Radio1,   Radio2,   Radio3,   Radio4;
     signup3( String formno)
    {   this.formno=formno;
    //setVisible(true);
    setLayout(null);
         setTitle("new Account Application form- page 3");
            l1=new JLabel   ("Page 3 :  Account Details");
        l1.setFont(new Font("Ralway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
            l2=new   JLabel ("Account type :");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        l2.setBounds(100,140,200,30);
        add(l2);
        setVisible(true);
            l3=new  JLabel  ("card Number :");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100,300,200,30);
        add(l3);
            l4=new  JLabel  ("xxxxxxx xxxxxxx xxx4148");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(330,300,250,30);
        add(l4);
          l5=new  JLabel ("your 16 digit card number");
        l5.setFont(new Font("Releway",Font.BOLD,18));
        l5.setBounds(100,330,200,20);
        l6=new JLabel("It would be appear on check/ATM/Statement");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds( 330,330,500,20);
        add(l6);
        l7=new JLabel("PIN");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100,370,200,30);
        add(l7);
        l8=new JLabel("xxxx");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(330,370,200,30);
        add(l8);
        l9=new JLabel("4 digit password");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100,400,200,20);
        add(l9);
        l10=new JLabel("Services Required :");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100,450,200,30);
        add(l10);
        
        
        l11=new JLabel("form no");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(700,10,70,30);
        add(l11);
        
        l12=new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD, 18));
        l12.setBounds(770,10,40,30);
        add(l12);
//        pf2=new JPasswordField(15);
//        pf2.setFont(new Font("Ariel",Font.BOLD,14));
//        pf2.setBounds(300,220,230,30);
//        add(pf2);
      Button1=new JButton("submit");
      Button1.setFont(new Font("Raleway",Font.BOLD,14));
      Button1.setBackground(Color.BLACK);
      Button1.setForeground(Color.WHITE);
   
   
       Button2 = new JButton("Cancel");
           Button2.setFont(new Font("Raleway", Font.BOLD, 14));
           Button2.setBackground(Color.BLACK);
           Button2.setForeground(Color.WHITE);
            Button1.setBounds(250,720,100,30);
             Button2.setBounds(420,720,100,30);
        add(Button1);
            add(Button2);
           checkbox1 = new JCheckBox("ATM CARD");
           checkbox1.setBackground(Color.WHITE);
           checkbox1.setFont(new Font("Raleway", Font.BOLD, 16));
         
           checkbox1.setBounds(100,500,200,30);
        add(checkbox1);
        
           checkbox2 = new JCheckBox("Internet Banking");
           checkbox2.setBackground(Color.WHITE);
           checkbox2.setFont(new Font("Raleway", Font.BOLD, 16));
        
           checkbox2.setBounds(350,500,200,30);
        add(checkbox2);
        
            checkbox3 = new JCheckBox("Mobile Banking");
           checkbox3.setBackground(Color.WHITE);
           checkbox3.setFont(new Font("Raleway", Font.BOLD, 16));
           checkbox3.setBounds(100,550,200,30);
        add(   checkbox3);
        
              checkbox4 = new JCheckBox("EMAIL Alerts");
           checkbox4.setBackground(Color.WHITE);
           checkbox4.setFont(new Font("Raleway", Font.BOLD, 16));
           checkbox4.setBounds(350,550,200,30);
        add(   checkbox4);
        
        
             checkbox5 = new JCheckBox("Cheque Book");
           checkbox5.setBackground(Color.WHITE);
           checkbox5.setFont(new Font("Raleway", Font.BOLD, 16));
            checkbox5.setBounds(100,600,200,30);
        add(   checkbox5);
        
              checkbox6 = new JCheckBox("E-Statement");
           checkbox6.setBackground(Color.WHITE);
           checkbox6.setFont(new Font("Raleway", Font.BOLD, 16));
            checkbox6.setBounds(350,600,200,30);
        add(   checkbox6);
        
            checkbox7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
           checkbox7.setBackground(Color.WHITE);
           checkbox7.setFont(new Font("Raleway", Font.BOLD, 12));
            checkbox7.setBounds(100,680,600,20);
        add(checkbox7);
             Radio1 = new JRadioButton("Saving Account");
           Radio1.setFont(new Font("Raleway", Font.BOLD, 16));
           Radio1.setBackground(Color.WHITE);
        
            Radio2 = new JRadioButton("Fixed Deposit Account");
           Radio2.setFont(new Font("Raleway", Font.BOLD, 16));
           Radio2.setBackground(Color.WHITE);
        
            Radio3 = new JRadioButton("Current Account");
           Radio3.setFont(new Font("Raleway", Font.BOLD, 16));
           Radio3.setBackground(Color.WHITE);
        
        
            Radio4 = new JRadioButton("Recurring Deposit Account");
           Radio4.setFont(new Font("Raleway", Font.BOLD, 16));
           Radio4.setBackground(Color.WHITE);
        
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(   Radio1);
        groupgender.add(   Radio2);
        groupgender.add(   Radio3);
        groupgender.add(   Radio4);
        setLayout(null);
         getContentPane().setBackground(Color.WHITE);
         setSize(850,850);
        setLocation(500,120);
        //setVisible(true);
          Button1.addActionListener(this);
        Button2.addActionListener(this);
        
        
        
        
//        Button1.addActionListener(this);
//        Button2.addActionListener(this);
        
        
        
        
        
    }
     
     public void actionPerformed(ActionEvent e)
     {  String radio=null;
     if(Radio1.isSelected())
     {  
         radio="saving account";
     }
     else if(Radio2.isSelected())
     {
         radio="Fixed Deposit Account";
     }
     else if(Radio3.isSelected())
     {
         radio="Current Account";
     }
     else
     {
      radio="Recurring Deposit Account";
     }
         
         Random random=new Random();
         String cardNumber= ""+Math.abs((random.nextLong() %90000000L))+5040936000000000L;
         String pinNumber= ""+Math.abs((random.nextLong() %90000000L))+1000L;
         String facility="";
         if(checkbox1.isSelected())
         {
             facility=facility + "ATM CARD";
         }
         else if(checkbox2.isSelected())
         {
           facility=facility+"Internet Banking";
           
         }
         else if(checkbox3.isSelected())
         {
            facility=facility +"Mobile Banking";
         }
         else if(checkbox4.isSelected())
         {
             facility=facility+"Email & sms Alerts";
         }
         else if(checkbox5.isSelected())
         {
            facility=facility+"cheque book";
         }
          else if(checkbox6.isSelected())
         {
            facility=facility+"K statement";
         }
         
         try{
         
if(e.getSource()==Button1)
{
          if(radio.equals(""))
             {
             JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }
          else
          {
          conn c1=new conn();
         // String q1="insert into signup3 values('"+formno+"','"+radio+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
            String q1 ="insert into signup3 values('" + formno + "','" + radio + "','" + cardNumber + "','" + pinNumber + "','" + facility + "')";

          c1.stmt.executeUpdate(q1);
          }
         }
else if(e.getSource()==Button2) System.exit(0);
         }
         catch(Exception s)
         {
        // System.out.println(e);}
             s.printStackTrace();
         }
     }
    public static void main(String[] args)
    {
       // new signup3("1123");
    }
    
}

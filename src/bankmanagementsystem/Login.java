
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton signup,clear,login;
    JTextField pintp,cardtf;
    Login()
    {
        setTitle("ATM");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        JLabel label=new JLabel(i1);
        add(label);
         Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
         JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        add(l11);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        JLabel text= new JLabel("Welcome To ATM");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        add(text);
        JLabel cardno=new JLabel("Card NO :");
        cardno.setFont(new Font("Railway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        cardtf=new JTextField();
        cardtf.setBounds(300,150,250,30);
        add(cardtf);
        
        JLabel pin=new JLabel("Pin :");
        pin.setFont(new Font("Railway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
       pintp=new JPasswordField();
        pintp.setBounds(300,220,250,30);
        add(pintp); 
         login =new JButton ("sign in");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
         clear= new JButton("Clear");
        clear.setBounds(450,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
         signup= new JButton("signup");
        signup.setBounds(300,350,200,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
    }
    @Override
      public void actionPerformed(ActionEvent ae){
          if(ae.getSource()==clear)
          {
              cardtf.setText("");
              pintp.setText("");
        }
          else if(ae.getSource()==signup)
          {
            setVisible(false);
            new signup().setVisible(true);
          
          }
              
      }
    
    public static void main(String[] args)
    {
        
       new Login();
        //new signup().setVisible(false);
       // new signup3().setVisible(false);
        
        
    }

}

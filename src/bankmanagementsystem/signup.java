
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
 import java.util.*;
import java.awt.event.*;
public class signup  extends JFrame implements ActionListener{
long random;
JTextField nametxt,ftxt,adrxt,emailtxt,citytxt,pintxt,statetxt,dbtext;
JRadioButton male,female;
JButton next;



    //JLabel formno= new JLabel("Application from no .");
    signup()
    { 
        setLayout(null);
        Random ran=new Random();
  random=Math.abs((ran.nextLong() %9000L)+1000L);
JLabel formno= new JLabel("Application from no ."+random);
formno.setBounds(140,20,600,40);
formno.setFont(new Font("Raleway",Font.BOLD,38));

add(formno);

JLabel personalDetails =new JLabel("Page 1: personal Details :"+random);
personalDetails.setFont(new Font ("Raleway",Font.BOLD,38));
personalDetails.setBounds(180,80,600,50);
add(personalDetails);
JLabel name=new JLabel("Name :");
name.setBounds(100,140,100,30);
name.setFont(new Font("Raleway",Font.BOLD,20));
add(name);

nametxt=new JTextField();
nametxt.setFont(new Font("Raleway",Font.BOLD,14));
nametxt.setBounds(300,140,400,30);
add(nametxt);

JLabel fathername= new JLabel("Father name :");
fathername.setBounds(100,190,200,30);
fathername.setFont(new Font("Raleway",Font.BOLD,20));
add(fathername);
ftxt=new JTextField();
ftxt.setFont(new Font("Raleway",Font.BOLD,14));
ftxt.setBounds(300,190,400,30);
add(ftxt);

JLabel dob= new JLabel("dob :");
dob.setFont(new Font("Raleway",Font.BOLD,20));
dob.setBounds(100,240,100,30);
add(dob);

dbtext=new JTextField();
dbtext.setBounds(300,240,100,30);
dbtext.setFont(new Font("Raleway",Font.BOLD,14));
add(dbtext);


//java.util.JDateChooser dbxt=new JDateChooser();
////dbxt.setFont(new Font("Raleway",Font.BOLD,14));
//dbxt.setBounds(300,240,400,30);
//add(dbxt);


JLabel address= new JLabel("address :");
address.setBounds(100,290,100,30);
address.setFont(new Font("Raleway",Font.BOLD,20));
add(address);

 adrxt=new JTextField();
adrxt.setFont(new Font("Raleway",Font.BOLD,14));
adrxt.setBounds(300,290,400,30);
add(adrxt);

JLabel email= new JLabel("Mail id :");
email.setBounds(100,340,200,30);
email.setFont(new Font("Raleway",Font.BOLD,20));
add(email);

 emailtxt=new JTextField();
emailtxt.setFont(new Font("Raleway",Font.BOLD,14));
emailtxt.setBounds(300,340,400,30);
add(emailtxt);

JLabel city= new JLabel("city:");
city.setBounds(100,390,200,30);
city.setFont(new Font("Raleway",Font.BOLD,20));
add(city);


 citytxt=new JTextField();
citytxt.setFont(new Font("Raleway",Font.BOLD,14));
citytxt.setBounds(300,390,400,30);
add(citytxt);

JLabel state= new JLabel("state :");
state.setBounds(100,440,200,30);
state.setFont(new Font("Raleway",Font.BOLD,20));
add(state);

 statetxt=new JTextField();
statetxt.setFont(new Font("Raleway",Font.BOLD,14));
statetxt.setBounds(300,440,400,30);
add(statetxt);

JLabel pincode= new JLabel("Pincode :");
pincode.setBounds(100,490,200,30);
pincode.setFont(new Font("Raleway",Font.BOLD,20));
add(pincode);

pintxt=new JTextField();
pintxt.setFont(new Font("Raleway",Font.BOLD,14));
pintxt.setBounds(300,490,400,30);
add(pintxt);

JLabel gender=new JLabel("Gender");
gender.setBounds(100,540,200,30);
gender.setFont(new Font("Raleway",Font.BOLD,20));
add(gender);
  male= new JRadioButton("male");
 male.setBounds(300,540,60,30);
 add(male);
 female=new JRadioButton("female");
 female.setBounds(370,540,60,30);
 add(female);
 ButtonGroup gndr=new ButtonGroup();
 gndr.add(male);
 gndr.add(female);
  next=new JButton("next");
 next.setBackground(Color.BLACK);
 next.setFont(new Font("raleway",Font.BOLD,14));
next.setForeground(Color.WHITE);
next.setBounds(620,660,80,30);
next.addActionListener(this);
add(next);


getContentPane().setBackground(Color.WHITE);
setSize(850,800);
setLocation(350,10);
setVisible(true);

}
     public void  actionPerformed(ActionEvent e)
   { 
       //enter those values which you eant to enterr in db
       String formno=""+random;
       String name=nametxt.getText();
       String fathername=ftxt.getText();
       String dob=dbtext.getText();
       String gender=null;
       if(male.isSelected())
       {
           gender="male";
           
       }
       else if(female.isSelected())
       {
           gender="fenmale";
       }
       String email=emailtxt.getText();
       String address=adrxt.getText();
       String city=citytxt.getText();
       String pincode=pintxt.getText();
       String state=statetxt.getText();
       try
       {
           conn c1=new conn();
            String query= "insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
           c1.stmt.executeUpdate(query);
           setVisible(false);
           new signup2(formno).setVisible(true);
           
           
       }  
       catch (Exception f)
       {
           System.out.println(f);
       }
       
       
   }
}


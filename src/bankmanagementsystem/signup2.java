
 




package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
 import java.util.*;
import java.awt.event.*;
public class signup2 extends JFrame implements ActionListener{
long random;
JTextField nametxt,ftxt,adrxt,emailtxt,citytxt,pintxt,statetxt,dbtext;
JRadioButton syes,syno;
JButton next;
JComboBox religion,categori;
//JcomboBox religion;



    //JLabel formno= new JLabel("Application from no .");
    signup2( String formno)
    { 
        setLayout(null);
        //Random ran=new Random();
  //random=Math.abs((ran.nextLong() %9000L)+1000L);
//JLabel formno= new JLabel("Application from no .");
//formno.setBounds(140,20,600,40);
//formno.setFont(new Font("Raleway",Font.BOLD,38));

//add(formno);
setTitle("APLICATION FORM PAGE-2");

JLabel additionaldetails =new JLabel("Page 2: additional details");
 additionaldetails.setFont(new Font ("Raleway",Font.BOLD,38));
additionaldetails.setBounds(180,80,600,50);
add(additionaldetails);

JLabel name=new JLabel("Religion");
name.setBounds(100,140,100,30);
name.setFont(new Font("Raleway",Font.BOLD,20));
add(name);
 String relarray[]={"select","Islam","hindu","sikh","Isai","Jain"};
  religion=new JComboBox(relarray);
//religion.setFont(new Font("Raleway",Font.BOLD,14));
religion.setBounds(300,140,400,30);
add(religion);

JLabel fathername= new JLabel("Educationdetails");
fathername.setBounds(100,190,200,30);
fathername.setFont(new Font("Raleway",Font.BOLD,20));
add(fathername);
ftxt=new JTextField();
ftxt.setFont(new Font("Raleway",Font.BOLD,14));
ftxt.setBounds(300,190,400,30);
add(ftxt);

JLabel dob= new JLabel("category:");
dob.setFont(new Font("Raleway",Font.BOLD,20));
dob.setBounds(100,240,100,30);
add(dob);
String [] cat={"General","obc","sc","St","other"};
 categori =new JComboBox(cat);
categori.setBounds(300,240,100,30);
add(categori);




//java.util.JDateChooser dbxt=new JDateChooser();
////dbxt.setFont(new Font("Raleway",Font.BOLD,14));
//dbxt.setBounds(300,240,400,30);
//add(dbxt);


JLabel address= new JLabel("aadhar no");
address.setBounds(100,290,100,30);
address.setFont(new Font("Raleway",Font.BOLD,20));
add(address);

 adrxt=new JTextField();
adrxt.setFont(new Font("Raleway",Font.BOLD,14));
adrxt.setBounds(300,290,400,30);
add(adrxt);

JLabel email= new JLabel("PAN NO");
email.setBounds(100,340,200,30);
email.setFont(new Font("Raleway",Font.BOLD,20));
add(email);

 emailtxt=new JTextField();
emailtxt.setFont(new Font("Raleway",Font.BOLD,14));
emailtxt.setBounds(300,340,400,30);
add(emailtxt);

JLabel city= new JLabel("Income");
city.setBounds(100,390,200,30);
city.setFont(new Font("Raleway",Font.BOLD,20));
add(city);


 citytxt=new JTextField();
citytxt.setFont(new Font("Raleway",Font.BOLD,14));
citytxt.setBounds(300,390,400,30);
add(citytxt);

JLabel state= new JLabel("Senior citizen");
state.setBounds(100,440,200,30);
state.setFont(new Font("Raleway",Font.BOLD,20));
add(state);


// statetxt=new JTextField();
//statetxt.setFont(new Font("Raleway",Font.BOLD,14));
//statetxt.setBounds(300,440,400,30);
//add(statetxt);
syes=new JRadioButton("yes");
syes.setBounds(300,440,100,30);
add(syes);
 syno =new JRadioButton("No");
 syno.setBounds(500,440,100,30);
 add(syno);
//JLabel gender=new JLabel("Gender");
//gender.setBounds(100,540,200,30);
//gender.setFont(new Font("Raleway",Font.BOLD,20));
//add(gender);
//  male= new JRadioButton("male");
// male.setBounds(300,540,60,30);
// add(male);
// female=new JRadioButton("female");
// female.setBounds(370,540,60,30);
// add(female);
// ButtonGroup gndr=new ButtonGroup();
// gndr.add(male);
// gndr.add(female);
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
       //enter those values which you want to enterr in db
    String formno=" "+random;
       String myreligion= (String) religion.getSelectedItem();
       String edu_details=ftxt.getText();
       String mycat=(String) categori.getSelectedItem();

       String aadharno=adrxt.getText();
       String panno=emailtxt.getText();
       String income=citytxt.getText();
       
       String ciniorcitizens=null;
       
       if(syes.isSelected())
       {
           ciniorcitizens="yes";
       }
       else if(syno.isSelected())
       {
       ciniorcitizens="no";
       }
       
       try
       {
           conn c2=new conn();
            String q2= "insert into signup2 values('"+myreligion+"','"+mycat+"','"+panno+"','"+aadharno+"','"+income+"','"+ciniorcitizens+"','"+edu_details+"')";
           c2.stmt.executeUpdate(q2);
           
           
           
       }  
       catch (Exception f)
       {
           System.out.println(f);
       }
       
       
   }
}


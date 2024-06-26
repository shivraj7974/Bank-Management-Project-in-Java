package bank.management.systems;

import javax.swing.*; //* can import all the packages of swing
 import javax.swing.ImageIcon;   //swing come from extended package of Java i.e. javax
import java.awt.*;
import java.awt.event.*;        //for actionlistener

public class Login extends JFrame implements ActionListener{  // action listener is an interface
   
    
    
    JButton login, signup, clear;      //define globaly so that we can access them outside of the constructor
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    
    
    Login(){                     //CONSTRUCTOR
       setTitle("AUTOMATED TELLER MACHINE");                  //title on frame
       setLayout(null);   //for custom layout for image
       
       ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("Images/logo.jpg"));
       Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel label = new JLabel(i3);
       label.setBounds(70,10,100,100);
       
       add(label);
       
       
       JLabel text =new JLabel("Welcome to Shivraj's ATM");
       text.setFont(new Font("Osward",Font.BOLD,  38));
       text.setBounds(200,40,480,50);
       add(text);
       
       
        JLabel cardno =new JLabel("Card No:");
       cardno.setFont(new Font("Raleway",Font.BOLD,  28));
       cardno.setBounds(120,150,150,30);
       add(cardno);
       
       
        cardTextField = new JTextField();   //text field for entering something
        cardTextField.setBounds(300,155,250,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14)); //for font written in textfields
        add(cardTextField);
        
        
        JLabel pin =new JLabel("PIN:");
       pin.setFont(new Font("Raleway",Font.BOLD,  28));
       pin.setBounds(120,245,250,50);
       add(pin);
       
        pinTextField = new JPasswordField();   //text field for entering something to pin no
        pinTextField.setBounds(300,255,250,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14)); //for font written in textfields
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,330,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);    //for outside of black button in white
        login.addActionListener(this);       //for catching the button event we use this funtion
        add(login);
        
        
        clear = new JButton("clear");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);    //for outside of black button in white
        clear.setBounds(450,330,100,30);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);    //for outside of black button in white
        signup.setBounds(300,400,250,30);
        signup.addActionListener(this);
        add(signup);

       
       
       
      getContentPane().setBackground(Color.WHITE);
       
       
        setSize(800, 480);                                     //(Length,breadth) of frame
        setVisible(true);
        setLocation(350,  200);
    }
       
    public void actionPerformed(ActionEvent ae){
                                                            //what happen after clicking on button
    if(ae.getSource()==clear)
            {
                cardTextField.setText("");
                pinTextField.setText("");

            }else if(ae.getSource()==login)
                {
                
                
                } else if(ae.getSource()==signup)
                {
                
                
               }
    }
    
    public static void main(String args[]) {
        new Login();                                              //OBJECT
        
    }
}

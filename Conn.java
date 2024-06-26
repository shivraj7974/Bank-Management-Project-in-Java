//JDBC connectivity 
//it have 5 steps which are  (1->Register the Driver,2->create connection,3->create statement
//4->execute query, // 5->close connection

package bank.management.systems;

import java.sql.*;

public class Conn {

      Connection c;
      Statement s;
    public Conn(){                               //constructor
        try{          //use exceptional handling because mysql is extended platform so may be there are chances of error 
            
       
        //for creating connection
         c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Shivrajsingh");
        }catch (Exception e){
            System.out.println(e);             //error print here
        }
        
    }

    
    }


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Client 
{
   public static void main(String[] args) throws Exception
   {//System.setProperty("java.rmi.server.hostname","localhost");
       Scanner sc=new Scanner(System.in);
       System.out.println("enter server name");
       String serverName=sc.next();
       System.out.println("enter port no");
       int portNo=sc.nextInt();
       System.out.println("enter user id and password");
       String userId=sc.next();
       String password=sc.next();
       Registry reg= LocateRegistry.getRegistry(serverName, portNo);
       LoginInterface li=(LoginInterface)reg.lookup("AUTH");
       
       boolean output=li.check(userId, password);
       if(output)
       {
           
           JOptionPane.showMessageDialog(null,"Welcome");
       }
       else
       {
System.out.println("thats invalid man/woman!!!!!!");
           System.exit(0);
       }
      
    
}
}
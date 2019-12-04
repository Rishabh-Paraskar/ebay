
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server 
{
    public static void main(String[] args) throws Exception
    {
       //System.setProperty("java.rmi.server.hostname","localhost");
        Registry reg=LocateRegistry.createRegistry(200);
        System.out.println("server is ready");
        CheckLogin cl=new CheckLogin();
        reg.bind("AUTH", cl);
        
   
}
    
}


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CheckLogin  extends UnicastRemoteObject implements  LoginInterface
{

CheckLogin()    throws RemoteException
{
    
}
    
    @Override
    public boolean check(String uId, String pwd) throws RemoteException 
    {
    if(uId.equals("abc") && pwd.equals("abc"))
        return true;
    else
        return false;
    }


}

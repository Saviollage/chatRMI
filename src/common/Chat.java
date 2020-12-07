package common;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
public interface Chat extends Remote {
    public Integer sendMessage(String message) throws RemoteException; 
    public String readMessage() throws RemoteException; 
     public ArrayList<String> getMessages(Integer index) throws RemoteException;
} 
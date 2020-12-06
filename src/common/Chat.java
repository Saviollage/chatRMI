package common;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Chat extends Remote {
    public void sendMessage(String message, String author) throws RemoteException; 
    public String readMessage() throws RemoteException; 
} 
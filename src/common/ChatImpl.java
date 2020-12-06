package common;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ChatImpl extends UnicastRemoteObject implements Chat {
    private static String SERVER = "localhost";
    private final static Integer PORT = 3000;
    private static String ROUTE = "chat";
    private String recivedMessage = "--";

    public static String getURI(){
        String uri = String.format("rmi://" + SERVER + ":" + PORT + "/" + ROUTE);
        return uri;
    }
    public ChatImpl() throws RemoteException {
        super();
    }
    public void sendMessage(String message, String author) throws RemoteException {
        recivedMessage = "[" + author + "]: " + message;
        System.out.println(recivedMessage);
    }
    public String readMessage() throws RemoteException {
        return recivedMessage;
    }
}
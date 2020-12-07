package common;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
public class ChatImpl extends UnicastRemoteObject implements Chat {
    private static String SERVER = "localhost";
    private final static Integer PORT = 3000;
    private static String ROUTE = "chat";
    private String recivedMessage;
    private ArrayList<String> messages = new ArrayList<String>();
    public static String getURI(){
        String uri = String.format("rmi://" + SERVER + ":" + PORT + "/" + ROUTE);
        return uri;
    }
    public ChatImpl() throws RemoteException {
        super();
    }
    public Integer sendMessage(String message) throws RemoteException {
        recivedMessage = message;
        System.out.println(recivedMessage);
        messages.add(recivedMessage);
        return messages.size() -1;
    }
    public String readMessage() throws RemoteException {
        return recivedMessage;
    }
    public ArrayList<String> getMessages(Integer index) throws RemoteException {
        ArrayList<String> aux = new ArrayList<String>();
        for(Integer i=index; i< messages.size();i++)
        {
            aux.add(messages.get(i));
        }
        return aux;
    }
}
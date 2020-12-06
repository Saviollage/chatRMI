package server;
import common.Chat;
import common.ChatImpl;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatServer {
    public ChatServer() throws RemoteException, MalformedURLException {
        try{
            Chat chat = (Chat) new ChatImpl();
            Naming.rebind(ChatImpl.getURI(), (Remote) chat);
        } catch (Exception e){
            System.out.println("Erro: "+e);
        }
    }
    public static void main(String[] args){
        try {
            
            System.out.println("[Server] Iniciando servidor " + ChatImpl.getURI());
            ChatServer cs = new ChatServer();
        } catch (Exception e) {
            System.out.println("Erro: "+e);        
        }
    }
    
    
}
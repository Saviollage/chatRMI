package client;
import common.Chat;
import common.ChatImpl;
import java.rmi.Naming;
import java.util.Scanner;
import java.util.ArrayList;
public class ChatClient {
    public static void main(String[] args) {
        try{
            Chat server = (Chat) Naming.lookup(ChatImpl.getURI());
            Scanner scanner = new Scanner(System.in);
            String message;
            ArrayList<Integer> index = new ArrayList<Integer>();
            index.add(0);
            System.out.println("Bem vindo ao nosso chat! Primeiro digite seu nickname: ");
            String author = scanner.nextLine();
            System.out.println("Beleza, " + author + " digite aqui sua messagem: ");
            
            while (true) {  
                System.out.print("[" + author + "]: ");             
                message = scanner.nextLine();
                server.sendMessage("[" + author + "]: " + message);
                // Integer cIndex = server.sendMessage("[" + author + "]: " + message);
                // index.add(cIndex);
                // for (String m: server.getMessages(index.get(index.size() - 2)))
                // {
                //     System.out.println(m);
                // }

            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        
    }
    
}
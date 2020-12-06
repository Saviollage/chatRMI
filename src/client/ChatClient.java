package client;
import common.Chat;
import common.ChatImpl;
import java.rmi.Naming;
import java.util.Scanner;
public class ChatClient {
    public static void main(String[] args) {
        try{
            Chat client = (Chat) Naming.lookup(ChatImpl.getURI());
            Scanner scanner = new Scanner(System.in);
            String message;
            System.out.println("Olá, bem vindo ao nosso chat, primeiro digite seu nickname: ");
            String author = scanner.nextLine();
            System.out.println("Beleza, " + author + " para começar, digite aqui sua messagem: ");
            while (true) {               
                System.out.println(client.readMessage());
                message = scanner.nextLine();
                client.sendMessage(message, author);

            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        
    }
    
}
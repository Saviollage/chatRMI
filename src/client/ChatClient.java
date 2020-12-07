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
            System.out.println("Bem vindo ao nosso chat! Primeiro digite seu nickname: ");
            String author = scanner.nextLine();
            System.out.println("Beleza, " + author + " digite aqui sua messagem: ");
            while (true) {               
                message = scanner.nextLine();
                client.sendMessage(message, author);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        
    }
    
}
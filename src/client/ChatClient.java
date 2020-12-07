package client;
import common.Chat;
import common.ChatImpl;
import java.io.IOException;
import java.rmi.Naming;
import java.util.Scanner;
import java.util.ArrayList;
public class ChatClient {
    public static void main(String[] args) {
        try{
            Chat server = (Chat) Naming.lookup(ChatImpl.getURI());
            Scanner scanner = new Scanner(System.in);
            String message;
            System.out.println("Bem vindo ao nosso chat! Primeiro digite seu nickname: ");
            String author = scanner.nextLine();
            System.out.println("Beleza, " + author + " digite aqui sua messagem: ");
            
            while (true) {  
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                for (String m: server.getMessages())
                {
                    System.out.println(m);
                }
                System.out.print("[" + author + "]: ");             
                message = scanner.nextLine();
                server.sendMessage("[" + author + "]: " + message);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        
    }
    
}
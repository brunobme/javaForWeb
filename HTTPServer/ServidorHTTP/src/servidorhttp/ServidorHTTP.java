package servidorhttp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.ServerSocket; 
import java.net.Socket; 
import java.io.InputStream; 
import java.io.OutputStream;

package servidorhttp;

/**
 *
 * @author BBM
 */
public class ServidorHTTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            // cria um socket e associa a porta 9999
            ServerSocket serversocket = new ServerSocket(9999); 
            while (true) {
                System.out.println("Servidor em execução... \nAguardando conexão...");
                Socket socket = serversocket.accept(); // aguarda conexao do cliente
                      // para o recebimento e envio de msg atraves do socket
                InputStream in = socket.getInputStream(); 
                OutputStream out = socket.getOutputStream(); 
                byte[] requisicao = new byte[100];
                
                in.read(requisicao); // recebe uma msg de requisicao do cliente 
                String msgReq = new String(requisicao); 
                System.out.println("Mensagem recebida: " + msgReq);
                    // identificar o recurso solicitado (quebrar a msg de
                    // para descobrir o recurso (pagina HTML)
                    // criar a resposta HTTP (construir o header e o corpo da msg
                    // resposta) -chamar o metodo
                    // envia a resposta ao cliente
                    // fechando a conexão com o cliente
                socket.close();
            }
        } catch (Exception err) {
              System.err.println(err);
        }
    }   

    public static String geraRespostaHTTP(String recurso) {
        StringBuilder resposta = new StringBuilder();
        // Criando o header, a primeira linha deve devolver o codigo 200 OK 
        resposta.append("HTTP/1.1 200 OK").append("\n"); 
        resposta.append("Server: Test Server").append("\n"); 
        resposta.append("Connection: Close").append("\n"); 
        resposta.append("Content-Type: text/html; charset=ISO-8859-1").append("\n");
        resposta.append("index.html\n");
        // fazer a leitura do arquivo html de acordo com o recurso solicitado,
        // incluindo-o no corpo da msg de resposta
        return resposta.toString(); 
    }
}

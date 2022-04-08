/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketjava;

import java.net.*;
import java.io.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author:Trattorino
 *
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServerSocket serverSocket;
        try {
            serverSocket=new ServerSocket(2000);
            //serverSocket.accept();
            
            Socket socket=serverSocket.accept();
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("Ciao Client sono trattorino UwU\n");
            bw.flush();
            
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg=br.readLine();
            System.out.println(msg);
            if(msg.equals("Mi potresti dare la data?")) {
                bw.write("data che hai chisto: " + LocalDate.now().toString() + "\n");
                bw.flush();
            }
            
            
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

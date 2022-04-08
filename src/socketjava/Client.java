/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketjava;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author:Trattorino
 *
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket socket;
        try {
            socket=new Socket("127.0.0.1",2000);
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

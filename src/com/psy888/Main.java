package com.psy888;

import com.sun.security.ntlm.Client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try (
                ServerSocket serverSocket = new ServerSocket(6789);
                Socket cli = serverSocket.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(cli.getInputStream()));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cli.getOutputStream()))
        ) {
            bw.write("Hello From Srv Pasha "+ "\n");
            bw.flush();
            do {

                String msgFromCli = br.readLine();
                System.out.println(msgFromCli);
            }while (true);
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }
}

package com.example.averla;
import java.io.*;
import java.io.IOException;
import java.io.PrintStream;


public class Apend implements Appendable{

    @Override
    public Appendable append(CharSequence csq) throws IOException {
        PrintStream wt = new PrintStream(new File("C:\\Users\\andyd\\OneDrive\\Documents\\Ac.txt"));


        return wt.append(csq);
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        PrintStream wt = new PrintStream(new File("C:\\Users\\andyd\\OneDrive\\Documents\\MADA.txt"));
        wt.flush();

        return wt.append(csq, start, end);
    }

    @Override
    public Appendable append(char c) throws IOException {

        PrintStream wt = new PrintStream(new File("C:\\Users\\andyd\\OneDrive\\Documents\\MADA.txt"));
        wt.flush();

        return wt.append(c);
    }

    public static void printChsequence(CharSequence csa) throws IOException {


        PrintStream wt = new PrintStream(new File("C:\\Users\\andyd\\OneDrive\\Documents\\Ac.txt"));
        wt.append(csa);
        wt.close();

    }

    public static String  FileChsequence() throws IOException {


        //File f = new File("C:\\Users\\andyd\\OneDrive\\Documents\\MADA.txt");

        DataInputStream input = new DataInputStream(System.in);
        return input.readLine();

    }

}


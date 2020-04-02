
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Runner
{
    
    //private TextField sendField, recField;
    public static void main(String[] args) throws Exception {
    boolean done = false;
        while (!done){
            String answer;
            Scanner scan = new Scanner(System.in);
            System.out.print("Type 'S' for server side or 'C' for client side:\n");
            answer = scan.next();
            if (answer.equalsIgnoreCase("S")){
                ServerGUI myRun = new ServerGUI();
                myRun.UserInterface();
                done = true;
            }
            else if (answer.equalsIgnoreCase("C")){
                ClientGUI myRun = new ClientGUI();
                myRun.UserInterface();
                done = true;
            }
    }
    }
    
    
    /*
    private void sendServer()
    {
        System.out.println("This is sending to other pc");   
    }*/
}

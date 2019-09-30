
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASHISH
 */
public class Demoo {
    public static void main(String[] args) throws IOException {
        String prg = "import sys";
        BufferedWriter out = new BufferedWriter(new FileWriter("path/a.py"));
out.write(prg);
out.close();
Process p = Runtime.getRuntime().exec("python path/a.py");
BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
String ret = in.readLine();
System.out.println("value is : "+ret);
    }
    
}

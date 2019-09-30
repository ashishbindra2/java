
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
    import java.io.*;


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

    public static void main(String[] args)
    { 
        try 
        {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec("cmd /c D:\\[000408].mp4");
            p.waitFor();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
            p.waitFor();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}


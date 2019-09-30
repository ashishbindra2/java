/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoo;

import java.io.IOException;

public class test1
{
public static void main(String[] args)
{ 
try 
{
Runtime r = Runtime.getRuntime();
Process p = r.exec("C:\\Users\\ASHISH\\Desktop\\max.py");
p.waitFor();
} 
catch (IOException | InterruptedException e) 
{
    System.out.print(e);
}
}
}
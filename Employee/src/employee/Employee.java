/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author ASHISH
 */
public class Employee {
private String name ;
private String gender;
 Employee(){

 }
public String getname(){
    return "ashish";
}

    public String getgender()
    {
    return "idre";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int x = 0;
     do
     {
         x++;
         System.out.println(x);
         if(++x<5)
             continue;
         x++;
         System.out.println(x);
     }while(++x<10);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wojtek
 */
public class SerialisationArrayList {
    
    ArrayList<String> al = new ArrayList<String>();
   
    public SerialisationArrayList() {
               
    }
    
    public void Serializuj() throws FileNotFoundException, IOException
    {
         al.add("Hello");
       al.add("Hi");
       al.add("Howdy");
       
       FileOutputStream fos= new FileOutputStream("myfile");
       ObjectOutputStream oos= new ObjectOutputStream(fos);
       oos.writeObject(al);
       oos.close();
       fos.close();
    }
    
    public void Deserializuj() throws IOException, ClassNotFoundException
    {
            FileInputStream fis = new FileInputStream("myfile");
            ObjectInputStream ois = new ObjectInputStream(fis);
            al = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
            
            for(String tmp: al){
            System.out.println(tmp);
        }
    }
    
        
    
}

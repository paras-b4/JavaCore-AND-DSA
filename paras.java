/* 
import java.io.*;

class paras
{
    public static void main(String[] args) throws IOException {
        // user input using bufferedreader
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
        
        String name =" ";
        while ((!name.equals("paras"))) {
            
        
        System.out.println("enter your name");
        name=bf.readLine();
        
        System.out.println("welcome " + name);
        }
        System.out.println("exit");




    }
}*/
    /* 
import java.io.*;

class paras
{
    public static void main(String[] args) throws IOException {
        // user input using bufferedreader
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
        
        System.out.println("enter your name");
        String name=bf.readLine();
        System.out.println("welcome " + name);
        bf.close();
        in.close();




    }
}C:\Users\PARAS YADAV\OneDrive\Desktop\abc
*/


import java.io.*;

import Access_Modifier.*;
class paras
{
    

    public static void main(String[] args) throws IOException {
        
        // user input using bufferedreader
        FileReader in =new FileReader("abc.java");
        BufferedReader bf= new BufferedReader(in);
        
       int i;
       while ((i=bf.read())!=-1) {
        System.out.println((char)i);
        
       }
        
        bf.close();
        in.close();




    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Nautiyal
 */
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
    public static void main(String args[]) throws IOException
    {
        int c=0,num,multipleof5;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            multipleof5 = 5;
            c=0;
            num = s.nextInt();
                while((num/multipleof5)>=1){
                    
                        c+= num/multipleof5;
                    multipleof5 = multipleof5 * 5;
                }
            System.out.println(c);
        }
    }
    
    
} 

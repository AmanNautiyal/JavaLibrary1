/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Nautiyal
 */
import java.io.*;
import java.util.*;
public class ZeroFact 
{
 static int zerofact(int n)
 {
  int c=0,r=1,j=5;
  while(r>0)
  {   
   r=n/j;
   c+=r;
   j*=5;
  }
  return c;
 }
 public static void main(String args[]) throws IOException
 {
  int ar[],n,i;
  Scanner S=new Scanner(System.in);
  n=S.nextInt();
  ar = new int[n];
  for(i=0;i<n;i++)
  {
   ar[i]=zerofact(S.nextInt());
  }
  S.close();
  System.out.println("\n\n");
  for(i=0;i<n;i++)
  {
   System.out.println(ar[i]);
  }
 }
}

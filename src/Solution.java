
import java.util.*;


public class Solution {

    public static void main(String[] args)
    {
        Contacts str=new Contacts("0");
        int i=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add"))
             {
                if(i==0)
                {
                    str.set_name(contact);
                    i++;
                }
                else
                 str=str.add(contact,str);
            }
            else if(op.equals("find"))
              System.out.println(str.find(contact,str));
        }
    }
   static class Contacts
     {
        String name;
        Contacts next;
        public Contacts(String n)
        {
             name=n;
        }
        private void set_name(String n)
            {
            name=n;
        }
        private void set_next(Contacts obj)
            {
             next=obj;
        }
        private Contacts add(String nm,Contacts start)
        {
             Contacts nc= new Contacts(nm);
             nc.next=start;
            return nc;
        }
        int find(String part,Contacts start)
         {
            int i=0;
            Contacts ptr=start;
            int l=part.length();
            while(ptr!=null)
              {
               if(ptr.name.equals(part) || ptr.name.startsWith(part))
                i++;   
            }
            return i;
        }
    }
}

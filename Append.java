package dsaList;
import java.util.*;
public class Append {
	  
		    class node{
		        int data;
		        node next;
		        node(int d)
		        {
		            data=d;
		        }
		    }
		    node head;
		    node temp;
		    
		    void insert(int data)
		    {
		        node nn=new node(data);
		        if(head==null)
		        {
		            head=nn;
		            temp=nn;
		        }
		        else
		        {
		            node f=head;
		            while(f!=null)
		            {
		            if(data==f.data)
		            {
		                return;
		            }
		            f=f.next;
		        }
		        temp.next=nn;
		        temp=nn;
		    }
		    }
		    void display()
		    {
		        temp=head;
		        while(temp!=null)
		        {
		            System.out.println(temp.data);
		            temp=temp.next;
		        }
		      
		    }
	     public static void main(String[] args) {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner sc=new Scanner(System.in);
		        Append z=new Append();
		        int n=sc.nextInt();
		        while(true)
		        {
		        	if(n<0)
	                {
	                  break;
	                }
	              z.insert(n);
		        }
		        z.display();
		        
		    }
	  }




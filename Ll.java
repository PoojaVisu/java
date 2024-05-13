package dsaList;
import java.util.*;
public class Ll {
	

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
	            System.out.print(temp.data+" ");
	            temp=temp.next;
	        }
	        System.out.print("\n");
	    }
	    void mid()
	    {
	    	node slow=head;
	    	node fast=head;
	    	while(fast!=null && fast.next!=null)
	    	{
	    		slow=slow.next;
	    		fast=fast.next.next;
	    	}
	    	System.out.println(slow.data);
	    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);
	        Ll z=new Ll();
	        
	        while(true)
	        {
	        	
	           while(sc.hasNextInt())
	            {
	        	   int n=sc.nextInt();
	        	   z.insert(n);
	            }
	            break;
	        }
	        z.display();
	        z.mid();
	    }
	}





package queue;
import java.util.*;
public class Implementation {
	class node
	{
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
		if(head==null) {
			head=nn;
			temp=nn;
		}
		else
		{
			temp.next=nn;
			temp=nn;
		}
	}
	void del()
	{
		node a;
		a=head;
		head=head.next;
		a.next=null;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Implementation z=new Implementation();
		int count=0;
		while(true)
		{
			int n=sc.nextInt();
			if(n==-1)
			{
				break;
			}
			z.insert(n); 
			
			 count++;
		}
		z.del();
		z.display();
		System.out.print(count);
		

	}

}

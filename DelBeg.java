package dsaList;
import java.util.*;
public class DelBeg {
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
		if(head==null)
		{
			head=nn;
			temp=nn;
		}
		else
		{
			temp.next=nn;
			temp=nn;
		}
	}
	
	void delete()
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DelBeg z=new DelBeg();
		while(true)
		{
			int n=sc.nextInt();
			if(n==-1)
			{
				break;
			}
			z.insert(n);
		}
		z.delete();
		z.display();

	}

}

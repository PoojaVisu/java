package dsaList;
import java.util.*;
public class DelLastSec {
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
		node slow=head;
		temp=head;
		if(head.next==null)
		{
			System.out.print("Deletion of second last element is not possible");
		}
		else
		{
		node fast=head.next;
		while(fast.next!=null)
		{
			temp=slow;
			slow=slow.next;
			fast=fast.next;
		}
		
			temp.next=fast;
			slow=null;
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DelLastSec z=new DelLastSec();
		while(true)
		{
			int n=sc.nextInt();
			if(n==-1)
			{
				break;
			}
			z.insert(n); 			
			
		}
		z.del();

	}

}


package dsaList;
import java.util.*;
public class MergeSortedList {
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
	void display()
	{
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MergeSortedList z=new MergeSortedList();
		MergeSortedList o=new MergeSortedList();
		int c;
		int a,b;
		System.out.print("enter a ");
		a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.print("enter ele in 1st list");
			int n1=sc.nextInt();
			z.insert(n1); 		
		}
		System.out.print("enter b ");
		b=sc.nextInt();
		for(int i=0;i<b;i++)
		{
			System.out.print("enter ele in 2nd list");
			int n2=sc.nextInt();
			o.insert(n2); 		
		}
	    c=a+b;
		z.display();
		System.out.print("\n");
		o.display();
	}
	
	
}	



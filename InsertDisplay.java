package dsaList;
import java.util.*;
public class InsertDisplay {
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
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print("\n");
		}
		void max() {
			temp=head;
			int maxi=head.data;
			while(temp.next!=null)
			{
				temp=temp.next;
				if(maxi<temp.data)
				{
					maxi=temp.data;
				}
			}
			System.out.print(maxi);
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			InsertDisplay z=new InsertDisplay();
			while(true)
			{
				int n=sc.nextInt();
				if(n==-1)
				{
					break;
				}
				z.insert(n); 
				
				
			}
			z.display();
			
			z.max();

		}

	}




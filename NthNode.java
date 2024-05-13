package dsaList;

import java.util.Scanner;

import dsaList.InsertDisplay.node;

public class NthNode {
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
	void display(int a)
	{
		temp=head;
		
		for(int i=0;i<=a;i++)
		{
			
			if(i==a)
			{
				System.out.print(temp.data);
			}
			
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		NthNode z=new NthNode();
		while(true)
		{
			int n=sc.nextInt();
			if(n==-1)
			{
				break;
			}
			z.insert(n); 
			
			
		}
		System.out.print("Enter the node to be printed");
		int a=sc.nextInt();
		z.display(a);
	}

	}



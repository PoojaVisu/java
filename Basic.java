package stack;
import java.util.*;
public class Basic {
	//Scanner sc=new Scanner(System.in);
	int arr[];
	Basic(int arrsize)
	{
		arr=new int[arrsize];
	}
	
	int t=-1;
		void push(int data)
	{
		
				if(t!=arr.length-1)
					arr[++t]=data;
				 
				else
					System.out.print("Stack is empty");
					
			}
			void peek()
			{
				if(t!=-1)
					 System.out.print(arr[t]);
				else
					System.out.print("Stack is empty");		
			}
			void pop()
			{
				t--;
			}
			void display()
			{
				if(t==-1)
					System.out.print("Stack is empty");
				for(int i=t;i>=0;i--)
				{
					System.out.print(arr[i]);
				}
					
					
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int arrsize=sc.nextInt();
		Basic z=new Basic(arrsize);
		System.out.print("Enter no of choices");
		int noOfChoice=sc.nextInt();
		int data;
		for(int i=0;i<noOfChoice;i++)
		{
			System.out.print("enter choice");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.print("enter data to insert");
			    data=sc.nextInt();
				z.push(data);
			}
			else if(ch==2)
			{
				z.pop();
			}
			else if(ch==3)
			{
				z.peek();
			}
			else if(ch==4)
			{
				z.display();
			}
		}

		

	}

}

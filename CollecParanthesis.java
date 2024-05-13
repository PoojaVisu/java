package stack;
import java.util.*;
public class CollecParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CollecParanthesis z=new CollecParanthesis();
		String data=sc.next();
		int n=data.length();
		Stack <Character> s=new Stack<>();
		for(int i=0;i<n;i++)
		{
			char ch=data.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
			{
				s.push(ch);
			}
			else
			{
				if(s.isEmpty())
				{
					System.out.print("False");
					return;
				}
				char cpop=s.pop();
				if(ch==')'&&cpop=='(' || ch=='}'&&cpop=='{'||ch==']'&&cpop=='[');
				else
				{
					System.out.print("False");
					return;
				}
				
				
			}
		}
		
		

	}

}

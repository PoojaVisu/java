package stack;
import java.util.*;
public class Paranthesis {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Paranthesis z=new Paranthesis();
		char stack[]=new char[1000];
		while(sc.hasNext())
		{
			char ch=sc.charAt();
			if(ch.equals('{')|| ch.equals('[')||ch.equals('('))
			{
				z.push();
			}
			else
			{
				z.pop();
			}
			
		}

	}

}

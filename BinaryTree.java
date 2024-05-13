package tree;

import java.io.*;
import java.util.*;

public class BinaryTree {
	 Queue<node> q=new LinkedList<>();
    static class node{
        int data;
        node left;
        node right;
        node(int d){
            data=d;
        }
        
    }
   static node head;
   static node temp;
   
     void inorder(node head)      //inorder
     {
    	 //System.out.print("INORDER");
        if(head==null)
            return;
        inorder(head.left);
        System.out.print(head.data+" ");
        inorder(head.right);
    }
     
     void preorder(node head)      //preorder
     {
    	// System.out.print("PRE ORDER");
        if(head==null)
            return;
        System.out.print(head.data+" ");
        preorder(head.left);  
        preorder(head.right);
    }
     
     void postorder(node head)      //postorder
     {
    	// System.out.print("POST ORDER");
        if(head==null)
            return;
        
        postorder(head.left);  
        postorder(head.right);
        System.out.print(head.data+" ");
    }
     
     void levelorder(node head)
     {
    	 //System.out.print("LEVEL ORDER");
    	 System.out.print(head.data+" ");
    	 q.add(head);
    	 while(!q.isEmpty())
    	 {
    		 
    		 node v=q.poll();
    		 if(v.left!=null)
    		 {
    			 System.out.print(v.left.data+" ");
    			 q.add(v.left);
    		 }
    		 if(v.right!=null)
    		 {
    			 System.out.print(v.right.data+" ");
    			 q.add(v.right);
    		 } 		 
    	 }
     }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a[] =in.nextLine().split(" ");
        int i=0;
        BinaryTree z=new BinaryTree();
        Queue<node> q=new LinkedList<>();
        //node head,root;
        node nn=new node (Integer.parseInt(a[i++]));
        //node nn=new node(data);
        head=nn;
        q.add(nn);
        
        while(!q.isEmpty())
        {
            node v=q.poll();
            int d=Integer.parseInt(a[i++]);
            if(d!=-1){
            	nn=new node(d);
                v.left=nn;
                q.add(nn);
            }
            
            d=Integer.parseInt(a[i++]);
            if(d!=-1){
            	nn=new node(d);
                v.right=nn;
                q.add(nn);
            }
            
            }
        
        z.inorder(head);
        System.out.print("\n");
        z.preorder(head);
        System.out.print("\n");
        z.postorder(head);
        System.out.print("\n");
        z.levelorder(head);
        
    }
}
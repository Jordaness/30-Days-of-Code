//Task is listed here - https://www.hackerrank.com/challenges/30-binary-search-trees/problem

import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{

  public static int getHeight(Node root){
      //Write your code here
       int rheight = 0;
       int lheight = 0;
       
       //checking for the height of the tree
       if(root.left != null) { 
             lheight = getHeight(root.left) + 1; 
         } 
       if (root.right != null) { 
             rheight = getHeight(root.right) + 1; 
         } 

        if(rheight > lheight)
           return rheight;
        else
            return lheight;
  }
  
  public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
   }
   
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}

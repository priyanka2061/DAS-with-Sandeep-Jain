package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }

}

public class zikzak {
   
        static  public void  zigzagLevelOrder(Node root) {
            List<List<Integer>>result=new ArrayList<>();
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            int j=1;
            if(root==null)
            {
                return;
            }
            while(!q.isEmpty())
            {
             List<Integer>list=new ArrayList<>();
                int size=q.size();
                if(j%2!=0)
                {
                for(int i=0;i<size;i++)
                {
                  Node temp=q.peek();
                  list.add(temp.data);
                  q.remove();
                     if(temp.right!=null) q.add(temp.right);
                    if(temp.left!=null) q.add(temp.left);
                     
                }
                }
                else
                {
                for(int i=0;i<size;i++)
                {
                    Node temp=q.peek();
                    list.add(temp.data);
                    q.remove();
                   if(temp.left!=null) q.add(temp.left);
                     if(temp.right!=null)  q.add(temp.right);
                       
                }
               
                }
                 result.add(new ArrayList<>(list));
               j++;
            }
           
          for(List<Integer>i:result)
          {
            System.out.println(i);
          }
            
        }
        public static void main (String args[])
    {
        nodeSum obj=new nodeSum();
         Node root=new Node(-10);
         root.left=new Node(9);
         root.right=new Node(20);
         root.right.left=new Node(15);
         root.right.right=new Node(7);
        
         zigzagLevelOrder( root);

    }
    }   


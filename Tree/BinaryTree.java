package Tree;

import java.lang.reflect.Array;
import java.util.*;



class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        if (root == null) {
            return;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int s = q.size();
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < s; i++) {

                Node temp = q.poll();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
                ls.add(temp.data);
            }
            arr.add(new ArrayList<>(ls));
        }
        for (ArrayList<Integer> i : arr) {
            System.out.println(i);
        }
    }

    static void Iterativepreoder(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);
        if (root == null)
            return;
        while (!st.isEmpty()) {
            Node temp = st.pop();
            System.out.print(temp.data + " ");
             if (temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
           
           

        }
    }
static void iterativeInoder(Node curr)
{
   
    ArrayList < Integer > inOrder = new ArrayList < > ();
    Stack < Node > s = new Stack < > ();
    while (true) {
        if (curr != null) {
            s.push(curr);
            curr = curr.left;
        } else {
            if (s.isEmpty()) break;
            curr = s.peek();
            System.out.print(curr.data+" ");
            s.pop();
            curr = curr.right;
        }
    }
    // for(Integer i:inOrder)
    // {
    //     System.out.print(i+" ");
    // }
}

static void iterativePostorder(Node root)
{
    // Node temp=root;
    Stack<Node>st=new Stack<>();
   
    // if(root==null)
    //   {
    //       return list;
    //   }
      while(root!=null || !st.isEmpty())
      {
          if(root!=null)
          {
            st.push(root);
            root=root.left;
           
          }
          else
          {
              Node temp=st.peek().right;
              if(temp!=null)
              {
                  temp=st.pop();
                //   list.add(temp.data);
                System.out.println(temp.data);
                  while(!st.isEmpty() && temp==st.peek().right)
                  {
                      temp=st.peek();
                    //   list.add(temp.data);
                    System.out.println(temp.data);
                      st.pop();
                  }
              }
              else
              {
                  root=temp;
              }
         
       }
       
    }  
}
    static void InorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        InorderTraversal(root.left);
        System.out.print(root.data + " ");
        InorderTraversal(root.right);

    }

    static void PreoderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreoderTraversal(root.left);
        PreoderTraversal(root.right);

    }

    static void PostOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data + " ");

    }
    public static void levelOrder(Node root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null)
        {
            return;
        }
         Stack<Node> odd=new Stack<>();
         Stack<Node>even =new Stack<>();
         int i=1;
         odd.add(root);
         while(!odd.isEmpty() || !even.isEmpty())
         {
             List<Integer>l=new ArrayList<>();
              if(i%2!=0)
              {
                  while(!odd.isEmpty())
                  {
                      Node temp=odd.pop();
                     if(temp.left!=null) even.add(temp.left);
                     if(temp.right!=null) even.add(temp.right);
                      l.add(temp.data);
                  }
              
              }
              else
              {
                   while(!even.isEmpty())
                  {
                      Node temp=even.pop();
                      if(temp.left!=null)odd.add(temp.left);
                      if(temp.right!=null)odd.add(temp.right);
                      l.add(temp.data);
                  }
              }
                 list.add(new ArrayList<>());
                 i++;
                 if(even.isEmpty() && odd.isEmpty())
                 {
                    break;
                 }
         }
    }

    public static void main(String args[]) {
        Node root = new Node(1);
       
        root.right = new Node(2);
        // root.left.left = new Node(5);
        root.right.left= new Node(3);
        System.out.println("Inorder Traversal");
        InorderTraversal(root);
        System.out.println(" \npreorder Traversal");
        PreoderTraversal(root);
        System.out.println("\npostorder Traversal");
        PostOrderTraversal(root);
        System.out.println("\nBreath First Search Traversal");
        // System.out.print(root.data+" ");
        bfs(root);
        Iterativepreoder(root);

        System.out.println();
        levelOrder(root);
        // iterativeInoder( root);
        // System.out.println();
        iterativePostorder( root);
    }

}

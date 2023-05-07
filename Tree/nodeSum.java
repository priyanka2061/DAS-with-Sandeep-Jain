package Tree;

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
public class nodeSum {
    int left1=0;
    int right1=0;
    int findmaxsum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left!=null)
        {
            left1= findmaxsum(root.left)+root.left.data;
        }
        else{
            left1= findmaxsum(root.left);
        }
       if(root.right!=null)
       {
        right1= findmaxsum(root.right)+root.right.data;
       }
       else{
        right1= findmaxsum(root.right);
    }
        return root.data+Math.max(left1,right1);
            
        }
    
    public static void main (String args[])
    {
        nodeSum obj=new nodeSum();
         Node root=new Node(-10);
         root.left=new Node(9);
         root.right=new Node(20);
         root.right.left=new Node(15);
         root.right.right=new Node(7);
          int k=obj.findmaxsum(root);
          System.out.println(k);

    }
}

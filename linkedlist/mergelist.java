class ListNode {
     int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class mergelist{
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if (l1 == null && l2 == null) {
           return null;
       }
       if (l1 == null) {
           return l2;
       }
       if (l2 == null) {
           return l1;
       }
       ListNode result = new ListNode(0);
       ListNode prev = result;
       while (l1 != null && l2 != null) {
           if (l1.val <= l2.val) {
               prev.next = l1;
               l1 = l1.next;
           } else {
               prev.next = l2;
               l2 = l2.next;
           }
           prev = prev.next;
       }
       if (l1 != null) {
           prev.next = l1;
       }
       if (l2 != null) {
           prev.next = l2;
       }
       return result.next;
   }

   public static void main (String args[])
   {
    ListNode head=new ListNode(0);
    ListNode temp=head;
    temp=new ListNode(3);
    temp=temp.next;
    temp=new ListNode(1);
    temp=temp.next;
    temp=new ListNode(0);
    temp=temp.next;
    temp=new ListNode(9);
    mergeTwoLists(ListNode l1, ListNode l2)

   }
} 

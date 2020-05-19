package list;

import java.util.HashSet;

/**
 * @ClassName review
 * @MethodDesc: LeetCode复习
 * @Author Movle
 * @Date 5/19/20 8:07 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class review {
    public static void main(String[] args) {

    }
    public static ListNode removeDuplicateNodes(ListNode head){
     if(head==null){
         return null;
     }

     ListNode pre = new ListNode(0);

     ListNode current = head;
     pre.next=head;

     HashSet<Integer> set = new HashSet<Integer>();

     while(current!=null){
         if(!set.contains(current.val)){
             pre=current;
             set.add(current.val);

         }else {
             pre.next=current.next;
         }

         current=current.next;
     }
     return head;

    }

    public static int kthToLast(ListNode head,int k){
        ListNode p = head;

        for(int i=0;i<k;i++){
            p=p.next;
        }

        while(p!=null){
            p=p.next;
            head=head.next;
        }

        return head.val;

    }
    public static void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }

}

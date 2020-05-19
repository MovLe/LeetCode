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


    public static ListNode partition(ListNode head,int x){
        ListNode preHead = new ListNode(-1);
        ListNode nextHead = new ListNode(-1);

        ListNode preCurrent = preHead;
        ListNode nextCurrent= nextHead;
        ListNode current = head;

        while(current!=null){
            if(current.val<x){
                preCurrent.next=current;
                preCurrent=preCurrent.next;
            }else {
                nextCurrent.next=current;
                nextCurrent = nextCurrent.next;
            }
            current=current.next;
        }

        preCurrent.next=nextHead.next;
        nextCurrent.next=null;

        return preHead.next;
    }

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        ListNode newHead = new ListNode(-1);

        ListNode p =newHead;


        int jinWei=0;
        while(l1!=null&&l2!=null){
            int sum = l1.val+l2.val+jinWei;
            p.next=new ListNode(sum%10);
            jinWei=sum/10;

            p=p.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum = l1.val+jinWei;
            p.next=new ListNode(sum%10);
            jinWei=sum/10;

            p=p.next;
            l1=l1.next;
        }

        while(l2!=null){
            int sum = l2.val+jinWei;
            p.next=new ListNode(sum%10);
            jinWei=sum/10;

            l2=l2.next;
            p=p.next;

        }

        if(jinWei==1){
            p.next=new ListNode(jinWei);
        }
        return newHead.next;


    }
}

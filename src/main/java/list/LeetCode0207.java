package list;

/**
 * @ClassName LeetCode0207 链表相交
 * @MethodDesc:
 * @Author Movle
 * @Date 4/12/20 7:43 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode0207 链表相交
 * 给定两个（单向）链表，判定它们是否相交并返回交点。请注意相交的定义基于节点的引用，而不是基于节点的值。
 * 换句话说，如果一个链表的第k个节点与另一个链表的第j个节点是同一节点（引用完全相同），则这两个链表相交。
 *
 */

public class LeetCode0207 {
    public static void main(String[] args) {

    }

    /**
     * 方法一 暴力法
     * 利用嵌套循环判断一个链表中的引用是否在另一个链表中存在
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntegersectionNode(ListNode headA,ListNode headB){

        if(headA==null||headB==null){
            return null;
        }
        ListNode A = headA;
        ListNode B = headB;

        while(A!=null){
            B=headB;
            while (B!=null){
                if(A==B){
                    return A;
                }
                B=B.next;
            }
            A=A.next;
        }

        return null;
    }

    /**
     * 解法二
     * 将一个链表的所有引用存储在list中
     * 再判断另一个链表中的引用是否存在与前一个链表相同的引用
     */
    public static ListNode getIntegersectionNode2(ListNode headA,ListNode headB){
        if(headA==null||headB==null){
            return null;
        }
        List<ListNode> list = new LinkedList<ListNode>();

        while(headA!=null){
            list.add(headA);
            headA=headA.next;
        }

        while(headB!=null){
            if(list.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }

        return null;
    }
}

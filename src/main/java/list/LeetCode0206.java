package list;

/**
 * @ClassName LeetCode0206 回文链表
 * @MethodDesc:
 * @Author Movle
 * @Date 4/11/20 10:22 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode0206 回文链表
 * 编写一个函数，检查输入的链表是否是回文的
 */

public class LeetCode0206 {
    public static void main(String[] args) {

    }

    /**
     * 解法一
     * 首先生成新的反转head的链表newHead
     * 然后判断两个链表是否相等即可
     * 若相等则是回文链表，否则不是
     */
    public static boolean isPalindrome(ListNode head){
        ListNode newHead =reverseAndClone(head);

        return isEquals(head,newHead);
    }

    /**
     * 翻转和克隆链表
     */
    public static ListNode reverseAndClone(ListNode node){
        ListNode head = null;
        //     n                     n
        //node:1->2->3->4    head:1<-2<-3<-4
        while(node!=null){
            //复制
            ListNode n = new ListNode(node.val);
            n.next=head;
            head=n;

            node=node.next;
        }
        return head;
    }

    /**
     * 判断链表是否相等
     * @param l1
     * @param l2
     * @return true/false
     */
    public static boolean isEquals(ListNode l1,ListNode l2){

        while(l1!=null&&l2!=null){
            if(l1.val!=l2.val){
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }

        return l1==null&&l2==null;
    }
}



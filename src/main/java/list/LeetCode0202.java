package list;

/**
 * @ClassName LeetCode0202 返回倒数第 k 个节点
 * @MethodDesc:
 * @Author Movle
 * @Date 4/11/20 10:20 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode0202 返回倒数第 k 个节点
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值
 */

public class LeetCode0202 {
    public static void main(String[] args) {

    }

    /**
     * 解法一双指针法
     * 新建指针p，指向头结点
     * 再利用for循环，让p后移k位
     * 再利用while循环，同时使p向后移，head指针也向后移
     * 直到p指向null，即尾结点，此时head指向的就是倒数第k个结点
     * 返回此时head的val值即可
     */
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

}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
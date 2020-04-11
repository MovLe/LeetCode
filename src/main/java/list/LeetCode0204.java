package list;

/**
 * @ClassName LeetCode0204 分割链表
 * @MethodDesc:
 * @Author Movle
 * @Date 4/11/20 8:32 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode0204 分割链表
 * 编写程序以 x 为基准分割链表，使得所有小于 x 的节点排在大于或等于 x 的节点之前。
 * 如果链表中包含 x，x 只需出现在小于 x 的元素之后(如下所示)。分割元素 x 只需处于“右半部分”即可，其不需要被置于左右两部分之间。
 */


public class LeetCode0204 {
    public static void main(String[] args) {

    }

    /**
     * 解法一
     * 先创建两个头结点分别用于连接小于部分和大于等于部分
     * 遍历该链表，若当前结点小于x,将其插到小于的链表上否则插到大于链表上。
     * 遍历完毕后，将大于等于部分链表的连到小于部分的后面即可
     */
    public static ListNode partition(ListNode head,int x){
        ListNode preHead = new ListNode(-1);
        ListNode nextHead = new ListNode(-1);
        ListNode preCurrent = preHead;
        ListNode nextCurrent = nextHead;
        ListNode current = head;

        while(current!=null){
            if(current.val<x){
                //把小于x的结点放到preHead里
                preCurrent.next = current;
                preCurrent=preCurrent.next;
            }else {
                //否则放到nextHead里
                nextCurrent.next=current;
                nextCurrent=nextCurrent.next;
            }
            current=current.next;
        }
        preCurrent.next=nextHead.next;
        nextCurrent.next=null;

        return preHead.next;

    }
}

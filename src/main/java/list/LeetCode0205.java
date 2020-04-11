package list;

/**
 * @ClassName LeetCode0205
 * @MethodDesc:
 * @Author Movle
 * @Date 4/11/20 9:06 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode 0205 链表求和
 * 给定两个用链表表示的整数，每个节点包含一个数位。
 * 这些数位是反向存放的，也就是个位排在链表首部。
 * 编写函数对这两个整数求和，并用链表形式返回结果
 */

public class LeetCode0205 {
    public static void main(String[] args) {

    }

    /**
     * 解法一
     * 新建一个链表newHead,新建一个遍历JinWei，用来标识相加是否进位
     * 新建一个指针p指向newHead
     * 利用while循环遍历，
     * 当l1与l2都没有指向空时，sum=l1.val+l2.val+JinWei
     * 然后给链表newHead新增元素，p.next=new ListNode(sum%10)
     * 然后链表l1,l2,newHead指向下一位,JinWei=sum/10
     * 然后当l2遍历结束，然而l1还未结束时，循环遍历，sum=l1.val+JinWei
     * 然后链表newHead新增元素,p.next=new ListNode(sum%10)
     * 然后链表l1,newHead指向下一位,JinWei=sum/10
     * 同理，当l2未遍历结束时，与l1未遍历结束时一样，只是sum=l2.val+JinWei
     *
     * 最好判断JinWei是否为1，若JinWei==1，则还需要新建元素p.next=new ListNode(1)
     *
     * 最后返回新键的链表newHead.next即可
     *
     */
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        ListNode newHead = new ListNode(-1);
        ListNode p = newHead;

        int JinWei=0;

        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val+JinWei;
            p.next = new ListNode(sum%10);
            JinWei=sum/10;
            l1=l1.next;
            l2=l2.next;
            p=p.next;
        }
        while(l1!=null){
            int sum = l1.val+JinWei;
            p.next=new ListNode(sum%10);
            JinWei =sum/10;
            p=p.next;
            l1=l1.next;
        }

        while(l2!=null){
            int sum = l2.val+JinWei;
            p.next=new ListNode(sum%10);
            JinWei=sum/10;
            p=p.next;
            l2=l2.next;
        }

        if(JinWei==1){
            p.next=new ListNode(JinWei);
        }

        return newHead.next;
    }

    public static void printList(ListNode listNode){
        while(listNode!=null){
            System.out.print(listNode.val+" ");
            listNode=listNode.next;
        }
    }

}

package list;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode0201
 * @MethodDesc: TODO LeetCode0201功能介绍
 * @Author Movle
 * @Date 4/11/20 9:35 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode 0201 删除重复单链表中的结点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点
 */


public class LeetCode0201 {

    public static void main(String[] args) {

    }

    /**
     * 解法一 双指针法
     * 1.HashSet中存入未曾出现的元素，pre和current依次向后推进
     * 2.HashSet出现出现过的元素，使用pre和current删除重复结点
     * 3.只用单层循环即可完成目标
     */
    public static ListNode removeDuplicateNodes(ListNode head){
        if(head==null){
            return null;
        }
        ListNode pre = new ListNode(0);
        ListNode current = head;
        pre.next=head;
        Set<Integer> set = new HashSet<Integer>();
        while(current!=null){
            if(!set.contains(current.val)){
                set.add(current.val);
                pre=current;

            }else {
                pre.next=current.next;
            }
            current=current.next;
        }

        return head;
    }
}




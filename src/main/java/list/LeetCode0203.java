package list;

/**
 * @ClassName LeetCode0203 删除中间结点
 * @MethodDesc:
 * @Author Movle
 * @Date 4/11/20 11:30 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


/**
 * LeetCode0203 删除中间结点
 * 实现一种算法，删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点。
 */
public class LeetCode0203 {
    public static void main(String[] args) {

    }

    /**
     * 解法一
     * 把节点c的val变为节点d(node.next)的val，
     * 此时可以看成节点c已经变成了节点d，
     * 改变c(node)的下一个节点为e(node.next.next)
     */
    public static void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;

    }
}

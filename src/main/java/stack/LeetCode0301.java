package stack;

/**
 * @ClassName LeetCode0301
 * @MethodDesc:
 * @Author Movle
 * @Date 4/14/20 6:43 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 * LeetCode0301 三合一
 * 三合一。描述如何只用一个数组来实现三个栈
 * 你应该实现push(stackNum, value)、pop(stackNum)、isEmpty(stackNum)、peek(stackNum)方法。
 * stackNum表示栈下标，value表示压入的值。
 * 构造函数会传入一个stackSize参数，代表每个栈的大小。
 */

public class LeetCode0301 {

}
class TripleInOne{
    private int[] arr;
    private int[] stackTop;
    private int stackSize;

    /**
     * 解题思路
     * 思路
     * 定义一个数组arr，数组的位置分配规则如下：
     * 数组的下标为[0, 0 + 3, ... , 0 + 3 * (stackSize - 1)]存放stack0
     * 数组的下标为[1, 1 + 3, ... , 1 + 3 * (stackSize - 1)]存放stack1
     * 数组的下标为[2, 2 + 3, ... , 2 + 3 * (stackSize - 1)]存放stack2
     * 然后，新建一个数组stackTop，用来标记每个栈的栈顶可插入元素的下标（在arr中的下标）。
     * 当执行push操作的时候，需要处理判满，当执行pop或peek操作的时候需要处理判空。
     * 其中判空和判满都是根据stackTop来判断
     *
     */
    public TripleInOne(int stackSize){
        this.stackSize = stackSize;
        arr = new int[stackSize*3];
        stackTop = new int[]{0,1,2};
    }

    public void push(int stackNum,int value){
        int curStackTop = stackTop[stackNum];
        if(curStackTop/3==stackSize){
            return;
        }
        arr[curStackTop]=value;
        stackTop[stackNum]+=3;
    }
    public int pop(int stackNum){
        if(isEmpty(stackNum)){
            return -1;
        }
        int value = arr[stackTop[stackNum]-3];
        stackTop[stackNum]-=3;
        return value;

    }
    public int peek(int stackNum){
        if(isEmpty(stackNum)){
            return -1;
        }
        int value = arr[stackTop[stackNum]-3];
        return value;
    }

    public boolean isEmpty(int stackNum){
        return stackTop[stackNum]<3;
    }
}

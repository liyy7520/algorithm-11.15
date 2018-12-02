package com.algo.code.linklist;

/**
 * @program: algo
 * @description:
 * 1) 单链表反转
 *2) 链表中环的检测
 *3) 两个有序的链表合并
 * 4) 删除链表倒数第n个结点
 * 5) 求链表的中间结点
 * @author: liyy
 * @create: 2018-10-23 10:52
 **/
public class linkedlistAlgo {

    //单链表反转
    public static Node reverse(Node list){
        //头结点
        Node headNode = null;

        Node previousNode = null;
        Node currentNode = list;

        while (currentNode!=null){
            Node nextNode = currentNode.next;
            if(nextNode==null){
                headNode=currentNode;
            }
            currentNode.next= previousNode;
            previousNode= currentNode;
            currentNode = nextNode;
        }
        return headNode;
    }
    //检查环
    public static boolean checkCircle(Node list){
        if (list==null) return false;

        Node fast = list.next;
        Node slow = list;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow= slow.next;
            if (slow==fast)return true;
        }
        return false;
    }

    //有序链表合并
    public static Node mergeSortedList(Node la,Node lb){
        if (la==null) return lb;
        if (lb==null) return la;

        Node p = la;
        Node q= lb;
        Node headNode;
        if(q.data<p.data){
            headNode=p;
            p=p.next;
        }else{
            headNode= q;
            q=q.next;
        }
        Node r= headNode;
        while (p!=null&&q!=null){
            if (q.data<p.data){
                r.next= p;
                p= p.next;
            }else{
                r.next=q;
                q=q.next;
            }
            r= r.next;
        }
        if (p!=null){
            r.next=p;
        }else{
            r.next=q;
        }
        return headNode;
    }

    /**
     * 合并两个有序的链表
     * @param l1
     * @param l2
     * @return
     */
    public static Node mergeSortLinkList(Node l1,Node l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.data<l2.data){
            l1.next = mergeSortedList(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeSortedList(l1,l2.next);
            return l2;
        }
    }

    public Node mergeTwoLists(Node l1, Node l2) {
        Node p=l1;
        Node q=l2;

        Node t=new Node(-1,null);
        t.next=null;

        l1=t;

        while(p!=null&&q!=null){
            if(p.data<=q.data){
                t.next=p;
                t=t.next;
                p=p.next;
            }
            else{
                t.next=q;
                t=t.next;
                q=q.next;
            }

        }

        if(q==null){
            t.next=p;
        }
        else{
            t.next=q;
        }

        return l1.next;
    }



    public static Node deleteByLastk(Node list, int k){
        Node fast = list;
        int i =1;
        while(fast!=null&&1<k){
            fast = fast.next;
            i++;
        }
        if(fast==null) return list;

        Node slow = list;
        Node prev = null;

        while(fast.next!=null){
            fast = fast.next;
            prev= slow;
            slow= slow.next;
        }

        if(prev==null){
            list= list.next;
        }else{
            prev.next=prev.next.next;
        }
        return list;
    }

    public static Node findMiddleNode(Node list){
        if(list == null) return null;
        Node fast = list;
        Node slow = list;

        while (fast.next!=null&&fast.next.next!=null){
            fast= fast.next.next;
            slow=slow.next;
        }

        return slow;
    }

    public static class Node{
        private int data;
        private Node next;

        public Node(int data ,Node next){
            this.data= data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
}

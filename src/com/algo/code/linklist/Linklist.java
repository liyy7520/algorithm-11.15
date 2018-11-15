package com.algo.code.linklist;

/**
 * @program: algo
 * @description:
 * @author: liyy
 * @create: 2018-10-18 15:19
 **/
public class Linklist {

    private Node head =null;

    //删除结点
    public void deleteByNode(Node p){
        //链表为空的处理
        if (p==null||head==null)return;
        //链表只包含一个节点的处理
        if (p==head){
            head=head.next;
            return;
        }

        Node q = head;
        while (q!=null&&q.next!=p){
            q=q.next;
        }
        if (q==null)return;
        q.next= q.next.next;

    }

    public  void insertBefore(Node newNode,Node p){
        if (p==null)return;
        if (head==p){
            insertToHead(newNode);
            return;
        }

        Node q = head;
        while (q!=null&&q.next!=p){
            q= q.next;
        }

        if (q==null)return;
        newNode.next=p;
        q.next=newNode;
    }

    public void  insertAfter(Node p,Node newNode){
        if (p==null)return;
        newNode.next= p.next;
        p.next= newNode;
    }

    public Node findByValue(int value){
        Node p = head;
        while (p!=null&& p.data!=value){
            p = p.next;
        }
        return p;
    }

    public Node findByIndex(int index){
        Node p =head;
        int pop =0;
        while (p!=null&&pop!=index){
            p = p.next;
            ++pop;
        }
        return p;
    }

    public void insertToHead(Node newNode){
        if (head==null){
            head=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
    }

    public void insertToHead(int value){
        Node newNode = new Node(value,null);
        insertToHead(newNode);
    }

    public static class Node{
        private int data;
        private Node next ;

        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        public int getData(){
            return data;
        }
    }
}

package com.algo.code.linklist;

/**
 * @program: algo
 * @description:
 * @author: liyy
 * @create: 2018-10-24 17:04
 **/
public class LinkeList {

    public static Node reverse(Node list){
        Node head = null;

        Node previousNode = null;
        Node currentNode = list;
        while (currentNode!=null){
            Node next = currentNode.next;
            if(next==null){
                head= currentNode;
            }
            currentNode.next = previousNode;
            previousNode= currentNode;
            currentNode= next;

        }
        return null;
    }

    public Node mergeNode (Node l1,Node l2){
        Node head = null;

        if(l1==null)return l2;
        if(l2==null) return l1;

        Node p = l1;
        Node q = l2;
        if(p.data>q.data){
            head = q;
            q = q.next;
        }else{
            head= p;
            p = p.next;
        }
        Node r= head;


        while(p!=null&&p!=null){
            if(p.data>q.data){
                r.next= p;
                p=p.next;
            }else{

                r.next= q;
                q=q.next;
            }
        }

        if(p!=null){
            r.next=p;
        }else{
            r.next=q;
        }
        return head;
    }



    public static class Node{
        private int data;

        private Node next;

        public Node(int data,Node next){
            this.data= data;
            this.next=next;
        }

        public int getData() {
            return data;
        }
    }


    public static void main(String[] args) {

    }

}

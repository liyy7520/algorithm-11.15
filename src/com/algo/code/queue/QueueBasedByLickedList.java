package com.algo.code.queue;

/**
 * @program: algo
 * @description:
 * @author: liyy
 * @create: 2018-11-01 17:15
 **/
public class QueueBasedByLickedList {

    private Node head = null;
    private Node tail = null;

    //入队
    public void enQueue(String value){

        if(tail ==null){
            Node newNode = new Node(value,null);
            head=newNode;
            tail=newNode;
        }else{

            tail.next= new Node(value,null);
            tail = tail.next;
        }
    }
    //出队
    public String dequeue(){
        if(head==null)return null;
        String value = head.data;
        head = head.next;
        if (head.next==null){
            tail=null;
        }
        return value;
    }

    public static class Node {
        private String data;
        private Node next;

        public Node(String data ,Node next){
            this.data= data;
            this.next= next;
        }

        public String getData() {
            return data;
        }
    }
}

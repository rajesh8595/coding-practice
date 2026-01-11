package com.practice.epamProblemSolving;

//Reverse a single linked list

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode nextNode=head.next;
            head.next=prev;
            prev=head;
            head=nextNode;

        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head=reverseList(head);
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

}

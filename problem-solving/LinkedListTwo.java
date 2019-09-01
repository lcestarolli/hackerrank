import java.io.*;
import java.util.*;
import java.util.LinkedList;

class Node3{
    int data;
    Node3 next;
    Node3(int d){
        data=d;
        next=null;
    }

}
class Solution3
{

    public static Node3 removeDuplicates(Node3 head) {
        //Write your code here


        int previusNodeData = head.data;
        Node3 newNode = new Node3(head.data);
        Node3 node = newNode;
        head = head.next;

        while(head != null){

            if(previusNodeData != head.data) {
                node.next = new Node3(head.data);
                node = node.next;
            }

            previusNodeData = head.data;
            head = head.next;
        }

        return newNode;
    }

    public static  Node3 insert(Node3 head,int data)
    {
        Node3 p=new Node3(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node3 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node3 head)
    {
        Node3 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node3 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
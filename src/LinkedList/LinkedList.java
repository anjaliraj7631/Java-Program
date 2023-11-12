package LinkedList;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList {
    Node head;
    public void insert(int data,LinkedList list){
        Node new_node=new Node(data);
        if(list.head==null){
            list.head=new_node;
        }
        else {
            Node last=list.head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
    }


    public void display(LinkedList list){
        Node last=list.head;
        while (last!=null){
            System.out.println(last.data+" ");
            last= last.next;
        }
    }
}
class Main{
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insert(10,l);
        l.insert(20,l);
        l.insert(30,l);
        l.insert(40,l);
        l.display(l);
    }
}
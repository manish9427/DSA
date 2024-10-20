class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
public class LinkedList{
    Node head;

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }

        Node current = head;
        while(current.next!= null){
            current = current.next;
        }
        current.next = newNode;

    }

    public void insertAtPosition(int data,int pos){
        Node newNode = new Node(data);
        if(pos == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 0;
        while(current != null && count <pos-1){
            current = current.next;
            count++;
        }
        if(current == null){
            System.out.println("Position Out of Range: "+pos);
        }
        newNode.next = current.next;
        current.next=newNode;
    }
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " --> ");
            current=current.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.insertAtFirst(1);
        ll.insertAtLast(5);
        ll.insertAtPosition(10, 2);
        ll.display();
    }
}
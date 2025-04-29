class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class singlyLinked {

    Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void insertAtTail(int data){
        Node temp  = head;
        Node newNode = new Node(data);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;

    }

    

    public static void main(String[] args) {
        singlyLinked list = new singlyLinked();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtTail(50);
        list.printLL();
    }

}
/**
 * Created by crtaylor123 on 12/4/16.
 */
public class SinglyLinkedList {
    Node head;
    Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head){
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public SinglyLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public SinglyLinkedList(Node node){
        this.head = node;
        this.tail = node;
    }



    public void add(Node node){
        tail.next = node;
        setTail(node);
    }

    public void delete(Node node){
        boolean deleted = false;
        Node runner = head;
        while(runner.next != null || !deleted){
            if (runner.next.getKey() == node.getKey()){
                runner.setNext(node.getNext());
                deleted = true;
            }
            else runner = runner.getNext();
        }


    }

    public void delete(int x){
        boolean deleted = false;
        Node runner = head;
        while(runner.next != null || !deleted){
            if (runner.next.getKey() == x){
                runner.setNext(runner.getNext().getNext());
                deleted = true;
            }
            else runner = runner.getNext();
        }


    }

    @Override
    public String toString() {
        return "SinglyLinkedList{(" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}

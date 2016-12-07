/**
 * Created by crtaylor123 on 12/4/16.
 */
public class main {

    public static void main(String [ ] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        SinglyLinkedList ll = new SinglyLinkedList(a);
        ll.add(b);
        ll.add(c);
        ll.add(b);
        ll.add(d);
        ll.add(b);
        ll.add(e);


        System.out.println(ll.toString());

        //Ch2DeleteMiddleNode.removeNode(c);
        //Ch2RemoveDups.removeDupsNoBuffer(ll);
        System.out.println(ll.toString());



    }

}

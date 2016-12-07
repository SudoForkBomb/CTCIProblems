import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by crtaylor123 on 12/4/16.
 */
public class Ch2RemoveDups {


    static public SinglyLinkedList removeDups(SinglyLinkedList linkedList){

        HashMap values = new HashMap();
        Node node = linkedList.getHead();
        values.put(true, linkedList.head.getKey());

        while(node != null){
            Node runner = node.getNext();
            int value = runner.getKey();
            if(!values.containsKey(value)){
                values.put(true, value);
            }
            else {
                node.setNext(runner.getNext());
                runner = node.getNext();
            }


        }
        return linkedList;
    }

    static public SinglyLinkedList removeDupsNoBuffer(SinglyLinkedList linkedList){

        Node node = linkedList.getHead();


        while(node != null){
            Node runner = node.getNext();
            while(runner != null){
                if (node.getKey() == runner.getKey()){
                    linkedList.delete(runner);
                }
                runner = runner.getNext();
            }
            node = node.getNext();


        }
        return linkedList;
    }

}

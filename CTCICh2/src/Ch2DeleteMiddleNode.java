/**
 * Created by crtaylor123 on 12/4/16.
 */
public class Ch2DeleteMiddleNode {

    static public void removeNode(Node c){
        c.setKey(c.getNext().getKey());
        c.setNext(c.getNext().getNext());
    }
}

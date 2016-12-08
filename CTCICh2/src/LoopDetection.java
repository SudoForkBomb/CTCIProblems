import java.util.HashMap;

/**
 * Created by crtaylor123 on 12/7/16.
 */
public class LoopDetection {

    public Node detectLoop(SinglyLinkedList ll){

        HashMap nodes = new HashMap();
        boolean loop = false;
        Node runner = ll.getHead();

        while(!loop || runner != null){
            if(nodes.containsKey(runner.getKey())){
                loop = true;
                return runner;
            }
            else {
                nodes.put(runner.getKey(), runner);
            }
            runner = runner.getNext();
        }
        return null;
    }
}

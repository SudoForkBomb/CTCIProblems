/**
 * Created by crtaylor123 on 12/5/16.
 */
public class Ch2Intersection {

    public Node findIntersect(SinglyLinkedList linkedListOne, SinglyLinkedList linkedListTwo){
        Node runnerOne = linkedListOne.getHead();
        Node runnerTwo = linkedListTwo.getHead();

        while(runnerOne != null){
            runnerTwo = linkedListTwo.getHead();

            while(runnerTwo != null){
                if(runnerOne == runnerTwo){
                    return runnerOne;
                }
                else{runnerTwo = runnerTwo.getNext();

                }
            }
            runnerOne = runnerOne.getNext();
        }


        return null;
    }
}

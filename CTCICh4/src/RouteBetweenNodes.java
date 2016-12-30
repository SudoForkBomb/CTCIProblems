/**
 * Created by crtaylor123 on 12/29/16.
 */
public class RouteBetweenNodes {

    /* Instructions
        Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
     */

    /* Questions
        Are the nodes random?
        Is it binary, or do nodes have more than one neighbor?
        Can it be bi-directional?

      */

    /* Solution
        1.) Check to see if the node is in the other's neighbor arrays.
        2.) Recursively pass in the next node
     */

    public boolean checkRoute(Node a, Node b){

        for(int i = 0; i < a.children.length; i++ ){
            if(a.children[i] == b) {
                return true;
            }
        }
        for(int i = 0; i < b.children.length; i++ ){
            if(b.children[i] == a) {
                return true;
            }
        }
        for(int i = 0; i < a.children.length; i++ ){

        }



        return false;
    }


}

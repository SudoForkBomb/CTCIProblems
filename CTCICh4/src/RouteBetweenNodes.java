import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.System.in;

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
        Is it cyclic? pg.106
        Do I need to also check that there is a route from node b to node a?

      */

    /* Solution
        Use Breadth First Search
        Take the first node and add it to a queue.
        Then pop off the top node from queue.
        Check that it's not null, then see if any of it's adjacent nodes are visited. If not, check to see if they are node b.
        If they are node b, then return true
        Else, see if it's been visited, if not mark it visiting, then add it to the queue.
        Finally mark the top node as visited and repeat.
     */

    enum State { Unvisited, Visitied, Visiting;}

    public static boolean checkRoute(Node a, Node b) {

        if(a == b) return true;

        //MyQueue queue = new MyQueue();
        LinkedList<Node> queue = new LinkedList<Node>();
        a.state = State.Visiting;
        queue.add(a); // Add to the end of queue

        //The Solution has a Graph that you pass in and first check that all the nodes' state in the graph are set to unvisited.
        // for (Node u : graph.getNodes()){
        //    u.state = State.Unvisited; }
        ArrayList<Node> trueNodes = new ArrayList<Node>();
        trueNodes.add(a);


        while (!queue.isEmpty()) {
            Node topOfQueue = queue.remove();
            if (topOfQueue != null) {
                for (Node child : topOfQueue.children) {
                    if (child.state == State.Unvisited) {
                        if (child == b) {
                            return true;
                        }else {
                            child.state = State.Visiting;
                            trueNodes.add(child);
                            queue.add(child);
                        }
                    }
                }
                topOfQueue.state = State.Visitied;
            }
        }

        for (Node x : trueNodes){
            x.state = State.Unvisited;
        }

        return false;
    }
}

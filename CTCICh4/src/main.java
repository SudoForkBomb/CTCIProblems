import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by crtaylor123 on 12/29/16.
 */
public class main {



    public static void main(String[] args) {



        /* RouteBetweenNodes
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        a.children = new Node[]{c};
        c.children = new Node[]{d,b};
        d.children = new Node[]{a};

        b.children = new Node[]{c};

        e.children = new Node[]{f};
        f.children = new Node[]{a};
        System.out.println(RouteBetweenNodes.checkRoute(e, b));
        */


        BiNode a = new BiNode(2, null, null);
        BiNode b = new BiNode(9, null, null);
        BiNode c = new BiNode(3, a, b);
        BiNode d = new BiNode(6, null, null);
        BiNode e = new BiNode(7, d, null);
        BiNode f = new BiNode(5, c, e);

        BiNode three = new BiNode(3, null, null);
        BiNode five = new BiNode(5, null,null);
        BiNode one = new BiNode(1, null, null);
        BiNode two = new BiNode(2, one, three);
        BiNode four = new BiNode(4, two,five);


        //System.out.println(ValidateBST.validate(f));
        System.out.println(BSTSequences.printTree(four));

    }
}

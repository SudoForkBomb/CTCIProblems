import java.util.Arrays;

/**
 * Created by crtaylor123 on 12/29/16.
 */
public class Tree {
    public BiNode root;

}



class Node {
    public String name;
    public Node[] children;
    public RouteBetweenNodes.State state;

    public Node(String name) {
        this.name = name;
    }

    public Node(String name, Node[] children) {
        this.name = name;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}

class BiNode{
    public int value;
    public BiNode leftNode;
    public BiNode rightNode;

    public BiNode(int value, BiNode leftNode, BiNode rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}

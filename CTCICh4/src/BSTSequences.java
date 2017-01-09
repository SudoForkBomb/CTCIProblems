import java.util.ArrayList;

/**
 * Created by chris on 1/8/2017.
 */
public class BSTSequences {
    /* Instructions
        A binary search tree was created by traversing through an array from left to right and inserting each element.
        Given a binary search tree with distinct elements, print all possible arrays that could have led to this tree.

        EXAMPLE
        Input:      (2)
                    / \
                  (1) (3)

        Output: {2,1,3}, {2,3,1}
     */

    /* Questions
        Will the Binary Tree only have 3 nodes, or can it have more?


      */

    /* Solution
        I'm thinking the best way is to create a string and append each pattern.
     */

    static public ArrayList leftOutput = new ArrayList();
    static public ArrayList rightOutput = new ArrayList();
    public static String printTree(BiNode root){
        leftOutput.add(root.value);
        rightOutput.add(root.value);

        if(root.leftNode != null && root.rightNode != null){
            leftOutput.add(root.leftNode.value);
            leftOutput.add(root.rightNode.value);
            rightOutput.add(root.rightNode.value);
            rightOutput.add(root.rightNode.value);
            printTree(root.leftNode);
            printTree(root.rightNode);
        }
        else if(root.leftNode != null){
            leftOutput.add(root.leftNode.value);
            rightOutput.add(root.leftNode.value);
            printTree(root.leftNode);

        }
        else if(root.rightNode != null){
            leftOutput.add(root.rightNode.value);
            rightOutput.add(root.rightNode.value);
            printTree(root.rightNode);
        }

        return leftOutput.toString() + ", " + rightOutput.toString();




    }

    public static String printAnotherTree(BiNode root) {
        if (root != null) {
            leftTraversal(root);
            rightTraversal(root);
        }

        return leftOutput.toString() + ", " + rightOutput.toString();
    }


    public static void leftTraversal(BiNode root){
        if (root != null) {
            leftOutput.add(root.value);
            leftTraversal(root.leftNode);
            leftTraversal(root.rightNode);
        }
    }

    public static void rightTraversal(BiNode root){
        if (root != null) {
            rightOutput.add(root.value);
            rightTraversal(root.rightNode);
            rightTraversal(root.leftNode);
        }
    }




}

/**
 * Created by crtaylor123 on 1/2/17.
 */
public class ValidateBST {
    /* Instructions
        Implement a function to check if a binary tree is a binary search tree.
     */

    /* Questions
        Are all nodes just integers? If not, how do I determine if values are < or >?
        Can it have duplicate values? If so, are the equal values on the right or left?
        Will the Binary tree be Complete and/or Full?
      */

    /* Solution
        I have a boolean, bst, that assumes the Binary tree is also a Binary Search Tree.
        I take the tree root and then pass it to the "compare" method.
        Within the compare method, I first check to see if there is a left child node. If so, then I recursively call "validate" on the
            left child node.
        It should stop once there is no left children nodes anymore. Then I'll check for right children by recursively checking.
        I'll then begin the comparisons by checking to see if all left descendants are > the node, then if all right descendants are <= the node.
        If so, then I set the bst variable to false, saying that the Binary Tree is not a BST.
     */

    static boolean bst = true;

    public static boolean validate(BiNode root){
        compare(root);
     return bst;
    }

    public static void compare(BiNode root) {

        if (root.leftNode != null) {
            validate(root.leftNode);
        }
        if (root.rightNode != null) {
            validate(root.rightNode);
        }

        if (root.leftNode != null) {
            if (root.leftNode.value > root.value) {
                bst = false;
            }
        }
        if (root.rightNode != null) {
            if (root.rightNode.value <= root.value) {
                bst = false;
            }
        }
    }
}

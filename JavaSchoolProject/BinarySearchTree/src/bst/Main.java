package bst;

public class Main {
    public static void main(String[] args) {
        int[] keys = { 15, 10, 20, 8, 12, 16 };
        BST a=new BST();
        Node root = null;
        for (int key: keys) {
            root = a.insert(root, key);
        }

        root = a.delete(root, 16);
        a.inorder(root);

        System.out.println("Depth is " + a.calcMaxDepth(root,0));
    }
}

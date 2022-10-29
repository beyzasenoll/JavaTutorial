package bst;
public class BST {

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }

        public static Node insert(Node root, int key) {
            if (root == null) {
                return new Node(key);
            }
            if (key >= root.data) {
                root.left = insert(root.left, key);
            } else {
                root.right = insert(root.right, key);
            }
            return root;
        }


        public static Node getMinimumKey(Node current) {
            while (current.left != null) {
                current = current.left;
            }
            return current;
        }

        public static Node delete(Node root, int key) {
            if (root == null) {
                return root;
            } else if (root.data < key) {
                root.right = delete(root.right, key);
            } else if (root.data > key) {
                root.left = delete(root.left, key);
            } else {
                if (root.left == null && root.right == null) {
                    root = null;
                    return root;
                } else if (root.left == null) {
                    Node temp;
                    temp = root;
                    root = root.right;
                } else if (root.right == null) {
                    Node temp;
                    temp = root;
                    root = root.left;
                } else {
                    Node temp = getMinimumKey(root.right);
                    temp.data = root.data;
                    root.right = delete(root.right, root.data);
                }
            }
            return root;
        }
        public static int calcMaxDepth(Node root, int depthCounter){
            if(root==null){
                return depthCounter;
            }
            if(root.left==null && root.right==null){
                return depthCounter+1;
            }
            int rightCounter=calcMaxDepth(root.right,depthCounter+1);
            int leftCounter=calcMaxDepth(root.left,depthCounter+1);
            return Math.max(rightCounter,leftCounter);
        }
    }

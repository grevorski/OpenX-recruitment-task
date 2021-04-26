class BinaryTree
{
    Node root;

    BinaryTree()
    {
        root = null;
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        //create root
        tree.root = new Node(5);

        /*

              5
            /   \
          null  null     */

        tree.root.left = new Node(3);
        tree.root.right = new Node(7);

        /* 3 and 7 become left and right children of 5
               5
            /     \
          3        7
        /   \     /  \
      null null null null  */


        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        /*
                    5
                /       \
               3          7
             /   \       /  \
            2     5  null  null
          /  \    /\
        null null n n
         */
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(0);
        /*
                    5
                /       \
               3          7
             /   \       /  \
            2     5     1    0
          /  \    /\   / \  / \
        null null n n  n n  n  n
         */
        tree.root.right.right.left = new Node(2);
        tree.root.right.right.right = new Node(8);
        /*
                    5
                /       \
               3          7
             /   \       /  \
            2     5     1    0
          /  \    /\   / \  / \
        null null n n  n n  2   8
                           / \ / \
                           n n n  n
         */
        tree.root.right.right.right.right = new Node(5);
        /*
                    5
                /       \
               3          7
             /   \       /  \
            2     5     1     0
          /  \    /\   / \   /  \
        null null n n n   n  2   8
                            / \ / \
                           n  n n  5
                                  /  \
                                  n   n
         */
    }
}

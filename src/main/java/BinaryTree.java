class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }


    public void buildTree() {
        //create root
        root = new Node(5);
        /*
              5
            /   \
          null  null     */
        root.left = new Node(3);
        root.right = new Node(7);
        /* 3 and 7 become left and right children of 5
               5
            /     \
          3        7
        /   \     /  \
      null null null null  */
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        /*
                    5
                /       \
               3          7
             /   \       /  \
            2     5  null  null
          /  \    /\
        null null n n
         */
        root.right.left = new Node(1);
        root.right.right = new Node(0);
        /*
                    5
                /       \
               3          7
             /   \       /  \
            2     5     1    0
          /  \    /\   / \  / \
        null null n n  n n  n  n
         */
        root.right.right.left = new Node(2);
        root.right.right.right = new Node(8);
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
        root.right.right.right.right = new Node(5);
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
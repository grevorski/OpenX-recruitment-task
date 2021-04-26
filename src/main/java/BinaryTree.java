class BinaryTree {
    Node root;

    public void insert(int key)
    {
        root = insertRec(root, key);
    }


    private Node insertRec(Node root, int key)
    {

        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        if (key < root.getKey())
            root.left = insertRec(root.left, key);
        else if (key > root.getKey())
            root.right = insertRec(root.right, key);

        //return the (unchanged) node pointer
        return root;
    }

    public void inorder()
    {
        inorderRec(root);
    }

    private void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.getKey());
            inorderRec(root.right);
        }
    }
}
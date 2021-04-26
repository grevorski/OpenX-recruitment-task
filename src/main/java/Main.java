class Main {

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

      //  tree.inorder();
        Calculations calculations = new Calculations();
//        tree.buildTree();
        Calculations.setPtrRoot(tree.root);

        System.out.println("Sum of the binaryTree = " +
                calculations.subtreeSum(tree.root));

        System.out.println("count = " +
                calculations.averageValue(tree.root));

        System.out.println("sorted tree keys: ");
        tree.inorder();


    }
}

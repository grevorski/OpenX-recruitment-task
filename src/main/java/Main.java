class Main {

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        Calculations calculations = new Calculations();
        tree.buildTree();
        Calculations.setPtrRoot(tree.root);

        System.out.println("Sum of the binaryTree = " +
                calculations.subtreeSum(tree.root));

        System.out.println("count = " +
                calculations.averageValue(tree.root.left));

    }
}

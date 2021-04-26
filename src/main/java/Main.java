class Main {

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.buildTree();

        System.out.println("Sum of given subtree = " +
                new Calculations().subtreeSum(tree.root));

    }
}

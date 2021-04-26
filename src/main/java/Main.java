import java.util.Arrays;

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

        Calculations calculations = new Calculations();
        Calculations.setPtrRoot(tree.root);

        System.out.println("Sum of the binaryTree = " +
                calculations.subtreeSum(tree.root));

        System.out.println("count = " +
                calculations.averageValue(tree.root));


        System.out.println("median of binaryTree: " + calculations.median(tree.root));
        System.out.println("sorted tree keys: " + calculations.list);




    }
}

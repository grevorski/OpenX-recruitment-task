import org.junit.Assert;
import org.junit.Test;

public class CalculationsTest {

    @Test
    public void calculations_subtreeSum_fromRoot(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root);

        Assert.assertEquals(66,result);
    }

    @Test
    public void calculations_subtreeSum_leftRootChild(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.left);

        Assert.assertEquals(21,result);
    }

    @Test
    public void calculations_subtreeSum_leftRootChildLeftLeaf(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.left.left);

        Assert.assertEquals(1,result);
    }

    @Test
    public void calculations_subtreeSum_leftRootChildRightChild(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.left.right);

        Assert.assertEquals(17,result);
    }

    @Test
    public void calculations_subtreeSum_leftRootChildRightChildLeftLeaf(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.left.right.left);

        Assert.assertEquals(4,result);
    }

    @Test
    public void calculations_subtreeSum_leftRootChildRightChildRightLeaf(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.left.right.right);

        Assert.assertEquals(7,result);
    }

    @Test
    public void calculations_subtreeSum_rightRootChild(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right);

        Assert.assertEquals(37,result);
    }

    @Test
    public void calculations_subtreeSum_rightRootChildLeftLeaf_notExisting(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right.left);

        Assert.assertEquals(0,result);
    }


    @Test
    public void calculations_subtreeSum_rightRootChildRightChild(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right.right);

        Assert.assertEquals(27,result);
    }

    @Test
    public void calculations_subtreeSum_rightRootChildRightChildLeftLeaf(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right.right.left);

        Assert.assertEquals(13,result);
    }

    @Test
    public void calculations_subtreeSum_nullNode(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.left.left.left);

        Assert.assertEquals(0,result);
    }

    @Test
    public void calculations_size_binaryTreeSize(){
        BinaryTree testTree = new BinaryTree();
        buildTree(testTree);
        Calculations calc = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        double result = calc.averageValue(testTree.root);

        Assert.assertEquals(7.33,result,0.01);
    }

    @Test
    public void calculations_size_subTreeSize(){
        BinaryTree testTree = new BinaryTree();

        buildTree(testTree);
        Calculations calc = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        double result = calc.averageValue(testTree.root.left);

        Assert.assertEquals(4.2,result,0.01);
    }

    private static void buildTree(BinaryTree tree){
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(4);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(13);
    }


}

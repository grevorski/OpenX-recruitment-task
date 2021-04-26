import org.junit.Assert;
import org.junit.Test;

public class CalculationsTest {

    @Test
    public void calculations_subtreeSum_fromRoot(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root);

        Assert.assertEquals(38,result);
    }

    @Test
    public void calculations_subtreeSum_leftRootChild(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.left);

        Assert.assertEquals(10,result);
    }

    @Test
    public void calculations_subtreeSum_leftRootChildLeftLeaf(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.left.left);

        Assert.assertEquals(2,result);
    }

    @Test
    public void calculations_subtreeSum_leftRootChildRightLeaf(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.left.right);

        Assert.assertEquals(5,result);
    }

    @Test
    public void calculations_subtreeSum_rightRootChild(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right);

        Assert.assertEquals(23,result);
    }

    @Test
    public void calculations_subtreeSum_rightRootChildLeftLeaf(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right.left);

        Assert.assertEquals(1,result);
    }


    @Test
    public void calculations_subtreeSum_rightRootChildRightChild(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right.right);

        Assert.assertEquals(15,result);
    }

    @Test
    public void calculations_subtreeSum_rightRootChildRightChildRightChild(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right.right.right);

        Assert.assertEquals(13,result);
    }
    @Test
    public void calculations_subtreeSum_rightRootChildRightChildLeaf(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right.right.right.right);

        Assert.assertEquals(5,result);
    }
    @Test
    public void calculations_subtreeSum_nullNode(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations sum = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        int result = (int) sum.subtreeSum(testTree.root.right.right.right.right.right);

        Assert.assertEquals(0,result);
    }

    @Test
    public void calculations_size_binaryTreeSize(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations calc = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        double result = calc.averageValue(testTree.root);

        Assert.assertEquals(3.8,result,0.01);
    }

    @Test
    public void calculations_size_subTreeSize(){
        BinaryTree testTree = new BinaryTree();
        testTree.buildTree();
        Calculations calc = new Calculations();
        Calculations.setPtrRoot(testTree.root);

        double result = calc.averageValue(testTree.root.right.right);

        Assert.assertEquals(3.75,result,0.01);
    }
}
